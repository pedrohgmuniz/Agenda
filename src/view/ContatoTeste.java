package view;

import model.Contato;
import dao.ContatoDao;
import daoImpl.ContatoDaoImpl;

public class ContatoTeste {

	public static void main(String[] args) {
		inserir();

		}
		
		public static void inserir() { 
			Contato contato = new Contato();
			contato.setNomeContato("Pedro");
			contato.setSexoContato("masculino");
			contato.setTelefoneContato(32345678);
			contato.setEnderecoContato("Rua 9, 666, Jardim dos Coqueiros");
			contato.setEmailContato("pedro@email.com");
			
			ContatoDao cd = new ContatoDaoImpl();
			cd.inserir(contato);

	}

}
