package backend.message;

import java.util.ArrayList;

public class ParagensMessage {
    private ArrayList<ParagemMessage> paragens;

    public ParagensMessage(ArrayList<ParagemMessage> paragens) {
        this.paragens = paragens;
    }

    public ArrayList<ParagemMessage> getParagens() {
        return paragens;
    }

    public void setParagens(ArrayList<ParagemMessage> paragens) {
        this.paragens = paragens;
    }
}
