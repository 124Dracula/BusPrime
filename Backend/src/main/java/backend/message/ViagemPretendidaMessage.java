package backend.message;

public class ViagemPretendidaMessage {
    private String paragemInicial;
    private String paragemFinal;
    private String hora;
    private String intercidades;

    public ViagemPretendidaMessage(String paragemInicial, String paragemFinal, String hora, String intercidades) {
        this.paragemInicial = paragemInicial;
        this.paragemFinal = paragemFinal;
        this.hora = hora;
        this.intercidades = intercidades;
    }

    public void setParagemInicial(String paragemInicial) {
        this.paragemInicial = paragemInicial;
    }

    public void setParagemFinal(String paragemFinal) {
        this.paragemFinal = paragemFinal;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setIntercidades(String intercidades) {
        this.intercidades = intercidades;
    }

    public String getParagemInicial() {
        return paragemInicial;
    }

    public String getParagemFinal() {
        return paragemFinal;
    }

    public String getHora() {
        return hora;
    }

    public String getIntercidades() {
        return intercidades;
    }
}
