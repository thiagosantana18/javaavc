package bibliotecas;

public class TestaString {
	public static void main(String[] args) {
		String a = "Senac 123";
		String b = "Senac 123";
		int i = 0;
		int j = 0;
		String c = new String("Senac 456");
		String d = new String("Senac 456");
		
		if (i == j) {
			System.out.println("i e j s�o iguais");
		} else {
			System.out.println("i e j s�o diferentes");
		}
		
		if (a == b) {
			System.out.println("a e b s�o iguais");
		} else {
			System.out.println("a e b s�o diferentes");
		}
		
		if (c == d) {
			System.out.println("c e d s�o iguais");
		} else {
			System.out.println("c e d s�o diferentes");
		}
	}
}
