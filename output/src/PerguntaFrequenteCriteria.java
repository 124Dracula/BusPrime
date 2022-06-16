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

public class PerguntaFrequenteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression pergunta;
	public final StringExpression resposta;
	
	public PerguntaFrequenteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		pergunta = new StringExpression("pergunta", this);
		resposta = new StringExpression("resposta", this);
	}
	
	public PerguntaFrequenteCriteria(PersistentSession session) {
		this(session.createCriteria(PerguntaFrequente.class));
	}
	
	public PerguntaFrequenteCriteria() throws PersistentException {
		this(BusPrimePersistentManager.instance().getSession());
	}
	
	public PerguntaFrequente uniquePerguntaFrequente() {
		return (PerguntaFrequente) super.uniqueResult();
	}
	
	public PerguntaFrequente[] listPerguntaFrequente() {
		java.util.List list = super.list();
		return (PerguntaFrequente[]) list.toArray(new PerguntaFrequente[list.size()]);
	}
}

