package backend.message;

import backend.BD.Utilizador;

public class alterarUtilizadorMessage {

    private String password;
    private String username;


    public alterarUtilizadorMessage(String password,String username) {
        this.password = password;
        this.username = username;
    }

    public alterarUtilizadorMessage(Utilizador u) {
        this.password = u.getPassword();
        this.username = u.getUsername();
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String password) {
        this.password = username;
    }

}
