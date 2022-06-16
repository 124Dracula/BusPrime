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

public class AutocarroCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression numero;
	public final CollectionExpression _viagens;
	
	public AutocarroCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		numero = new IntegerExpression("numero", this);
		_viagens = new CollectionExpression("ORM__viagens", this);
	}
	
	public AutocarroCriteria(PersistentSession session) {
		this(session.createCriteria(Autocarro.class));
	}
	
	public AutocarroCriteria() throws PersistentException {
		this(BusPrimePersistentManager.instance().getSession());
	}
	
	public ViagemCriteria create_viagensCriteria() {
		return new ViagemCriteria(createCriteria("ORM__viagens"));
	}
	
	public Autocarro uniqueAutocarro() {
		return (Autocarro) super.uniqueResult();
	}
	
	public Autocarro[] listAutocarro() {
		java.util.List list = super.list();
		return (Autocarro[]) list.toArray(new Autocarro[list.size()]);
	}
}

