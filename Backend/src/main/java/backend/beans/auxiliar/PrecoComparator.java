package backend.beans.auxiliar;


import backend.message.ViagemResultanteMessage;

import java.util.Comparator;

public class PrecoComparator implements Comparator<ViagemResultanteMessage> {
    public int compare(ViagemResultanteMessage vrm1, ViagemResultanteMessage vrm2) {
        if (vrm1.getPreco() < vrm2.getPreco()) return -1;
        else if (vrm1.getPreco() == vrm2.getPreco()) return 0;
        else return 1;
    }
}
