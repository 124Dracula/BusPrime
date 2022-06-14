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

public class Percurso {
	public Percurso() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PERCURSO__PARAGEMINICIAL) {
			this._parageminicial = (Paragem) owner;
		}
		
		else if (key == ORMConstants.KEY_PERCURSO__PARAGEMFINAL) {
			this._paragemfinal = (Paragem) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private Paragem _paragemfinal;
	
	private Paragem _parageminicial;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void set_parageminicial(Paragem value) {
		this._parageminicial = value;
	}
	
	public Paragem get_parageminicial() {
		return _parageminicial;
	}
	
	public void set_paragemfinal(Paragem value) {
		this._paragemfinal = value;
	}
	
	public Paragem get_paragemfinal() {
		return _paragemfinal;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
