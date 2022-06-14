package backend.message;

public class ViagemPretendidaMessage {
    private String paragemInicial;
    private String paragemFinal;
    private String hora;
    private int intercidades;

    public ViagemPretendidaMessage(String paragemInicial, String paragemFinal, String hora, int intercidades) {
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

    public void setIntercidades(int intercidades) {
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

    public int getIntercidades() {
        return intercidades;
    }
}
