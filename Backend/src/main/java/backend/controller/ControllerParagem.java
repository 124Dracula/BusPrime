package backend.controller;



import backend.beans.ParagemBean;
import backend.message.*;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.ejb.EJB;

@CrossOrigin("*")
@RequestMapping("/paragens")
@RestController
public class ControllerParagem {

    @EJB
    ParagemBean  pb;

    @GetMapping()
    public ParagensMessage getParagens() throws PersistentException {
        return pb.getParagens();
    }
}
