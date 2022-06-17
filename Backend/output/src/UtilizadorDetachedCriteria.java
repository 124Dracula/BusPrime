/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: bruno(Universidade do Minho)
 * License Type: Academic
 */
package ;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UtilizadorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression admin;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression email;
	public final DoubleExpression saldo;
	public final CollectionExpression paragens;
	public final CollectionExpression percursos;
	public final CollectionExpression bilhetes;
	
	public UtilizadorDetachedCriteria() {
		super(Utilizador.class, .UtilizadorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		admin = new BooleanExpression("admin", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		saldo = new DoubleExpression("saldo", this.getDetachedCriteria());
		paragens = new CollectionExpression("ORM_Paragens", this.getDetachedCriteria());
		percursos = new CollectionExpression("ORM_Percursos", this.getDetachedCriteria());
		bilhetes = new CollectionExpression("ORM_Bilhetes", this.getDetachedCriteria());
	}
	
	public UtilizadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, .UtilizadorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		admin = new BooleanExpression("admin", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		saldo = new DoubleExpression("saldo", this.getDetachedCriteria());
		paragens = new CollectionExpression("ORM_Paragens", this.getDetachedCriteria());
		percursos = new CollectionExpression("ORM_Percursos", this.getDetachedCriteria());
		bilhetes = new CollectionExpression("ORM_Bilhetes", this.getDetachedCriteria());
	}
	
	public ParagemDetachedCriteria createParagensCriteria() {
		return new ParagemDetachedCriteria(createCriteria("ORM_Paragens"));
	}
	
	public PercursoDetachedCriteria createPercursosCriteria() {
		return new PercursoDetachedCriteria(createCriteria("ORM_Percursos"));
	}
	
	public BilheteDetachedCriteria createBilhetesCriteria() {
		return new BilheteDetachedCriteria(createCriteria("ORM_Bilhetes"));
	}
	
	public Utilizador uniqueUtilizador(PersistentSession session) {
		return (Utilizador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Utilizador[] listUtilizador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Utilizador[]) list.toArray(new Utilizador[list.size()]);
	}
}

