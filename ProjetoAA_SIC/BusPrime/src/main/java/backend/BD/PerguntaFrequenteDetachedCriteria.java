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

public class PerguntaFrequenteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression pergunta;
	public final StringExpression resposta;
	
	public PerguntaFrequenteDetachedCriteria() {
		super(PerguntaFrequente.class, PerguntaFrequenteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pergunta = new StringExpression("pergunta", this.getDetachedCriteria());
		resposta = new StringExpression("resposta", this.getDetachedCriteria());
	}
	
	public PerguntaFrequenteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PerguntaFrequenteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pergunta = new StringExpression("pergunta", this.getDetachedCriteria());
		resposta = new StringExpression("resposta", this.getDetachedCriteria());
	}
	
	public PerguntaFrequente uniquePerguntaFrequente(PersistentSession session) {
		return (PerguntaFrequente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PerguntaFrequente[] listPerguntaFrequente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PerguntaFrequente[]) list.toArray(new PerguntaFrequente[list.size()]);
	}
}

