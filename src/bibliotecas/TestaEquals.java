package bibliotecas;

public class TestaEquals {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		if (i == j) {
			System.out.println("i e j s�o iguais");
		} else {
			System.out.println("i e j s�o diferentes");
		}
		
		String c = new String("Senac 456");
		String d = new String("Senac 456");
		
		if (c == d) {
			System.out.println("c e d s�o iguais");
		} else {
			System.out.println("c e d s�o diferentes");
		}
		
		if (c.equals(d)) {
			System.out.println("As Strings c e d tem o mesmo conte�do");
		} else {
			System.out.println("As Strings c e d tem conte�do diferente");
		}
	}
}
