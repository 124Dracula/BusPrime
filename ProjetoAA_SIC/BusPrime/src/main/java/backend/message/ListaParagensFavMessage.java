package backend.message;

import java.util.ArrayList;

public class ListaParagensFavMessage {
    ArrayList<ListaParagemFavMessage> paragens;

    public ArrayList<ListaParagemFavMessage> getParagens() {
        return paragens;
    }

    public void setParagens(ArrayList<ListaParagemFavMessage> paragens) {
        this.paragens = paragens;
    }

    public ListaParagensFavMessage(ArrayList<ListaParagemFavMessage> paragens) {
        this.paragens = paragens;
    }
}
