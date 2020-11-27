package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
	private Connection con;
	
	public ContatoDAO() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}
	
	public void adiciona(Contato contato) throws SQLException {
		String sql = "INSERT into contatos (nome, email, endereco) values (?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		stmt.execute();
		stmt.close();
		con.close();
	}
	
	public List<Contato> getlista() throws SQLException {
		String sql = "select * from contatos";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rset = stmt.executeQuery();
		List<Contato> contatos = new ArrayList<Contato>();
		
		while (rset.next()) {
			Contato contato = new Contato();
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
			contatos.add(contato);
		}
		rset.close();
		stmt.close();
		con.close();
		return contatos;
	}
}
