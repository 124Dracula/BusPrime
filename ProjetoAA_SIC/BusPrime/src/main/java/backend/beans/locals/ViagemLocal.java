package backend.beans.locals;

import backend.message.ViagemPretendidaMessage;
import backend.message.ViagensResultantesMessage;
import backend.message.filterViagemMessage;

import javax.ejb.Local;

@Local
public interface ViagemLocal {
    public ViagensResultantesMessage getViagens(ViagemPretendidaMessage viagem);
    public ViagensResultantesMessage filterViagens(filterViagemMessage fvm);
}
