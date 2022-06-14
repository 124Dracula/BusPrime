package backend.message;

import java.util.ArrayList;

public class ListaBilhetesMessage {
    ArrayList<BilheteMessage> bilhetes;

    public ListaBilhetesMessage(ArrayList<BilheteMessage> bilhetes) {
        this.bilhetes = bilhetes;
    }

    public ArrayList<BilheteMessage> getBilhetes() {
        return bilhetes;
    }

    public void setBilhetes(ArrayList<BilheteMessage> bilhetes) {
        this.bilhetes = bilhetes;
    }
}
