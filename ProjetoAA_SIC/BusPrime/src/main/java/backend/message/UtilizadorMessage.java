package backend.message;

import backend.BD.Utilizador;

public class UtilizadorMessage {
    private int ID;

    private boolean admin;

    private String username;

    private String password;

    private String email;

    private double saldo;

    public UtilizadorMessage(Utilizador u) {
        this.ID = u.getID();
        this.admin = u.getAdmin();
        this.email = u.getEmail();
        this.username = u.getUsername();
        this.password = u.getPassword();
        this.saldo = u.getSaldo();
    }
    public int getID() {
        return ID;
    }
    public boolean getAdmin() {
        return admin;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getUsername() {return username;}
}
