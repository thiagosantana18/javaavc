package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTeste {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test?useTimezone=true&serverTimezone=UTC", "root", "thi1809");
			System.out.println("Conectado ao Banco de dados MySQL Local.");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
