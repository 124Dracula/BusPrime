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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UtilizadorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression admin;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression email;
	public final DoubleExpression saldo;
	public final CollectionExpression paragens;
	public final CollectionExpression percursos;
	public final CollectionExpression bilhetes;
	
	public UtilizadorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		admin = new BooleanExpression("admin", this);
		username = new StringExpression("username", this);
		password = new StringExpression("password", this);
		email = new StringExpression("email", this);
		saldo = new DoubleExpression("saldo", this);
		paragens = new CollectionExpression("ORM_Paragens", this);
		percursos = new CollectionExpression("ORM_Percursos", this);
		bilhetes = new CollectionExpression("ORM_Bilhetes", this);
	}
	
	public UtilizadorCriteria(PersistentSession session) {
		this(session.createCriteria(Utilizador.class));
	}
	
	public UtilizadorCriteria() throws PersistentException {
		this(BusPrimePersistentManager.instance().getSession());
	}
	
	public ParagemCriteria createParagensCriteria() {
		return new ParagemCriteria(createCriteria("ORM_Paragens"));
	}
	
	public PercursoCriteria createPercursosCriteria() {
		return new PercursoCriteria(createCriteria("ORM_Percursos"));
	}
	
	public BilheteCriteria createBilhetesCriteria() {
		return new BilheteCriteria(createCriteria("ORM_Bilhetes"));
	}
	
	public Utilizador uniqueUtilizador() {
		return (Utilizador) super.uniqueResult();
	}
	
	public Utilizador[] listUtilizador() {
		java.util.List list = super.list();
		return (Utilizador[]) list.toArray(new Utilizador[list.size()]);
	}
}

