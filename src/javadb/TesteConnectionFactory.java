package javadb;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConnectionFactory {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			System.out.println("Conectado ao Banco de dados MySQL Local.");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
