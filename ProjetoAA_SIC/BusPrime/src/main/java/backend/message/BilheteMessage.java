package backend.message;

public class BilheteMessage {
    private int idBilhete;
    private String ParagemInicial;
    private String ParagemFinal;
    private String HoraInicial;
    private String HoraFinal;
    private String nomeEmpresa;
    private double preco;
    private int nAutocarro;
    private int idViagem;

    public BilheteMessage(int idBilhete, String paragemInicial, String paragemFinal, String horaInicial, String horaFinal, String nomeEmpresa, double preco, int nAutocarro, int idViagem) {
        this.idBilhete = idBilhete;
        ParagemInicial = paragemInicial;
        ParagemFinal = paragemFinal;
        HoraInicial = horaInicial;
        HoraFinal = horaFinal;
        this.nomeEmpresa = nomeEmpresa;
        this.preco = preco;
        this.nAutocarro = nAutocarro;
        this.idViagem = idViagem;
    }

    public int getIdBilhete() {
        return idBilhete;
    }

    public void setIdBilhete(int idBilhete) {
        this.idBilhete = idBilhete;
    }

    public String getParagemInicial() {
        return ParagemInicial;
    }

    public void setParagemInicial(String paragemInicial) {
        ParagemInicial = paragemInicial;
    }

    public String getParagemFinal() {
        return ParagemFinal;
    }

    public void setParagemFinal(String paragemFinal) {
        ParagemFinal = paragemFinal;
    }

    public String getHoraInicial() {
        return HoraInicial;
    }

    public void setHoraInicial(String horaInicial) {
        HoraInicial = horaInicial;
    }

    public String getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(String horaFinal) {
        HoraFinal = horaFinal;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getnAutocarro() {
        return nAutocarro;
    }

    public void setnAutocarro(int nAutocarro) {
        this.nAutocarro = nAutocarro;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }
}
