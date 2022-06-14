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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PerguntaFrequenteDAO {
	public static PerguntaFrequente loadPerguntaFrequenteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadPerguntaFrequenteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente getPerguntaFrequenteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getPerguntaFrequenteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente loadPerguntaFrequenteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadPerguntaFrequenteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente getPerguntaFrequenteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getPerguntaFrequenteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente loadPerguntaFrequenteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PerguntaFrequente) session.load(PerguntaFrequente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente getPerguntaFrequenteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PerguntaFrequente) session.get(PerguntaFrequente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente loadPerguntaFrequenteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PerguntaFrequente) session.load(PerguntaFrequente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente getPerguntaFrequenteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PerguntaFrequente) session.get(PerguntaFrequente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPerguntaFrequente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryPerguntaFrequente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPerguntaFrequente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryPerguntaFrequente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente[] listPerguntaFrequenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listPerguntaFrequenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente[] listPerguntaFrequenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listPerguntaFrequenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPerguntaFrequente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PerguntaFrequente as PerguntaFrequente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPerguntaFrequente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PerguntaFrequente as PerguntaFrequente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PerguntaFrequente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente[] listPerguntaFrequenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPerguntaFrequente(session, condition, orderBy);
			return (PerguntaFrequente[]) list.toArray(new PerguntaFrequente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente[] listPerguntaFrequenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPerguntaFrequente(session, condition, orderBy, lockMode);
			return (PerguntaFrequente[]) list.toArray(new PerguntaFrequente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente loadPerguntaFrequenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadPerguntaFrequenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente loadPerguntaFrequenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadPerguntaFrequenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente loadPerguntaFrequenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PerguntaFrequente[] perguntaFrequentes = listPerguntaFrequenteByQuery(session, condition, orderBy);
		if (perguntaFrequentes != null && perguntaFrequentes.length > 0)
			return perguntaFrequentes[0];
		else
			return null;
	}
	
	public static PerguntaFrequente loadPerguntaFrequenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PerguntaFrequente[] perguntaFrequentes = listPerguntaFrequenteByQuery(session, condition, orderBy, lockMode);
		if (perguntaFrequentes != null && perguntaFrequentes.length > 0)
			return perguntaFrequentes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePerguntaFrequenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iteratePerguntaFrequenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePerguntaFrequenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iteratePerguntaFrequenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePerguntaFrequenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PerguntaFrequente as PerguntaFrequente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePerguntaFrequenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PerguntaFrequente as PerguntaFrequente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PerguntaFrequente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente createPerguntaFrequente() {
		return new PerguntaFrequente();
	}
	
	public static boolean save(PerguntaFrequente perguntaFrequente) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().saveObject(perguntaFrequente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(PerguntaFrequente perguntaFrequente) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().deleteObject(perguntaFrequente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(PerguntaFrequente perguntaFrequente) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().refresh(perguntaFrequente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(PerguntaFrequente perguntaFrequente) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().evict(perguntaFrequente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PerguntaFrequente loadPerguntaFrequenteByCriteria(PerguntaFrequenteCriteria perguntaFrequenteCriteria) {
		PerguntaFrequente[] perguntaFrequentes = listPerguntaFrequenteByCriteria(perguntaFrequenteCriteria);
		if(perguntaFrequentes == null || perguntaFrequentes.length == 0) {
			return null;
		}
		return perguntaFrequentes[0];
	}
	
	public static PerguntaFrequente[] listPerguntaFrequenteByCriteria(PerguntaFrequenteCriteria perguntaFrequenteCriteria) {
		return perguntaFrequenteCriteria.listPerguntaFrequente();
	}
}
