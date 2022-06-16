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

public class ParagemCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression coordenadasId;
	public final AssociationExpression coordenadas;
	public final StringExpression nome;
	
	public ParagemCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		coordenadasId = new IntegerExpression("coordenadas.ID", this);
		coordenadas = new AssociationExpression("coordenadas", this);
		nome = new StringExpression("nome", this);
	}
	
	public ParagemCriteria(PersistentSession session) {
		this(session.createCriteria(Paragem.class));
	}
	
	public ParagemCriteria() throws PersistentException {
		this(BusPrimePersistentManager.instance().getSession());
	}
	
	public CoordenadasCriteria createCoordenadasCriteria() {
		return new CoordenadasCriteria(createCriteria("coordenadas"));
	}
	
	public Paragem uniqueParagem() {
		return (Paragem) super.uniqueResult();
	}
	
	public Paragem[] listParagem() {
		java.util.List list = super.list();
		return (Paragem[]) list.toArray(new Paragem[list.size()]);
	}
}

