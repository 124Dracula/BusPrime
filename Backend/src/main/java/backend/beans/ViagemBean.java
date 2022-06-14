package backend.beans;

import backend.beans.auxiliar.PrecoComparator;
import backend.beans.auxiliar.RapidezComparator;
import backend.beans.locals.ViagemLocal;
import backend.BD.*;
import backend.message.*;
import org.orm.PersistentException;
import org.springframework.stereotype.Component;


import javax.ejb.Local;
import javax.ejb.Stateless;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

@Stateless(name = "ViagemEJB")
@Local(ViagemLocal.class)
@Component
public class ViagemBean {

    public ViagensResultantesMessage getViagens(ViagemPretendidaMessage viagem) throws PersistentException, ParseException {
        Paragem paragemInicial = ParagemDAO.listParagemByQuery("Nome = '" + viagem.getParagemInicial() + "'", null)[0];
        Paragem paragemFinal = ParagemDAO.listParagemByQuery("Nome = '" + viagem.getParagemFinal() + "'", null)[0];
        int idParagemInicial = paragemInicial.getID();
        int idParagemFinal = paragemFinal.getID();
        ViagensResultantesMessage vrm = new ViagensResultantesMessage();
        ArrayList<Viagem> v = (ArrayList<Viagem>) ViagemDAO.queryViagem("intercidades = '" + viagem.getIntercidades() + "'", null);
        for (Viagem vi : v) {
            ArrayList<ParagemHora> phs = (ArrayList<ParagemHora>) ParagemHoraDAO.queryParagemHora("ViagemID = '" + vi.getID() + "'", null);
            ParagemHora inicio = null;
            ParagemHora fim = null;
            for (ParagemHora ph : phs) {
                if (ph.getParagem().getID() == idParagemInicial) {
                    inicio = ph;
                } else {
                    if (ph.getParagem().getID() == idParagemFinal) {
                        fim = ph;
                    }
                }
            }
            if ((inicio != null) & (fim != null)) {
                DateFormat formatter = new SimpleDateFormat("hh:mm");
                Date horainicio = (Date) formatter.parse(inicio.getHora());
                Date horafim = (Date) formatter.parse(fim.getHora());
                Date horapretendida = (Date) formatter.parse(viagem.getHora());
                if (((horainicio.compareTo(horafim)) < 0) & ((horapretendida.compareTo(horainicio)) <= 0)) {
                    // String paragemInicial, String horaInicial, String paragemFinal, String horaFinal, double preco, int autocarro, String nomeEmpresa, int nBilhetes, int idViagem
                    ArrayList<Autocarro> auto = (ArrayList<Autocarro>) AutocarroDAO.queryAutocarro(null, null);
                    Autocarro autofi = auto.get(0);
                    for (Autocarro a : auto) {
                        if (a._viagens.contains(vi)) {
                            autofi = a;
                            break;
                        }
                    }
                    ArrayList<Empresa> empresas = (ArrayList<Empresa>) EmpresaDAO.queryEmpresa(null, null);
                    Empresa empfi = empresas.get(0);
                    for (Empresa emp : empresas) {
                        if (emp.empresa.contains(autofi)) {
                            empfi = emp;
                            break;
                        }
                    }
                    ViagemResultanteMessage vresultante = new ViagemResultanteMessage(paragemInicial.getNome(), inicio.getHora(), paragemFinal.getNome(), fim.getHora(), vi.getPreco(), autofi.getNumero(), empfi.getNome(), vi.getNbilhetes(), vi.getID());
                    vrm.add(vresultante);
                }
            }
        }
        ArrayList<ViagemResultanteMessage> viagens = vrm.getViagens();
        Collections.sort(viagens, new RapidezComparator());
        vrm.setViagens(viagens);
        return vrm;
    }

    public ViagensResultantesMessage filterViagens(filterViagemMessage fvm) throws PersistentException, ParseException {
        ViagemPretendidaMessage vpm = new ViagemPretendidaMessage(fvm.getParagemInicial(), fvm.getParagemFinal(),fvm.getHora() ,fvm.getIntercidades());
        ViagensResultantesMessage vrm = getViagens(vpm);
        ArrayList<ViagemResultanteMessage> viagens = vrm.getViagens();
        String filtro = fvm.getFiltro();
        if (filtro.equals("barato")) {
            Collections.sort(viagens, new PrecoComparator());
            vrm.setViagens(viagens);
            return vrm;
        }
        else if (filtro.equals("rapidez")) {
            Collections.sort(viagens, new RapidezComparator());
            vrm.setViagens(viagens);
            return vrm;
        }
        else {
            return vrm;
        }
    }
}
