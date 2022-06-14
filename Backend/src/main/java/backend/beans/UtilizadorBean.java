package backend.beans;

import backend.beans.locals.UtilizadorLocal;
import backend.BD.*;
import backend.message.*;
import org.hibernate.CacheMode;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import backend.JWTUtil;


import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.ArrayList;

@Stateless(name = "UtilizadorEJB")
@Local(UtilizadorLocal.class)
@Component
public class UtilizadorBean {
    public UtilizadorMessage getUtilizador(int id) {
        try {
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            if(u!=null){
                return new UtilizadorMessage(u);
            }
            else {
                return null;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public UtilizadorMessage alteraPerfil(int id,alterarUtilizadorMessage mudancas) {
        try {
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            u.setPassword(mudancas.getPassword());
            UtilizadorDAO.save(u);
            return new UtilizadorMessage(u);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public  UtilizadorMessage registaUtilizador(RegistarUtilizadorMessage novoUser) {
        try {
            Utilizador u = new Utilizador();
            u.setUsername(novoUser.getUsername());
            u.setPassword(novoUser.getPassword());
            u.setEmail(novoUser.getEmail());
            u.setAdmin(false);
            u.setSaldo(0);
            UtilizadorDAO.save(u);
            return new UtilizadorMessage(u);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public String login(AuthenticationMessage aj) {
        try{
            Utilizador u = UtilizadorDAO.loadUtilizadorByQuery("username = '" + aj.getUsername() + "'", null);
            return JWTUtil.createJWT("Grupo_Prime", "AA+SIC", 0, u);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public UtilizadorMessage depositar(int id,DepositarDinheiroMessage dinheiro) {
        try {
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            double saldo = u.getSaldo()+dinheiro.getDinheiro();
            u.setSaldo(saldo);
            UtilizadorDAO.save(u);
            return new UtilizadorMessage(u);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //getParagens no ParagemBean
    //getPerguntasFreq no PerguntasFreqBean
    public RespostaPercursoFavMessage adicionarPercursoFavorito (int id, AdicionarPercursoFavMessage apfm) {
        try {
            Percurso p = new Percurso();
            Paragem paragemInicial = ParagemDAO.listParagemByQuery("Nome = '" + apfm.getParagemInicial() + "'", null)[0];
            Paragem paragemFinal = ParagemDAO.listParagemByQuery("Nome = '" + apfm.getParagemFinal() + "'", null)[0];
            p.set_parageminicial(paragemInicial);
            p.set_paragemfinal(paragemFinal);
            PercursoDAO.save(p);
            Percurso pa = PercursoDAO.listPercursoByQuery("paragemID = '" + paragemInicial.getID() + "' AND paragemID2 = '" + paragemFinal + "'",null)[0];
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            u.percursos.add(pa);
            UtilizadorDAO.save(u);
            return new RespostaPercursoFavMessage(paragemInicial.getNome(),paragemInicial.getID(),paragemFinal.getNome(),paragemFinal.getID(),u.getID(),pa.getID());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public int removerPercursoFavorito(int id,RemoverPercursoMessage rpm) {
        try {
            Percurso p = PercursoDAO.getPercursoByORMID(rpm.getId());
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            u.percursos.remove(p);
            UtilizadorDAO.save(u);
            return 1;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    public ListaPercursosFavMessage listaPercursosFavoritos(int id) {
        try {
            ArrayList<ListaPercursoFavMessage> temp= new ArrayList<>();
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            Percurso[] lista = u.percursos.toArray();
            for (Percurso p : lista){
                ListaPercursoFavMessage lpfm = new ListaPercursoFavMessage(p.get_parageminicial().getNome(),p.get_paragemfinal().getNome());
                temp.add(lpfm);
            }
            ListaPercursosFavMessage res = new ListaPercursosFavMessage(temp);
            return res;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public RespostaParagemFavMessage adicionarParagemFavorita (int id, AdicionarParagemFavMessage apfm) {
        try {
            Paragem paragem = ParagemDAO.listParagemByQuery("Nome = '" + apfm.getNome() + "'", null)[0];
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            u.paragens.add(paragem);
            UtilizadorDAO.save(u);
            return new RespostaParagemFavMessage(paragem.getNome(),paragem.getID(),u.getID());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public int removerParagemFavorita(int id,RemoverParagemMessage rpm) {
        try {
            Paragem p = ParagemDAO.getParagemByORMID(rpm.getId());
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            u.paragens.remove(p);
            UtilizadorDAO.save(u);
            return 1;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public ListaParagensFavMessage listaParagensFavoritas(int id) {
        try {
            ArrayList<ListaParagemFavMessage> temp= new ArrayList<>();
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            Paragem[] lista = u.paragens.toArray();
            for (Paragem p : lista){
                ListaParagemFavMessage lpfm = new ListaParagemFavMessage(p.getNome(),p.getID());
                temp.add(lpfm);
            }
            ListaParagensFavMessage res = new ListaParagensFavMessage(temp);
            return res;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //decrementar saldo
    public RespostaBilheteMessage compraBilhete (int id, ComprarBilheteMessage cbm) {
        //atualizar número de viagens do Utilizador
        try {
            Viagem v = ViagemDAO.getViagemByORMID(cbm.getIdViagem(),LockMode.PESSIMISTIC_WRITE);
            if (v.getNbilhetes() > 0) {
                v.setNbilhetes(v.getNbilhetes() - 1);
                ViagemDAO.save(v);
                //Criar bilhete
                Bilhete b = new Bilhete();
                b.set_viagem(v);
                b.setChegada(cbm.getParagemFinal());
                b.setPreco(cbm.getPreco());
                b.setPartida(cbm.getParagemInicial());
                Empresa e = EmpresaDAO.loadEmpresaByQuery("Nome = '" + cbm.getNomeEmpresa() + "'", null);
                b.setEmpresa(e);
                //Meter bilhete associado ao Utilizador na BD
                Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
                u.bilhetes.add(b);
                u.setSaldo(u.getSaldo()-b.getPreco());
                UtilizadorDAO.save(u);
                return new RespostaBilheteMessage(cbm.getParagemInicial(),cbm.getHoraInicial(),cbm.getParagemFinal(),cbm.getHoraFinal(),cbm.getPreco(),cbm.getNumeroAutocarro(),cbm.getNomeEmpresa(),v.getNbilhetes(),v.getID());
            }
            else{
                v.setNbilhetes(0);
                ViagemDAO.save(v);
                return new RespostaBilheteMessage(cbm.getParagemInicial(),cbm.getHoraInicial(),cbm.getParagemFinal(),cbm.getHoraFinal(),cbm.getPreco(),cbm.getNumeroAutocarro(),cbm.getNomeEmpresa(),-1,v.getID());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public ListaBilhetesMessage listabilhetes (int id) {
        try {
            Utilizador u = UtilizadorDAO.getUtilizadorByORMID(id);
            Bilhete[] bilhetes = u.bilhetes.toArray();
            ArrayList<BilheteMessage> temp= new ArrayList<>();
            String horaInicial=null;
            String horaFinal=null;
            int numeroAutocarro=0;
            for (Bilhete b : bilhetes) {
                ParagemHora[] phs = b.get_viagem()._viagem.toArray();
                for (ParagemHora ph: phs) {
                    if (ph.getParagem().getNome().equals(b.getPartida())) {
                        horaInicial = ph.getHora();
                    }
                    else if (ph.getParagem().getNome().equals(b.getChegada())) {
                        horaFinal = ph.getHora();
                    }
                }
                Autocarro[] autocarros = b.getEmpresa().empresa.toArray();
                for (Autocarro a : autocarros) {
                    if (a._viagens.contains(b.get_viagem())){
                        numeroAutocarro = a.getNumero();
                    }
                }
                BilheteMessage bm = new BilheteMessage(b.getID(),b.getPartida(),b.getChegada(),horaInicial,horaFinal,b.getEmpresa().getNome(),b.getPreco(),numeroAutocarro,b.get_viagem().getID());
                temp.add(bm);
            }
            return new ListaBilhetesMessage(temp);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
