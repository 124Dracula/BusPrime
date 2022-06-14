package backend.beans.auxiliar;

import backend.message.ViagemResultanteMessage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class RapidezComparator implements Comparator<ViagemResultanteMessage> {
    public int compare(ViagemResultanteMessage vrm1, ViagemResultanteMessage vrm2) {
        DateFormat formatter = new SimpleDateFormat("hh:mm");
        try {
            Date horafim1 = (Date) formatter.parse(vrm1.getHoraFinal());
            Date horafim2 = (Date) formatter.parse(vrm2.getHoraFinal());
            return (horafim1.compareTo(horafim2));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
