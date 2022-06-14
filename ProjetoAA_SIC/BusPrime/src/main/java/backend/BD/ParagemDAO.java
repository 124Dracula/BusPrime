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

public class ParagemDAO {
	public static Paragem loadParagemByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadParagemByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem getParagemByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getParagemByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem loadParagemByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadParagemByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem getParagemByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getParagemByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem loadParagemByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Paragem) session.load(Paragem.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem getParagemByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Paragem) session.get(Paragem.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem loadParagemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paragem) session.load(Paragem.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem getParagemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paragem) session.get(Paragem.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParagem(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryParagem(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParagem(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryParagem(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem[] listParagemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listParagemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem[] listParagemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listParagemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParagem(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Paragem as Paragem");
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
	
	public static List queryParagem(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Paragem as Paragem");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paragem", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem[] listParagemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryParagem(session, condition, orderBy);
			return (Paragem[]) list.toArray(new Paragem[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem[] listParagemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryParagem(session, condition, orderBy, lockMode);
			return (Paragem[]) list.toArray(new Paragem[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem loadParagemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadParagemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem loadParagemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadParagemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem loadParagemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paragem[] paragems = listParagemByQuery(session, condition, orderBy);
		if (paragems != null && paragems.length > 0)
			return paragems[0];
		else
			return null;
	}
	
	public static Paragem loadParagemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paragem[] paragems = listParagemByQuery(session, condition, orderBy, lockMode);
		if (paragems != null && paragems.length > 0)
			return paragems[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateParagemByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iterateParagemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParagemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iterateParagemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParagemByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Paragem as Paragem");
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
	
	public static java.util.Iterator iterateParagemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Paragem as Paragem");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paragem", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem createParagem() {
		return new Paragem();
	}
	
	public static boolean save(Paragem paragem) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().saveObject(paragem);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Paragem paragem) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().deleteObject(paragem);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Paragem paragem) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().refresh(paragem);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Paragem paragem) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().evict(paragem);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paragem loadParagemByCriteria(ParagemCriteria paragemCriteria) {
		Paragem[] paragems = listParagemByCriteria(paragemCriteria);
		if(paragems == null || paragems.length == 0) {
			return null;
		}
		return paragems[0];
	}
	
	public static Paragem[] listParagemByCriteria(ParagemCriteria paragemCriteria) {
		return paragemCriteria.listParagem();
	}
}
