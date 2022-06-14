package backend.message;


public class filterViagemMessage {
    private String paragemInicial;
    private String paragemFinal;
    private String hora;
    private int intercidades;

    private String filtro;


    public filterViagemMessage(String paragemInicial, String paragemFinal, String hora, int intercidades, String filtro) {
        this.paragemInicial = paragemInicial;
        this.paragemFinal = paragemFinal;
        this.hora = hora;
        this.intercidades = intercidades;
        this.filtro = filtro;
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

    public void setFiltro(String filtro) {
        this.filtro = filtro;
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

    public String getFiltro() {
        return filtro;
    }

}
