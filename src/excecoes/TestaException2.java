package excecoes;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TestaException2 {

	public static void main(String[] args) {
		try {
			new java.io.FileReader("arquivoDeTeste.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
