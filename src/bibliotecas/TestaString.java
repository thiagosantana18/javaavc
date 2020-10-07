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
			System.out.println("i e j são iguais");
		} else {
			System.out.println("i e j são diferentes");
		}
		
		if (a == b) {
			System.out.println("a e b são iguais");
		} else {
			System.out.println("a e b são diferentes");
		}
		
		if (c == d) {
			System.out.println("c e d são iguais");
		} else {
			System.out.println("c e d são diferentes");
		}
	}
}
