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

public class Autocarro {
	public Autocarro() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_AUTOCARRO__VIAGENS) {
			return ORM__viagens;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private int numero;
	
	private java.util.Set ORM__viagens = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNumero(int value) {
		this.numero = value;
	}
	
	public int getNumero() {
		return numero;
	}
	
	private void setORM__viagens(java.util.Set value) {
		this.ORM__viagens = value;
	}
	
	private java.util.Set getORM__viagens() {
		return ORM__viagens;
	}
	
	public final ViagemSetCollection _viagens = new ViagemSetCollection(this, _ormAdapter, ORMConstants.KEY_AUTOCARRO__VIAGENS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setPreco(double preco) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
