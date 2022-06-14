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

public class BilheteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _viagemId;
	public final AssociationExpression _viagem;
	public final IntegerExpression empresaId;
	public final AssociationExpression empresa;
	public final DoubleExpression preco;
	public final StringExpression partida;
	public final StringExpression chegada;
	
	public BilheteDetachedCriteria() {
		super(Bilhete.class, BilheteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_viagemId = new IntegerExpression("_viagem.ID", this.getDetachedCriteria());
		_viagem = new AssociationExpression("_viagem", this.getDetachedCriteria());
		empresaId = new IntegerExpression("empresa.ID", this.getDetachedCriteria());
		empresa = new AssociationExpression("empresa", this.getDetachedCriteria());
		preco = new DoubleExpression("preco", this.getDetachedCriteria());
		partida = new StringExpression("partida", this.getDetachedCriteria());
		chegada = new StringExpression("chegada", this.getDetachedCriteria());
	}
	
	public BilheteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, BilheteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_viagemId = new IntegerExpression("_viagem.ID", this.getDetachedCriteria());
		_viagem = new AssociationExpression("_viagem", this.getDetachedCriteria());
		empresaId = new IntegerExpression("empresa.ID", this.getDetachedCriteria());
		empresa = new AssociationExpression("empresa", this.getDetachedCriteria());
		preco = new DoubleExpression("preco", this.getDetachedCriteria());
		partida = new StringExpression("partida", this.getDetachedCriteria());
		chegada = new StringExpression("chegada", this.getDetachedCriteria());
	}
	
	public ViagemDetachedCriteria create_viagemCriteria() {
		return new ViagemDetachedCriteria(createCriteria("_viagem"));
	}
	
	public EmpresaDetachedCriteria createEmpresaCriteria() {
		return new EmpresaDetachedCriteria(createCriteria("empresa"));
	}
	
	public Bilhete uniqueBilhete(PersistentSession session) {
		return (Bilhete) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Bilhete[] listBilhete(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Bilhete[]) list.toArray(new Bilhete[list.size()]);
	}
}

