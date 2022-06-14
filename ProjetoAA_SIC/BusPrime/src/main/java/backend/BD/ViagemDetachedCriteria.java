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

public class ViagemDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression nbilhetes;
	public final DoubleExpression preco;
	public final BooleanExpression intercidades;
	public final CollectionExpression _viagem;
	
	public ViagemDetachedCriteria() {
		super(Viagem.class, ViagemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nbilhetes = new IntegerExpression("nbilhetes", this.getDetachedCriteria());
		preco = new DoubleExpression("preco", this.getDetachedCriteria());
		intercidades = new BooleanExpression("intercidades", this.getDetachedCriteria());
		_viagem = new CollectionExpression("ORM__viagem", this.getDetachedCriteria());
	}
	
	public ViagemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ViagemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nbilhetes = new IntegerExpression("nbilhetes", this.getDetachedCriteria());
		preco = new DoubleExpression("preco", this.getDetachedCriteria());
		intercidades = new BooleanExpression("intercidades", this.getDetachedCriteria());
		_viagem = new CollectionExpression("ORM__viagem", this.getDetachedCriteria());
	}
	
	public ParagemHoraDetachedCriteria create_viagemCriteria() {
		return new ParagemHoraDetachedCriteria(createCriteria("ORM__viagem"));
	}
	
	public Viagem uniqueViagem(PersistentSession session) {
		return (Viagem) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Viagem[] listViagem(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Viagem[]) list.toArray(new Viagem[list.size()]);
	}
}

