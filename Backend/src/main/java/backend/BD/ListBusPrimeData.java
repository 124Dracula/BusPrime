/**
 * Licensee: ruial(Universidade do Minho)
 * License Type: Academic
 */
package backend.BD;

import org.orm.*;
public class ListBusPrimeData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Utilizador...");
		Utilizador[] utilizadors = UtilizadorDAO.listUtilizadorByQuery(null, null);
		int length = Math.min(utilizadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(utilizadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Bilhete...");
		Bilhete[] bilhetes = BilheteDAO.listBilheteByQuery(null, null);
		length = Math.min(bilhetes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bilhetes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empresa...");
		Empresa[] empresas = EmpresaDAO.listEmpresaByQuery(null, null);
		length = Math.min(empresas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(empresas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Percurso...");
		Percurso[] percursos = PercursoDAO.listPercursoByQuery(null, null);
		length = Math.min(percursos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(percursos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Autocarro...");
		Autocarro[] autocarros = AutocarroDAO.listAutocarroByQuery(null, null);
		length = Math.min(autocarros.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(autocarros[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ParagemHora...");
		ParagemHora[] paragemHoras = ParagemHoraDAO.listParagemHoraByQuery(null, null);
		length = Math.min(paragemHoras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paragemHoras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paragem...");
		Paragem[] paragems = ParagemDAO.listParagemByQuery(null, null);
		length = Math.min(paragems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(paragems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Coordenadas...");
		Coordenadas[] coordenadases = CoordenadasDAO.listCoordenadasByQuery(null, null);
		length = Math.min(coordenadases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(coordenadases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PerguntaFrequente...");
		PerguntaFrequente[] perguntaFrequentes = PerguntaFrequenteDAO.listPerguntaFrequenteByQuery(null, null);
		length = Math.min(perguntaFrequentes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(perguntaFrequentes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Viagem...");
		Viagem[] viagems = ViagemDAO.listViagemByQuery(null, null);
		length = Math.min(viagems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(viagems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Utilizador by Criteria...");
		UtilizadorCriteria utilizadorCriteria = new UtilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//utilizadorCriteria.ID.eq();
		utilizadorCriteria.setMaxResults(ROW_COUNT);
		Utilizador[] utilizadors = utilizadorCriteria.listUtilizador();
		int length =utilizadors== null ? 0 : Math.min(utilizadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(utilizadors[i]);
		}
		System.out.println(length + " Utilizador record(s) retrieved."); 
		
		System.out.println("Listing Bilhete by Criteria...");
		BilheteCriteria bilheteCriteria = new BilheteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bilheteCriteria.ID.eq();
		bilheteCriteria.setMaxResults(ROW_COUNT);
		Bilhete[] bilhetes = bilheteCriteria.listBilhete();
		length =bilhetes== null ? 0 : Math.min(bilhetes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bilhetes[i]);
		}
		System.out.println(length + " Bilhete record(s) retrieved."); 
		
		System.out.println("Listing Empresa by Criteria...");
		EmpresaCriteria empresaCriteria = new EmpresaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//empresaCriteria.ID.eq();
		empresaCriteria.setMaxResults(ROW_COUNT);
		Empresa[] empresas = empresaCriteria.listEmpresa();
		length =empresas== null ? 0 : Math.min(empresas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(empresas[i]);
		}
		System.out.println(length + " Empresa record(s) retrieved."); 
		
		System.out.println("Listing Percurso by Criteria...");
		PercursoCriteria percursoCriteria = new PercursoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//percursoCriteria.ID.eq();
		percursoCriteria.setMaxResults(ROW_COUNT);
		Percurso[] percursos = percursoCriteria.listPercurso();
		length =percursos== null ? 0 : Math.min(percursos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(percursos[i]);
		}
		System.out.println(length + " Percurso record(s) retrieved."); 
		
		System.out.println("Listing Autocarro by Criteria...");
		AutocarroCriteria autocarroCriteria = new AutocarroCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//autocarroCriteria.ID.eq();
		autocarroCriteria.setMaxResults(ROW_COUNT);
		Autocarro[] autocarros = autocarroCriteria.listAutocarro();
		length =autocarros== null ? 0 : Math.min(autocarros.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(autocarros[i]);
		}
		System.out.println(length + " Autocarro record(s) retrieved."); 
		
		System.out.println("Listing ParagemHora by Criteria...");
		ParagemHoraCriteria paragemHoraCriteria = new ParagemHoraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//paragemHoraCriteria.ID.eq();
		paragemHoraCriteria.setMaxResults(ROW_COUNT);
		ParagemHora[] paragemHoras = paragemHoraCriteria.listParagemHora();
		length =paragemHoras== null ? 0 : Math.min(paragemHoras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paragemHoras[i]);
		}
		System.out.println(length + " ParagemHora record(s) retrieved."); 
		
		System.out.println("Listing Paragem by Criteria...");
		ParagemCriteria paragemCriteria = new ParagemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//paragemCriteria.ID.eq();
		paragemCriteria.setMaxResults(ROW_COUNT);
		Paragem[] paragems = paragemCriteria.listParagem();
		length =paragems== null ? 0 : Math.min(paragems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(paragems[i]);
		}
		System.out.println(length + " Paragem record(s) retrieved."); 
		
		System.out.println("Listing Coordenadas by Criteria...");
		CoordenadasCriteria coordenadasCriteria = new CoordenadasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//coordenadasCriteria.ID.eq();
		coordenadasCriteria.setMaxResults(ROW_COUNT);
		Coordenadas[] coordenadases = coordenadasCriteria.listCoordenadas();
		length =coordenadases== null ? 0 : Math.min(coordenadases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(coordenadases[i]);
		}
		System.out.println(length + " Coordenadas record(s) retrieved."); 
		
		System.out.println("Listing PerguntaFrequente by Criteria...");
		PerguntaFrequenteCriteria perguntaFrequenteCriteria = new PerguntaFrequenteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//perguntaFrequenteCriteria.ID.eq();
		perguntaFrequenteCriteria.setMaxResults(ROW_COUNT);
		PerguntaFrequente[] perguntaFrequentes = perguntaFrequenteCriteria.listPerguntaFrequente();
		length =perguntaFrequentes== null ? 0 : Math.min(perguntaFrequentes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(perguntaFrequentes[i]);
		}
		System.out.println(length + " PerguntaFrequente record(s) retrieved."); 
		
		System.out.println("Listing Viagem by Criteria...");
		ViagemCriteria viagemCriteria = new ViagemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//viagemCriteria.ID.eq();
		viagemCriteria.setMaxResults(ROW_COUNT);
		Viagem[] viagems = viagemCriteria.listViagem();
		length =viagems== null ? 0 : Math.min(viagems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(viagems[i]);
		}
		System.out.println(length + " Viagem record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListBusPrimeData listBusPrimeData = new ListBusPrimeData();
			try {
				listBusPrimeData.listTestData();
				//listBusPrimeData.listByCriteria();
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
