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

public class ViagemCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression nbilhetes;
	public final DoubleExpression preco;
	public final BooleanExpression intercidades;
	public final CollectionExpression _viagem;
	
	public ViagemCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nbilhetes = new IntegerExpression("nbilhetes", this);
		preco = new DoubleExpression("preco", this);
		intercidades = new BooleanExpression("intercidades", this);
		_viagem = new CollectionExpression("ORM__viagem", this);
	}
	
	public ViagemCriteria(PersistentSession session) {
		this(session.createCriteria(Viagem.class));
	}
	
	public ViagemCriteria() throws PersistentException {
		this(BusPrimePersistentManager.instance().getSession());
	}
	
	public ParagemHoraCriteria create_viagemCriteria() {
		return new ParagemHoraCriteria(createCriteria("ORM__viagem"));
	}
	
	public Viagem uniqueViagem() {
		return (Viagem) super.uniqueResult();
	}
	
	public Viagem[] listViagem() {
		java.util.List list = super.list();
		return (Viagem[]) list.toArray(new Viagem[list.size()]);
	}
}

