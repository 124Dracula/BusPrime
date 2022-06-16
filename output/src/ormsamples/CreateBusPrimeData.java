/**
 * Licensee: bruno(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateBusPrimeData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = .BusPrimePersistentManager.instance().getSession().beginTransaction();
		try {
			Utilizador utilizador = Utilizador.createUtilizador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : bilhetes, percursos, paragens, saldo, admin
			utilizador.save();
			Bilhete bilhete = Bilhete.createBilhete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : preco, empresa, _viagem
			bilhete.save();
			Empresa empresa = Empresa.createEmpresa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : empresa
			empresa.save();
			Percurso percurso = Percurso.createPercurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _parageminicial, _paragemfinal
			percurso.save();
			Autocarro autocarro = Autocarro.createAutocarro();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _viagens, numero
			autocarro.save();
			ParagemHora paragemHora = ParagemHora.createParagemHora();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paragem
			paragemHora.save();
			Paragem paragem = Paragem.createParagem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : coordenadas
			paragem.save();
			Coordenadas coordenadas = Coordenadas.createCoordenadas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : coordY, coordX
			coordenadas.save();
			PerguntaFrequente perguntaFrequente = PerguntaFrequente.createPerguntaFrequente();
			// Initialize the properties of the persistent object here
			perguntaFrequente.save();
			Viagem viagem = Viagem.createViagem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _viagem, intercidades, preco, nbilhetes
			viagem.save();
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
				.BusPrimePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
