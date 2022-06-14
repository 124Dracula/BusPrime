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

public class ParagemHoraDAO {
	public static ParagemHora loadParagemHoraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadParagemHoraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora getParagemHoraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getParagemHoraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora loadParagemHoraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadParagemHoraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora getParagemHoraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getParagemHoraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora loadParagemHoraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ParagemHora) session.load(ParagemHora.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora getParagemHoraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ParagemHora) session.get(ParagemHora.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora loadParagemHoraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ParagemHora) session.load(ParagemHora.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora getParagemHoraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ParagemHora) session.get(ParagemHora.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParagemHora(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryParagemHora(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParagemHora(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryParagemHora(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora[] listParagemHoraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listParagemHoraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora[] listParagemHoraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listParagemHoraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParagemHora(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ParagemHora as ParagemHora");
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
	
	public static List queryParagemHora(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ParagemHora as ParagemHora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ParagemHora", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora[] listParagemHoraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryParagemHora(session, condition, orderBy);
			return (ParagemHora[]) list.toArray(new ParagemHora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora[] listParagemHoraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryParagemHora(session, condition, orderBy, lockMode);
			return (ParagemHora[]) list.toArray(new ParagemHora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora loadParagemHoraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadParagemHoraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora loadParagemHoraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadParagemHoraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora loadParagemHoraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ParagemHora[] paragemHoras = listParagemHoraByQuery(session, condition, orderBy);
		if (paragemHoras != null && paragemHoras.length > 0)
			return paragemHoras[0];
		else
			return null;
	}
	
	public static ParagemHora loadParagemHoraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ParagemHora[] paragemHoras = listParagemHoraByQuery(session, condition, orderBy, lockMode);
		if (paragemHoras != null && paragemHoras.length > 0)
			return paragemHoras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateParagemHoraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iterateParagemHoraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParagemHoraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iterateParagemHoraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParagemHoraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ParagemHora as ParagemHora");
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
	
	public static java.util.Iterator iterateParagemHoraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ParagemHora as ParagemHora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ParagemHora", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora createParagemHora() {
		return new ParagemHora();
	}
	
	public static boolean save(ParagemHora paragemHora) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().saveObject(paragemHora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ParagemHora paragemHora) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().deleteObject(paragemHora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ParagemHora paragemHora) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().refresh(paragemHora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ParagemHora paragemHora) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().evict(paragemHora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ParagemHora loadParagemHoraByCriteria(ParagemHoraCriteria paragemHoraCriteria) {
		ParagemHora[] paragemHoras = listParagemHoraByCriteria(paragemHoraCriteria);
		if(paragemHoras == null || paragemHoras.length == 0) {
			return null;
		}
		return paragemHoras[0];
	}
	
	public static ParagemHora[] listParagemHoraByCriteria(ParagemHoraCriteria paragemHoraCriteria) {
		return paragemHoraCriteria.listParagemHora();
	}
}
