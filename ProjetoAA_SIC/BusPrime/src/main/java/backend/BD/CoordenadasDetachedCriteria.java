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

public class CoordenadasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression coordX;
	public final DoubleExpression coordY;
	
	public CoordenadasDetachedCriteria() {
		super(Coordenadas.class, CoordenadasCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		coordX = new DoubleExpression("coordX", this.getDetachedCriteria());
		coordY = new DoubleExpression("coordY", this.getDetachedCriteria());
	}
	
	public CoordenadasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CoordenadasCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		coordX = new DoubleExpression("coordX", this.getDetachedCriteria());
		coordY = new DoubleExpression("coordY", this.getDetachedCriteria());
	}
	
	public Coordenadas uniqueCoordenadas(PersistentSession session) {
		return (Coordenadas) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Coordenadas[] listCoordenadas(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Coordenadas[]) list.toArray(new Coordenadas[list.size()]);
	}
}

