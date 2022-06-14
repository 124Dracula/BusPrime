package backend.message;

public class ComprarBilheteMessage {
    private String paragemInicial;
    private String horaInicial;
    private String paragemFinal;
    private String horaFinal;
    private double preco;

    private int numeroAutocarro;
    private String nomeEmpresa;
    private int idViagem;

    public ComprarBilheteMessage(String paragemInicial, String horaInicial, String paragemFinal, String horaFinal, double preco,int numeroAutocarro, String nomeEmpresa, int idViagem) {
        this.paragemInicial = paragemInicial;
        this.horaInicial = horaInicial;
        this.paragemFinal = paragemFinal;
        this.horaFinal = horaFinal;
        this.preco = preco;
        this.numeroAutocarro= numeroAutocarro;
        this.nomeEmpresa = nomeEmpresa;
        this.idViagem = idViagem;
    }

    public String getParagemInicial() {
        return paragemInicial;
    }

    public void setParagemInicial(String paragemInicial) {
        this.paragemInicial = paragemInicial;
    }

    public int getNumeroAutocarro(){
        return numeroAutocarro;
    }

    public void setNumeroAutocarro(int a){
        this.numeroAutocarro=a;
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

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }


    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }
}
