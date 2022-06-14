package backend.message;

public class DepositarDinheiroMessage {
    private String username;
    private double dinheiro;

    public DepositarDinheiroMessage(String username,double dinheiro) {
        this.username=username;
        this.dinheiro=dinheiro;
    }

    public String getUsername() {
        return username;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
