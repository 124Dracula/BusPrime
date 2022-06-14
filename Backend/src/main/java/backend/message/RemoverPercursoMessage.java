package backend.message;

public class RemoverPercursoMessage {
    private int id;
    private int idUtilizador;

    public RemoverPercursoMessage(int id,int idUtilizador) {
        this.id = id;
        this.idUtilizador= idUtilizador;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(int idUtilizador) {
        this.idUtilizador = idUtilizador;
    }
}
