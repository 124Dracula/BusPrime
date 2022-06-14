package backend.beans.auxiliar;

import backend.message.ViagemResultanteMessage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class HoraInicialComparator implements Comparator<ViagemResultanteMessage> {
    public int compare(ViagemResultanteMessage vrm1, ViagemResultanteMessage vrm2) {
        DateFormat formatter = new SimpleDateFormat("hh:mm");
        try {
            Date horainicial1 = (Date) formatter.parse(vrm1.getHoraInicial());
            Date horainicial2 = (Date) formatter.parse(vrm2.getHoraInicial());
            return (horainicial1.compareTo(horainicial2));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

