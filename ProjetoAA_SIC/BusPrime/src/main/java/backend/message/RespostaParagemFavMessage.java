package backend.message;

public class RespostaParagemFavMessage {
    private String nomeParagem;
    private int idParagem;
    private int idUtilizador;

    public RespostaParagemFavMessage(String nomeParagem, int idParagem, int idUtilizador) {
        this.nomeParagem = nomeParagem;
        this.idParagem = idParagem;
        this.idUtilizador = idUtilizador;
    }

    public String getNomeParagem() {
        return nomeParagem;
    }

    public void setNomeParagem(String nomeParagem) {
        this.nomeParagem = nomeParagem;
    }

    public int getIdParagem() {
        return idParagem;
    }

    public void setIdParagem(int idParagem) {
        this.idParagem = idParagem;
    }

    public int getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(int idUtilizador) {
        this.idUtilizador = idUtilizador;
    }
}
