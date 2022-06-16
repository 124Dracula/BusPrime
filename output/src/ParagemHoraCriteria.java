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

public class ParagemHoraCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression paragemId;
	public final AssociationExpression paragem;
	public final StringExpression hora;
	
	public ParagemHoraCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		paragemId = new IntegerExpression("paragem.ID", this);
		paragem = new AssociationExpression("paragem", this);
		hora = new StringExpression("hora", this);
	}
	
	public ParagemHoraCriteria(PersistentSession session) {
		this(session.createCriteria(ParagemHora.class));
	}
	
	public ParagemHoraCriteria() throws PersistentException {
		this(BusPrimePersistentManager.instance().getSession());
	}
	
	public ParagemCriteria createParagemCriteria() {
		return new ParagemCriteria(createCriteria("paragem"));
	}
	
	public ParagemHora uniqueParagemHora() {
		return (ParagemHora) super.uniqueResult();
	}
	
	public ParagemHora[] listParagemHora() {
		java.util.List list = super.list();
		return (ParagemHora[]) list.toArray(new ParagemHora[list.size()]);
	}
}

