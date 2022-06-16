package backend.beans;
import backend.BD.*;
import backend.beans.locals.PerguntasFreqLocal;
import backend.message.*;
import org.orm.PersistentException;
import org.springframework.stereotype.Component;


import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.ArrayList;

@Stateless(name = "PerguntasFreqEJB")
@Local(PerguntasFreqLocal.class)
@Component
public class PerguntasFreqBean {
    public PerguntasFreqMessage getPerguntas() throws PersistentException {
        ArrayList<PerguntaFreqMessage> temp = new ArrayList<>();
        PerguntaFrequente[] ps = PerguntaFrequenteDAO.listPerguntaFrequenteByQuery(null,null);
        for (PerguntaFrequente p : ps) {
            PerguntaFreqMessage pm = new PerguntaFreqMessage(p.getID(),p.getPergunta(),p.getResposta());
            temp.add(pm);
            PerguntaFrequenteDAO.evict(p);
        }
        return new PerguntasFreqMessage(temp);
    }
}
