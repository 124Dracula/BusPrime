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

public class PercursoDAO {
	public static Percurso loadPercursoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadPercursoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso getPercursoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getPercursoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso loadPercursoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadPercursoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso getPercursoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return getPercursoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso loadPercursoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Percurso) session.load(Percurso.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso getPercursoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Percurso) session.get(Percurso.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso loadPercursoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Percurso) session.load(Percurso.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso getPercursoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Percurso) session.get(Percurso.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPercurso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryPercurso(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPercurso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return queryPercurso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso[] listPercursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listPercursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso[] listPercursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return listPercursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPercurso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Percurso as Percurso");
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
	
	public static List queryPercurso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Percurso as Percurso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Percurso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso[] listPercursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPercurso(session, condition, orderBy);
			return (Percurso[]) list.toArray(new Percurso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso[] listPercursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPercurso(session, condition, orderBy, lockMode);
			return (Percurso[]) list.toArray(new Percurso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso loadPercursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadPercursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso loadPercursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return loadPercursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso loadPercursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Percurso[] percursos = listPercursoByQuery(session, condition, orderBy);
		if (percursos != null && percursos.length > 0)
			return percursos[0];
		else
			return null;
	}
	
	public static Percurso loadPercursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Percurso[] percursos = listPercursoByQuery(session, condition, orderBy, lockMode);
		if (percursos != null && percursos.length > 0)
			return percursos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePercursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iteratePercursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePercursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BusPrimePersistentManager.instance().getSession();
			return iteratePercursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePercursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Percurso as Percurso");
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
	
	public static java.util.Iterator iteratePercursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Percurso as Percurso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Percurso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso createPercurso() {
		return new Percurso();
	}
	
	public static boolean save(Percurso percurso) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().saveObject(percurso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Percurso percurso) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().deleteObject(percurso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Percurso percurso) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().refresh(percurso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Percurso percurso) throws PersistentException {
		try {
			BusPrimePersistentManager.instance().getSession().evict(percurso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Percurso loadPercursoByCriteria(PercursoCriteria percursoCriteria) {
		Percurso[] percursos = listPercursoByCriteria(percursoCriteria);
		if(percursos == null || percursos.length == 0) {
			return null;
		}
		return percursos[0];
	}
	
	public static Percurso[] listPercursoByCriteria(PercursoCriteria percursoCriteria) {
		return percursoCriteria.listPercurso();
	}
}
