package backend.message;

import java.util.ArrayList;
import java.util.List;

public class ViagensResultantesMessage {
    private ArrayList<ViagemResultanteMessage> viagens;

    public ViagensResultantesMessage(){
        viagens = new ArrayList<>();
    }
    public ViagensResultantesMessage(ArrayList<ViagemResultanteMessage> viagens) {
        this.viagens = viagens;
    }
    public ViagensResultantesMessage(ViagemResultanteMessage viagem) {
        viagens = new ArrayList<>();
        viagens.add(viagem);
    }

    public ArrayList<ViagemResultanteMessage> getViagens() {
        return viagens;
    }

    public void setViagens(ArrayList<ViagemResultanteMessage> viagens) {
        this.viagens = viagens;
    }
    public void add(ViagemResultanteMessage vrm){
        this.viagens.add(vrm);
    }
}
