/**
 * Licensee: ruial(Universidade do Minho)
 * License Type: Academic
 */
package backend.BD;

import org.orm.*;
public class RetrieveAndUpdateBusPrimeData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = BusPrimePersistentManager.instance().getSession().beginTransaction();
		try {
			Utilizador utilizador = UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Update the properties of the persistent object
			UtilizadorDAO.save(utilizador);
			Bilhete bilhete = BilheteDAO.loadBilheteByQuery(null, null);
			// Update the properties of the persistent object
			BilheteDAO.save(bilhete);
			Empresa empresa = EmpresaDAO.loadEmpresaByQuery(null, null);
			// Update the properties of the persistent object
			EmpresaDAO.save(empresa);
			Percurso percurso = PercursoDAO.loadPercursoByQuery(null, null);
			// Update the properties of the persistent object
			PercursoDAO.save(percurso);
			Autocarro autocarro = AutocarroDAO.loadAutocarroByQuery(null, null);
			// Update the properties of the persistent object
			AutocarroDAO.save(autocarro);
			ParagemHora paragemHora = ParagemHoraDAO.loadParagemHoraByQuery(null, null);
			// Update the properties of the persistent object
			ParagemHoraDAO.save(paragemHora);
			Paragem paragem = ParagemDAO.loadParagemByQuery(null, null);
			// Update the properties of the persistent object
			ParagemDAO.save(paragem);
			Coordenadas coordenadas = CoordenadasDAO.loadCoordenadasByQuery(null, null);
			// Update the properties of the persistent object
			CoordenadasDAO.save(coordenadas);
			PerguntaFrequente perguntaFrequente = PerguntaFrequenteDAO.loadPerguntaFrequenteByQuery(null, null);
			// Update the properties of the persistent object
			PerguntaFrequenteDAO.save(perguntaFrequente);
			Viagem viagem = ViagemDAO.loadViagemByQuery(null, null);
			// Update the properties of the persistent object
			ViagemDAO.save(viagem);
			t.commit();
		}
		catch (Exception e) {
			System.out.println("Dei rollback");
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Utilizador by UtilizadorCriteria");
		UtilizadorCriteria utilizadorCriteria = new UtilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//utilizadorCriteria.ID.eq();
		System.out.println(utilizadorCriteria.uniqueUtilizador());
		
		System.out.println("Retrieving Bilhete by BilheteCriteria");
		BilheteCriteria bilheteCriteria = new BilheteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bilheteCriteria.ID.eq();
		System.out.println(bilheteCriteria.uniqueBilhete());
		
		System.out.println("Retrieving Empresa by EmpresaCriteria");
		EmpresaCriteria empresaCriteria = new EmpresaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//empresaCriteria.ID.eq();
		System.out.println(empresaCriteria.uniqueEmpresa());
		
		System.out.println("Retrieving Percurso by PercursoCriteria");
		PercursoCriteria percursoCriteria = new PercursoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//percursoCriteria.ID.eq();
		System.out.println(percursoCriteria.uniquePercurso());
		
		System.out.println("Retrieving Autocarro by AutocarroCriteria");
		AutocarroCriteria autocarroCriteria = new AutocarroCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//autocarroCriteria.ID.eq();
		System.out.println(autocarroCriteria.uniqueAutocarro());
		
		System.out.println("Retrieving ParagemHora by ParagemHoraCriteria");
		ParagemHoraCriteria paragemHoraCriteria = new ParagemHoraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//paragemHoraCriteria.ID.eq();
		System.out.println(paragemHoraCriteria.uniqueParagemHora());
		
		System.out.println("Retrieving Paragem by ParagemCriteria");
		ParagemCriteria paragemCriteria = new ParagemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//paragemCriteria.ID.eq();
		System.out.println(paragemCriteria.uniqueParagem());
		
		System.out.println("Retrieving Coordenadas by CoordenadasCriteria");
		CoordenadasCriteria coordenadasCriteria = new CoordenadasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//coordenadasCriteria.ID.eq();
		System.out.println(coordenadasCriteria.uniqueCoordenadas());
		
		System.out.println("Retrieving PerguntaFrequente by PerguntaFrequenteCriteria");
		PerguntaFrequenteCriteria perguntaFrequenteCriteria = new PerguntaFrequenteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//perguntaFrequenteCriteria.ID.eq();
		System.out.println(perguntaFrequenteCriteria.uniquePerguntaFrequente());
		
		System.out.println("Retrieving Viagem by ViagemCriteria");
		ViagemCriteria viagemCriteria = new ViagemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//viagemCriteria.ID.eq();
		System.out.println(viagemCriteria.uniqueViagem());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateBusPrimeData retrieveAndUpdateBusPrimeData = new RetrieveAndUpdateBusPrimeData();
			try {
				retrieveAndUpdateBusPrimeData.retrieveAndUpdateTestData();
				//retrieveAndUpdateBusPrimeData.retrieveByCriteria();
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
