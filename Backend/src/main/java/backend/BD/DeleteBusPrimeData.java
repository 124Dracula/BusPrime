/**
 * Licensee: ruial(Universidade do Minho)
 * License Type: Academic
 */
package backend.BD;

import org.orm.*;
public class DeleteBusPrimeData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = BusPrimePersistentManager.instance().getSession().beginTransaction();
		try {
			Utilizador utilizador = UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Delete the persistent object
			UtilizadorDAO.delete(utilizador);
			Bilhete bilhete = BilheteDAO.loadBilheteByQuery(null, null);
			// Delete the persistent object
			BilheteDAO.delete(bilhete);
			Empresa empresa = EmpresaDAO.loadEmpresaByQuery(null, null);
			// Delete the persistent object
			EmpresaDAO.delete(empresa);
			Percurso percurso = PercursoDAO.loadPercursoByQuery(null, null);
			// Delete the persistent object
			PercursoDAO.delete(percurso);
			Autocarro autocarro = AutocarroDAO.loadAutocarroByQuery(null, null);
			// Delete the persistent object
			AutocarroDAO.delete(autocarro);
			ParagemHora paragemHora = ParagemHoraDAO.loadParagemHoraByQuery(null, null);
			// Delete the persistent object
			ParagemHoraDAO.delete(paragemHora);
			Paragem paragem = ParagemDAO.loadParagemByQuery(null, null);
			// Delete the persistent object
			ParagemDAO.delete(paragem);
			Coordenadas coordenadas = CoordenadasDAO.loadCoordenadasByQuery(null, null);
			// Delete the persistent object
			CoordenadasDAO.delete(coordenadas);
			PerguntaFrequente perguntaFrequente = PerguntaFrequenteDAO.loadPerguntaFrequenteByQuery(null, null);
			// Delete the persistent object
			PerguntaFrequenteDAO.delete(perguntaFrequente);
			Viagem viagem = ViagemDAO.loadViagemByQuery(null, null);
			// Delete the persistent object
			ViagemDAO.delete(viagem);
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
				BusPrimePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
