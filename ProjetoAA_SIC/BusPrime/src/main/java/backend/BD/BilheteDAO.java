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

public class BilheteDAO {
	public static Bilhete loadBilheteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadBilheteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete getBilheteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getBilheteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete loadBilheteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadBilheteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete getBilheteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getBilheteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete loadBilheteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Bilhete) session.load(Bilhete.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete getBilheteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Bilhete) session.get(Bilhete.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete loadBilheteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bilhete) session.load(Bilhete.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete getBilheteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bilhete) session.get(Bilhete.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBilhete(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryBilhete(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBilhete(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryBilhete(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete[] listBilheteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listBilheteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete[] listBilheteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listBilheteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBilhete(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Bilhete as Bilhete");
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
	
	public static List queryBilhete(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Bilhete as Bilhete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bilhete", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete[] listBilheteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBilhete(session, condition, orderBy);
			return (Bilhete[]) list.toArray(new Bilhete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete[] listBilheteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBilhete(session, condition, orderBy, lockMode);
			return (Bilhete[]) list.toArray(new Bilhete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete loadBilheteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadBilheteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete loadBilheteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadBilheteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete loadBilheteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Bilhete[] bilhetes = listBilheteByQuery(session, condition, orderBy);
		if (bilhetes != null && bilhetes.length > 0)
			return bilhetes[0];
		else
			return null;
	}
	
	public static Bilhete loadBilheteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Bilhete[] bilhetes = listBilheteByQuery(session, condition, orderBy, lockMode);
		if (bilhetes != null && bilhetes.length > 0)
			return bilhetes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBilheteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iterateBilheteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBilheteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iterateBilheteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBilheteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Bilhete as Bilhete");
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
	
	public static java.util.Iterator iterateBilheteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Bilhete as Bilhete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bilhete", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete createBilhete() {
		return new Bilhete();
	}
	
	public static boolean save(Bilhete bilhete) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().saveObject(bilhete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Bilhete bilhete) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().deleteObject(bilhete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Bilhete bilhete) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().refresh(bilhete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Bilhete bilhete) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().evict(bilhete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bilhete loadBilheteByCriteria(BilheteCriteria bilheteCriteria) {
		Bilhete[] bilhetes = listBilheteByCriteria(bilheteCriteria);
		if(bilhetes == null || bilhetes.length == 0) {
			return null;
		}
		return bilhetes[0];
	}
	
	public static Bilhete[] listBilheteByCriteria(BilheteCriteria bilheteCriteria) {
		return bilheteCriteria.listBilhete();
	}
}
