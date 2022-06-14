package backend.beans;

import backend.beans.locals.ParagemLocal;
import backend.BD.*;
import backend.message.*;
import org.orm.PersistentException;
import org.springframework.stereotype.Component;


import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.ArrayList;

@Stateless(name = "ParagemEJB")
@Local(ParagemLocal.class)
@Component
public class ParagemBean {
    public ParagensMessage getParagens() throws PersistentException {
        ArrayList<ParagemMessage> temp = new ArrayList<>();
        Paragem[] ps = ParagemDAO.listParagemByQuery(null,null);
        for (Paragem p : ps) {
            ParagemMessage pm = new ParagemMessage(p.getNome(),p.getID());
            temp.add(pm);
        }
        return new ParagensMessage(temp);
    }
}
