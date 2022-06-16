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

public class PercursoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _paragemfinalId;
	public final AssociationExpression _paragemfinal;
	public final IntegerExpression _parageminicialId;
	public final AssociationExpression _parageminicial;
	
	public PercursoDetachedCriteria() {
		super(Percurso.class, .PercursoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_paragemfinalId = new IntegerExpression("_paragemfinal.ID", this.getDetachedCriteria());
		_paragemfinal = new AssociationExpression("_paragemfinal", this.getDetachedCriteria());
		_parageminicialId = new IntegerExpression("_parageminicial.ID", this.getDetachedCriteria());
		_parageminicial = new AssociationExpression("_parageminicial", this.getDetachedCriteria());
	}
	
	public PercursoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, .PercursoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_paragemfinalId = new IntegerExpression("_paragemfinal.ID", this.getDetachedCriteria());
		_paragemfinal = new AssociationExpression("_paragemfinal", this.getDetachedCriteria());
		_parageminicialId = new IntegerExpression("_parageminicial.ID", this.getDetachedCriteria());
		_parageminicial = new AssociationExpression("_parageminicial", this.getDetachedCriteria());
	}
	
	public ParagemDetachedCriteria create_paragemfinalCriteria() {
		return new ParagemDetachedCriteria(createCriteria("_paragemfinal"));
	}
	
	public ParagemDetachedCriteria create_parageminicialCriteria() {
		return new ParagemDetachedCriteria(createCriteria("_parageminicial"));
	}
	
	public Percurso uniquePercurso(PersistentSession session) {
		return (Percurso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Percurso[] listPercurso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Percurso[]) list.toArray(new Percurso[list.size()]);
	}
}

