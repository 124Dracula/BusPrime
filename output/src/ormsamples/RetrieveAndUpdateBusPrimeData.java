/**
 * Licensee: bruno(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateBusPrimeData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = .BusPrimePersistentManager.instance().getSession().beginTransaction();
		try {
			Utilizador utilizador = Utilizador.loadUtilizadorByQuery(null, null);
			// Update the properties of the persistent object
			utilizador.save();
			Bilhete bilhete = Bilhete.loadBilheteByQuery(null, null);
			// Update the properties of the persistent object
			bilhete.save();
			Empresa empresa = Empresa.loadEmpresaByQuery(null, null);
			// Update the properties of the persistent object
			empresa.save();
			Percurso percurso = Percurso.loadPercursoByQuery(null, null);
			// Update the properties of the persistent object
			percurso.save();
			Autocarro autocarro = Autocarro.loadAutocarroByQuery(null, null);
			// Update the properties of the persistent object
			autocarro.save();
			ParagemHora paragemHora = ParagemHora.loadParagemHoraByQuery(null, null);
			// Update the properties of the persistent object
			paragemHora.save();
			Paragem paragem = Paragem.loadParagemByQuery(null, null);
			// Update the properties of the persistent object
			paragem.save();
			Coordenadas coordenadas = Coordenadas.loadCoordenadasByQuery(null, null);
			// Update the properties of the persistent object
			coordenadas.save();
			PerguntaFrequente perguntaFrequente = PerguntaFrequente.loadPerguntaFrequenteByQuery(null, null);
			// Update the properties of the persistent object
			perguntaFrequente.save();
			Viagem viagem = Viagem.loadViagemByQuery(null, null);
			// Update the properties of the persistent object
			viagem.save();
			t.commit();
		}
		catch (Exception e) {
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
				.BusPrimePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
