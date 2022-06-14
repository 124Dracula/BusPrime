package backend.beans.locals;

import backend.message.*;

import javax.ejb.Local;

@Local
public interface ParagemLocal {
    public ParagensMessage getParagens();
}
