package backend.controller;



import backend.beans.ViagemBean;
import backend.message.*;
import backend.JWTUtil;
import io.jsonwebtoken.Claims;
import org.orm.PersistentException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.ejb.EJB;
import javax.validation.Valid;
import java.text.ParseException;

@CrossOrigin("*")
@RequestMapping("/viagem")
@RestController
public class ControllerViagem {
    @EJB
    ViagemBean vb;

    @PostMapping("/search")
    public ViagensResultantesMessage getViagens(@RequestBody ViagemPretendidaMessage vpm) throws PersistentException, ParseException {
        return vb.getViagens(vpm);
    }

    @PostMapping("/filter")
    public ViagensResultantesMessage filterViagens(@RequestBody filterViagemMessage fvm) throws PersistentException, ParseException {
        return vb.filterViagens(fvm);
    }
}
