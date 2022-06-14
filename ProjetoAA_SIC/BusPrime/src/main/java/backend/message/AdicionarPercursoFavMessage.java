package backend.message;

public class AdicionarPercursoFavMessage {
    private String paragemInicial;
    private String paragemFinal;

    public AdicionarPercursoFavMessage(String paragemInicial, String paragemFinal) {
        this.paragemInicial = paragemInicial;
        this.paragemFinal = paragemFinal;
    }

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
}
