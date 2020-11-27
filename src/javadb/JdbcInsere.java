package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsere {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			String sql = "INSERT into contatos (nome, email, endereco) values (?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "João");
			stmt.setString(2, "joão@gmail.com");
			stmt.setString(3, "Avenida Brasil 1000");
			stmt.execute();
			stmt.close();
			System.out.println("Gravação feita com sucesso!");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
