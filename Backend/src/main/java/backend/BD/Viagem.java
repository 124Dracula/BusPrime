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

public class Viagem {
	public Viagem() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_VIAGEM__VIAGEM) {
			return ORM__viagem;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private int nbilhetes;
	
	private double preco;
	
	private boolean intercidades;
	
	private java.util.Set ORM__viagem = new java.util.HashSet();
	
	public void setNbilhetes(int value) {
		this.nbilhetes = value;
	}
	
	public int getNbilhetes() {
		return nbilhetes;
	}
	
	public void setPreco(double value) {
		this.preco = value;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setIntercidades(boolean value) {
		this.intercidades = value;
	}
	
	public boolean getIntercidades() {
		return intercidades;
	}
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	private void setORM__viagem(java.util.Set value) {
		this.ORM__viagem = value;
	}
	
	private java.util.Set getORM__viagem() {
		return ORM__viagem;
	}
	
	public final ParagemHoraSetCollection _viagem = new ParagemHoraSetCollection(this, _ormAdapter, ORMConstants.KEY_VIAGEM__VIAGEM, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public int getnBilhetes() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void setnBilhetes(int nBilhetes) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
