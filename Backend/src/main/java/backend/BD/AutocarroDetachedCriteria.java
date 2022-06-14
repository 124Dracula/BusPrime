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

public class AutocarroDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression numero;
	public final CollectionExpression _viagens;
	
	public AutocarroDetachedCriteria() {
		super(Autocarro.class, AutocarroCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		numero = new IntegerExpression("numero", this.getDetachedCriteria());
		_viagens = new CollectionExpression("ORM__viagens", this.getDetachedCriteria());
	}
	
	public AutocarroDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AutocarroCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		numero = new IntegerExpression("numero", this.getDetachedCriteria());
		_viagens = new CollectionExpression("ORM__viagens", this.getDetachedCriteria());
	}
	
	public ViagemDetachedCriteria create_viagensCriteria() {
		return new ViagemDetachedCriteria(createCriteria("ORM__viagens"));
	}
	
	public Autocarro uniqueAutocarro(PersistentSession session) {
		return (Autocarro) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Autocarro[] listAutocarro(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Autocarro[]) list.toArray(new Autocarro[list.size()]);
	}
}

