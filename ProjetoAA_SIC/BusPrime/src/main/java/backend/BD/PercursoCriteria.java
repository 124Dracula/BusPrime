/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: ruial(Universidade do Minho)
 * License Type: Academic
 */
package backend.BD;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PercursoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _paragemfinalId;
	public final AssociationExpression _paragemfinal;
	public final IntegerExpression _parageminicialId;
	public final AssociationExpression _parageminicial;
	
	public PercursoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_paragemfinalId = new IntegerExpression("_paragemfinal.ID", this);
		_paragemfinal = new AssociationExpression("_paragemfinal", this);
		_parageminicialId = new IntegerExpression("_parageminicial.ID", this);
		_parageminicial = new AssociationExpression("_parageminicial", this);
	}
	
	public PercursoCriteria(PersistentSession session) {
		this(session.createCriteria(Percurso.class));
	}
	
	public PercursoCriteria() throws PersistentException {
		this(BusPrimePersistentManager.instance().getSession());
	}
	
	public ParagemCriteria create_paragemfinalCriteria() {
		return new ParagemCriteria(createCriteria("_paragemfinal"));
	}
	
	public ParagemCriteria create_parageminicialCriteria() {
		return new ParagemCriteria(createCriteria("_parageminicial"));
	}
	
	public Percurso uniquePercurso() {
		return (Percurso) super.uniqueResult();
	}
	
	public Percurso[] listPercurso() {
		java.util.List list = super.list();
		return (Percurso[]) list.toArray(new Percurso[list.size()]);
	}
}

