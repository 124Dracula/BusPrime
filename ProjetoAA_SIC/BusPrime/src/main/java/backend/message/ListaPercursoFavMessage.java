package backend.message;

public class ListaPercursoFavMessage {
    private String paragemInicial;
    private String paragemFinal;

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

    public ListaPercursoFavMessage(String paragemInicial, String paragemFinal) {
        this.paragemInicial = paragemInicial;
        this.paragemFinal = paragemFinal;
    }
}
