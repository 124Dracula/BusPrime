package backend.message;

public class ListaPercursoFavMessage {
    private String paragemInicial;
    private String paragemFinal;
    private int id;

    public String getParagemInicial() {
        return paragemInicial;
    }

    public void setParagemInicial(String paragemInicial) {
        this.paragemInicial = paragemInicial;
    }

    public String getParagemFinal() {
        return paragemFinal;
    }

    public void setParagemFinal(String paragemFinal) {
        this.paragemFinal = paragemFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ListaPercursoFavMessage(String paragemInicial, String paragemFinal, int id) {
        this.paragemInicial = paragemInicial;
        this.paragemFinal = paragemFinal;
        this.id = id;
    }
}