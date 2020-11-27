package javadb;

import java.sql.SQLException;

public class TestaDAOInsere {

	public static void main(String[] args) {
		try {
			Contato contato = new Contato();
			contato.setNome("Maria");
			contato.setEmail("maria@gmail.com");
			contato.setEndereco("Avenida Brasil 1000");
			
			ContatoDAO dao = new ContatoDAO();
			dao.adiciona(contato);
			System.out.println("Gravação feita com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}