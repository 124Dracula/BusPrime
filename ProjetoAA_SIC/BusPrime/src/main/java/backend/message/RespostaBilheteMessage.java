package backend.message;

public class RespostaBilheteMessage {
    private String paragemInicial;
    private String horaInicial;
    private String paragemFinal;
    private String horaFinal;
    private double preco;
    private int autocarro;
    private String nomeEmpresa;
    private int nBilhetes;
    private int idViagem;

    public RespostaBilheteMessage(String paragemInicial, String horaInicial, String paragemFinal, String horaFinal, double preco, int autocarro, String nomeEmpresa, int nBilhetes, int idViagem) {
        this.paragemInicial = paragemInicial;
        this.horaInicial = horaInicial;
        this.paragemFinal = paragemFinal;
        this.horaFinal = horaFinal;
        this.preco = preco;
        this.autocarro = autocarro;
        this.nomeEmpresa = nomeEmpresa;
        this.nBilhetes = nBilhetes;
        this.idViagem = idViagem;
    }

    public String getParagemInicial() {
        return paragemInicial;
    }

    public void setParagemInicial(String paragemInicial) {
        this.paragemInicial = paragemInicial;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getParagemFinal() {
        return paragemFinal;
    }

    public void setParagemFinal(String paragemFinal) {
        this.paragemFinal = paragemFinal;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAutocarro() {
        return autocarro;
    }

    public void setAutocarro(int autocarro) {
        this.autocarro = autocarro;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getnBilhetes() {
        return nBilhetes;
    }

    public void setnBilhetes(int nBilhetes) {
        this.nBilhetes = nBilhetes;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }
}
