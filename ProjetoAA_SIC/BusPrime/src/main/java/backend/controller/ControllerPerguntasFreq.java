package backend.controller;



import backend.beans.ParagemBean;
import backend.beans.PerguntasFreqBean;
import backend.message.*;
import org.orm.PersistentException;
import org.springframework.web.bind.annotation.*;


import javax.ejb.EJB;

@CrossOrigin("*")
@RequestMapping("/perguntasfreq")
@RestController
public class ControllerPerguntasFreq {
    @EJB
    PerguntasFreqBean pfb;

    @GetMapping()
    public PerguntasFreqMessage getPerguntas() throws PersistentException {
        return pfb.getPerguntas();
    }

}
