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

public class ParagemHora {
	public ParagemHora() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PARAGEMHORA_PARAGEM) {
			this.paragem = (Paragem) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private Paragem paragem;
	
	private String hora;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setHora(String value) {
		this.hora = value;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setParagem(Paragem value) {
		this.paragem = value;
	}
	
	public Paragem getParagem() {
		return paragem;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
