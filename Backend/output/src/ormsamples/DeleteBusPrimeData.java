/**
 * Licensee: bruno(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteBusPrimeData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = .BusPrimePersistentManager.instance().getSession().beginTransaction();
		try {
			Utilizador utilizador = Utilizador.loadUtilizadorByQuery(null, null);
			utilizador.delete();
			Bilhete bilhete = Bilhete.loadBilheteByQuery(null, null);
			bilhete.delete();
			Empresa empresa = Empresa.loadEmpresaByQuery(null, null);
			empresa.delete();
			Percurso percurso = Percurso.loadPercursoByQuery(null, null);
			percurso.delete();
			Autocarro autocarro = Autocarro.loadAutocarroByQuery(null, null);
			autocarro.delete();
			ParagemHora paragemHora = ParagemHora.loadParagemHoraByQuery(null, null);
			paragemHora.delete();
			Paragem paragem = Paragem.loadParagemByQuery(null, null);
			paragem.delete();
			Coordenadas coordenadas = Coordenadas.loadCoordenadasByQuery(null, null);
			coordenadas.delete();
			PerguntaFrequente perguntaFrequente = PerguntaFrequente.loadPerguntaFrequenteByQuery(null, null);
			perguntaFrequente.delete();
			Viagem viagem = Viagem.loadViagemByQuery(null, null);
			viagem.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteBusPrimeData deleteBusPrimeData = new DeleteBusPrimeData();
			try {
				deleteBusPrimeData.deleteTestData();
			}
			finally {
				.BusPrimePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
