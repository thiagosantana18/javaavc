package excecoes;

import java.io.FileNotFoundException;

public class TestaException2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			new java.io.FileReader("arquivoDeTeste.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
