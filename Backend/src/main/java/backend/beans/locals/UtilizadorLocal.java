package backend.beans.locals;

import backend.message.*;

import javax.ejb.Local;

@Local
public interface UtilizadorLocal {
    public UtilizadorMessage getUtilizador(int id);
    public UtilizadorMessage alteraPerfil(int id,alterarUtilizadorMessage mudancas);
    public UtilizadorMessage registaUtilizador (RegistarUtilizadorMessage novoUser);
    public String login(AuthenticationMessage aj);
    public UtilizadorMessage depositar(int id,DepositarDinheiroMessage dinheiro);
    public RespostaPercursoFavMessage adicionarPercursoFavorito (int id, AdicionarPercursoFavMessage apfm);
    public int removerPercursoFavorito(int id,RemoverPercursoMessage rpm);
    public ListaPercursosFavMessage listaPercursosFavoritos(int id);
    public RespostaParagemFavMessage adicionarParagemFavorita (int id, AdicionarParagemFavMessage apfm);
    public int removerParagemFavorita(int id,RemoverParagemMessage rpm);
    public ListaParagensFavMessage listaParagensFavoritas(int id);
    public RespostaBilheteMessage compraBilhete (int id, ComprarBilheteMessage cbm);
    public ListaBilhetesMessage listabilhetes (int id);

}
