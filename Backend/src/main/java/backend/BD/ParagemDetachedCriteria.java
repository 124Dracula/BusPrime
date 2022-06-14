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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ParagemDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression coordenadasId;
	public final AssociationExpression coordenadas;
	public final StringExpression nome;
	
	public ParagemDetachedCriteria() {
		super(Paragem.class, ParagemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		coordenadasId = new IntegerExpression("coordenadas.ID", this.getDetachedCriteria());
		coordenadas = new AssociationExpression("coordenadas", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public ParagemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ParagemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		coordenadasId = new IntegerExpression("coordenadas.ID", this.getDetachedCriteria());
		coordenadas = new AssociationExpression("coordenadas", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public CoordenadasDetachedCriteria createCoordenadasCriteria() {
		return new CoordenadasDetachedCriteria(createCriteria("coordenadas"));
	}
	
	public Paragem uniqueParagem(PersistentSession session) {
		return (Paragem) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paragem[] listParagem(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paragem[]) list.toArray(new Paragem[list.size()]);
	}
}

