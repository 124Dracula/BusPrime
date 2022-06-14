package backend.message;

import java.util.*;

public class ViagemResultanteMessage {
    private String paragemInicial;
    private String horaInicial;
    private String paragemFinal;
    private String horaFinal;
    private double preco;
    private int autocarro;
    private String nomeEmpresa;
    private int nBilhetes;
    private int idViagem;

    public ViagemResultanteMessage(String paragemInicial, String horaInicial, String paragemFinal, String horaFinal, double preco, int autocarro, String nomeEmpresa, int nBilhetes, int idViagem) {
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

    public void setParagemInicial(String paragemInicial) {
        this.paragemInicial = paragemInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public void setParagemFinal(String paragemFinal) {
        this.paragemFinal = paragemFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAutocarro(int autocarro) {
        this.autocarro = autocarro;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setnBilhetes(int nBilhetes) {
        this.nBilhetes = nBilhetes;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }

    public String getParagemInicial() {
        return paragemInicial;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public String getParagemFinal() {
        return paragemFinal;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public double getPreco() {
        return preco;
    }

    public int getAutocarro() {
        return autocarro;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public int getnBilhetes() {
        return nBilhetes;
    }

    public int getIdViagem() {
        return idViagem;
    }
}
