package backend.message;

public class RespostaPercursoFavMessage {
    private String ParagemInicial;
    private int idParagemInicial;
    private String ParagemFinal;
    private int idParagemFinal;
    private int idUtilizador;
    private int idPercurso;

    public RespostaPercursoFavMessage(String paragemInicial, int idParagemInicial, String paragemFinal, int idParagemFinal, int idUtilizador, int idPercurso) {
        ParagemInicial = paragemInicial;
        this.idParagemInicial = idParagemInicial;
        ParagemFinal = paragemFinal;
        this.idParagemFinal = idParagemFinal;
        this.idUtilizador = idUtilizador;
        this.idPercurso = idPercurso;
    }

    public String getParagemInicial() {
        return ParagemInicial;
    }

    public void setParagemInicial(String paragemInicial) {
        ParagemInicial = paragemInicial;
    }

    public int getIdParagemInicial() {
        return idParagemInicial;
    }

    public void setIdParagemInicial(int idParagemInicial) {
        this.idParagemInicial = idParagemInicial;
    }

    public String getParagemFinal() {
        return ParagemFinal;
    }

    public void setParagemFinal(String paragemFinal) {
        ParagemFinal = paragemFinal;
    }

    public int getIdParagemFinal() {
        return idParagemFinal;
    }

    public void setIdParagemFinal(int idParagemFinal) {
        this.idParagemFinal = idParagemFinal;
    }

    public int getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(int idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    public int getIdPercurso() {
        return idPercurso;
    }

    public void setIdPercurso(int idPercurso) {
        this.idPercurso = idPercurso;
    }
}
