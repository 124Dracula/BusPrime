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

public class Utilizador {
	public Utilizador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_UTILIZADOR_PARAGENS) {
			return ORM_paragens;
		}
		else if (key == ORMConstants.KEY_UTILIZADOR_PERCURSOS) {
			return ORM_percursos;
		}
		else if (key == ORMConstants.KEY_UTILIZADOR_BILHETES) {
			return ORM_bilhetes;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private boolean admin;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private double saldo;
	
	private java.util.Set ORM_paragens = new java.util.HashSet();
	
	private java.util.Set ORM_percursos = new java.util.HashSet();
	
	private java.util.Set ORM_bilhetes = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAdmin(boolean value) {
		this.admin = value;
	}
	
	public boolean getAdmin() {
		return admin;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setSaldo(double value) {
		this.saldo = value;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	private void setORM_Paragens(java.util.Set value) {
		this.ORM_paragens = value;
	}
	
	private java.util.Set getORM_Paragens() {
		return ORM_paragens;
	}
	
	public final ParagemSetCollection paragens = new ParagemSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILIZADOR_PARAGENS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Percursos(java.util.Set value) {
		this.ORM_percursos = value;
	}
	
	private java.util.Set getORM_Percursos() {
		return ORM_percursos;
	}
	
	public final PercursoSetCollection percursos = new PercursoSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILIZADOR_PERCURSOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Bilhetes(java.util.Set value) {
		this.ORM_bilhetes = value;
	}
	
	private java.util.Set getORM_Bilhetes() {
		return ORM_bilhetes;
	}
	
	public final BilheteSetCollection bilhetes = new BilheteSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILIZADOR_BILHETES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
