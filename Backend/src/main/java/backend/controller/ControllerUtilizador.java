package backend.controller;



import backend.beans.UtilizadorBean;
import backend.message.*;
import backend.JWTUtil;
import io.jsonwebtoken.Claims;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.ejb.EJB;

@CrossOrigin("*")
@RequestMapping("/utilizador")
@RestController
public class ControllerUtilizador {
    @EJB
    UtilizadorBean ub;

    @GetMapping("/{id}")
    public UtilizadorMessage getUtilizador(@PathVariable Integer id) {
        UtilizadorMessage u = ub.getUtilizador(id);
        if(u!=null){
            return u;
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }
    }

    @PostMapping("/alterar/{id}")
    public UtilizadorMessage alteraPerfil(@RequestHeader(value="Authorization") String token, @PathVariable Integer id, @RequestBody alterarUtilizadorMessage aum){
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.alteraPerfil(id,aum);
    }
    @PostMapping("/depositar/{id}")
    public UtilizadorMessage depositar(@RequestHeader(value="Authorization") String token, @PathVariable Integer id, @RequestBody DepositarDinheiroMessage ddm){
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.depositar(id,ddm);
    }

    @PostMapping("/registar")
    public UtilizadorMessage registaUtilizador(@RequestBody RegistarUtilizadorMessage rm){
        UtilizadorMessage uj = ub.registaUtilizador(rm);
        if( uj !=null) {
            return uj;
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthenticationMessage am){
        System.out.println("TOU AQUI LOGIN");
        String token = ub.login(am);
        if(token!=null){
            return token;
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }
    }
    @PostMapping("/addpercurso/{id}")
    public RespostaPercursoFavMessage adicionarPercursoFavorito(@RequestHeader(value="Authorization") String token,@PathVariable int id,@RequestBody AdicionarPercursoFavMessage apfv){
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.adicionarPercursoFavorito(id,apfv);
    }
    @PostMapping("/removepercurso/{id}")
    public ListaPercursosFavMessage removerPercursoFavorito(@RequestHeader(value="Authorization") String token,@PathVariable int id,@RequestBody RemoverPercursoMessage rpm){
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.removerPercursoFavorito(id,rpm);
    }

    @GetMapping("/listpercursos/{id}")
    public ListaPercursosFavMessage listaPercursosFavoritos(@RequestHeader(value="Authorization") String token,@PathVariable int id) {
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.listaPercursosFavoritos(id);
    }
    @PostMapping("/addparagem/{id}")
    public ListaParagensFavMessage adicionarParagemFavorita(@RequestHeader(value="Authorization") String token,@PathVariable int id,@RequestBody AdicionarParagemFavMessage apfv){
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.adicionarParagemFavorita(id,apfv);
    }
    @PostMapping("/removeparagem/{id}")
    public ListaParagensFavMessage removerParagemFavorita(@RequestHeader(value="Authorization") String token,@PathVariable int id,@RequestBody RemoverParagemMessage rpm){
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.removerParagemFavorita(id,rpm);
    }
    @GetMapping("/listparagens/{id}")
    public ListaParagensFavMessage listaParagensFavoritas(@RequestHeader(value="Authorization") String token,@PathVariable int id) {
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.listaParagensFavoritas(id);
    }

    @PostMapping("/comprarBilhete/{id}")
    public RespostaBilheteMessage compraBilhete (@RequestHeader(value="Authorization") String token,@PathVariable int id,@RequestBody ComprarBilheteMessage cbm){
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.compraBilhete(id,cbm);
    }
    @GetMapping("/listarbilhetes/{id}")
    public ListaBilhetesMessage listabilhetes (@RequestHeader(value="Authorization") String token,@PathVariable int id){
        Claims cl = JWTUtil.decodeJWT(token);
        if(cl==null || id!=(int)cl.get("id")) {
            return null;
        }
        return ub.listabilhetes(id);
    }
    @PostMapping("/token")
    public Claims decodeToken(@RequestBody String token){
        return JWTUtil.decodeJWT(token);
    }
}
