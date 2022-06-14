/**
 * Licensee: ruial(Universidade do Minho)
 * License Type: Academic
 */
package backend.BD;

import org.orm.*;
public class CreateBusPrimeData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = BusPrimePersistentManager.instance().getSession().beginTransaction();
		try {
			Utilizador utilizador = UtilizadorDAO.createUtilizador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : bilhetes, percursos, paragens, saldo, admin
			UtilizadorDAO.save(utilizador);
			Bilhete bilhete = BilheteDAO.createBilhete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : preco, empresa, _viagem
			BilheteDAO.save(bilhete);
			Empresa empresa = EmpresaDAO.createEmpresa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : empresa
			EmpresaDAO.save(empresa);
			Percurso percurso = PercursoDAO.createPercurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _parageminicial, _paragemfinal
			PercursoDAO.save(percurso);
			Autocarro autocarro = AutocarroDAO.createAutocarro();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _viagens, numero
			AutocarroDAO.save(autocarro);
			ParagemHora paragemHora = ParagemHoraDAO.createParagemHora();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paragem
			ParagemHoraDAO.save(paragemHora);
			Paragem paragem = ParagemDAO.createParagem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : coordenadas
			ParagemDAO.save(paragem);
			Coordenadas coordenadas = CoordenadasDAO.createCoordenadas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : coordY, coordX
			CoordenadasDAO.save(coordenadas);
			PerguntaFrequente perguntaFrequente = PerguntaFrequenteDAO.createPerguntaFrequente();
			// Initialize the properties of the persistent object here
			PerguntaFrequenteDAO.save(perguntaFrequente);
			Viagem viagem = ViagemDAO.createViagem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _viagem, intercidades, preco, nbilhetes
			ViagemDAO.save(viagem);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateBusPrimeData createBusPrimeData = new CreateBusPrimeData();
			try {
				createBusPrimeData.createTestData();
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
