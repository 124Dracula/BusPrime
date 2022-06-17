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

public class CoordenadasCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression coordX;
	public final DoubleExpression coordY;
	
	public CoordenadasCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		coordX = new DoubleExpression("coordX", this);
		coordY = new DoubleExpression("coordY", this);
	}
	
	public CoordenadasCriteria(PersistentSession session) {
		this(session.createCriteria(Coordenadas.class));
	}
	
	public CoordenadasCriteria() throws PersistentException {
		this(BusPrimePersistentManager.instance().getSession());
	}
	
	public Coordenadas uniqueCoordenadas() {
		return (Coordenadas) super.uniqueResult();
	}
	
	public Coordenadas[] listCoordenadas() {
		java.util.List list = super.list();
		return (Coordenadas[]) list.toArray(new Coordenadas[list.size()]);
	}
}

