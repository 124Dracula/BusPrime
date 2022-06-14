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

public class PerguntaFrequente {
	public PerguntaFrequente() {
	}
	
	private int ID;
	
	private String pergunta;
	
	private String resposta;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPergunta(String value) {
		this.pergunta = value;
	}
	
	public String getPergunta() {
		return pergunta;
	}
	
	public void setResposta(String value) {
		this.resposta = value;
	}
	
	public String getResposta() {
		return resposta;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
