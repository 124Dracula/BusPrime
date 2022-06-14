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

public class Bilhete {
	public Bilhete() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_BILHETE_EMPRESA) {
			this.empresa = (Empresa) owner;
		}
		
		else if (key == ORMConstants.KEY_BILHETE__VIAGEM) {
			this._viagem = (Viagem) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private Viagem _viagem;
	
	private Empresa empresa;
	
	private double preco;
	
	private String partida;
	
	private String chegada;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPreco(double value) {
		this.preco = value;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPartida(String value) {
		this.partida = value;
	}
	
	public String getPartida() {
		return partida;
	}
	
	public void setChegada(String value) {
		this.chegada = value;
	}
	
	public String getChegada() {
		return chegada;
	}
	
	public void setEmpresa(Empresa value) {
		this.empresa = value;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void set_viagem(Viagem value) {
		this._viagem = value;
	}
	
	public Viagem get_viagem() {
		return _viagem;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
