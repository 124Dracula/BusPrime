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

public class Coordenadas {
	public Coordenadas() {
	}
	
	private int ID;
	
	private double coordX;
	
	private double coordY;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCoordX(double value) {
		this.coordX = value;
	}
	
	public double getCoordX() {
		return coordX;
	}
	
	public void setCoordY(double value) {
		this.coordY = value;
	}
	
	public double getCoordY() {
		return coordY;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
