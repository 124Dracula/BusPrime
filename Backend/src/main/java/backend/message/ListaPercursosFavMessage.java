package backend.message;

import java.util.ArrayList;

public class ListaPercursosFavMessage {
    private ArrayList<ListaPercursoFavMessage> percursos;

    public ArrayList<ListaPercursoFavMessage> getPercursos() {
        return percursos;
    }

    public void setPercursos(ArrayList<ListaPercursoFavMessage> percursos) {
        this.percursos = percursos;
    }

    public ListaPercursosFavMessage(ArrayList<ListaPercursoFavMessage> percursos) {
        this.percursos = percursos;
    }
}
