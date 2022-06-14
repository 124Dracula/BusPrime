package backend.message;

public class ListaParagemFavMessage {
    private String nome;
    private int idParagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdParagem() {
        return idParagem;
    }

    public void setIdParagem(int idParagem) {
        this.idParagem = idParagem;
    }

    public ListaParagemFavMessage(String nome, int idParagem) {
        this.nome = nome;
        this.idParagem = idParagem;
    }
}
