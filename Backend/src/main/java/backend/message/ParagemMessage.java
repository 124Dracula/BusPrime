package backend.message;

public class ParagemMessage {
    private String nome;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParagemMessage(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
}
