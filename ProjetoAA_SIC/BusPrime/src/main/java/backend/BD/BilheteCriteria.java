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

public class BilheteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _viagemId;
	public final AssociationExpression _viagem;
	public final IntegerExpression empresaId;
	public final AssociationExpression empresa;
	public final DoubleExpression preco;
	public final StringExpression partida;
	public final StringExpression chegada;
	
	public BilheteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_viagemId = new IntegerExpression("_viagem.ID", this);
		_viagem = new AssociationExpression("_viagem", this);
		empresaId = new IntegerExpression("empresa.ID", this);
		empresa = new AssociationExpression("empresa", this);
		preco = new DoubleExpression("preco", this);
		partida = new StringExpression("partida", this);
		chegada = new StringExpression("chegada", this);
	}
	
	public BilheteCriteria(PersistentSession session) {
		this(session.createCriteria(Bilhete.class));
	}
	
	public BilheteCriteria() throws PersistentException {
		this(BusPrimePersistentManager.instance().getSession());
	}
	
	public ViagemCriteria create_viagemCriteria() {
		return new ViagemCriteria(createCriteria("_viagem"));
	}
	
	public EmpresaCriteria createEmpresaCriteria() {
		return new EmpresaCriteria(createCriteria("empresa"));
	}
	
	public Bilhete uniqueBilhete() {
		return (Bilhete) super.uniqueResult();
	}
	
	public Bilhete[] listBilhete() {
		java.util.List list = super.list();
		return (Bilhete[]) list.toArray(new Bilhete[list.size()]);
	}
}

