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

public class EmpresaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final CollectionExpression empresa;
	
	public EmpresaDetachedCriteria() {
		super(Empresa.class, .EmpresaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		empresa = new CollectionExpression("ORM_Empresa", this.getDetachedCriteria());
	}
	
	public EmpresaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, .EmpresaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		empresa = new CollectionExpression("ORM_Empresa", this.getDetachedCriteria());
	}
	
	public AutocarroDetachedCriteria createEmpresaCriteria() {
		return new AutocarroDetachedCriteria(createCriteria("ORM_Empresa"));
	}
	
	public Empresa uniqueEmpresa(PersistentSession session) {
		return (Empresa) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Empresa[] listEmpresa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Empresa[]) list.toArray(new Empresa[list.size()]);
	}
}

