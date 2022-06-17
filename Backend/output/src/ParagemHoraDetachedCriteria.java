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

public class ParagemHoraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression paragemId;
	public final AssociationExpression paragem;
	public final StringExpression hora;
	
	public ParagemHoraDetachedCriteria() {
		super(ParagemHora.class, .ParagemHoraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		paragemId = new IntegerExpression("paragem.ID", this.getDetachedCriteria());
		paragem = new AssociationExpression("paragem", this.getDetachedCriteria());
		hora = new StringExpression("hora", this.getDetachedCriteria());
	}
	
	public ParagemHoraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, .ParagemHoraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		paragemId = new IntegerExpression("paragem.ID", this.getDetachedCriteria());
		paragem = new AssociationExpression("paragem", this.getDetachedCriteria());
		hora = new StringExpression("hora", this.getDetachedCriteria());
	}
	
	public ParagemDetachedCriteria createParagemCriteria() {
		return new ParagemDetachedCriteria(createCriteria("paragem"));
	}
	
	public ParagemHora uniqueParagemHora(PersistentSession session) {
		return (ParagemHora) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ParagemHora[] listParagemHora(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ParagemHora[]) list.toArray(new ParagemHora[list.size()]);
	}
}

