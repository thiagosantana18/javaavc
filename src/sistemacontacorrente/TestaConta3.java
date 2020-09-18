package sistemacontacorrente;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta();
		c1.limite = 100;
		
		Conta c2;
		c2 = new Conta();
		c2.limite = 200;
		
		System.out.println("Limite de c1:"+c1.limite);
		System.out.println("Limite de c2:"+c2.limite);
		
		Conta c3;
		c3 = new Conta();
		c3.limite = 300;
		
		System.out.println("Limite de c3:"+c3.limite);
		
		Conta c4;
		c4 = c3;
		c4.limite = 400;
		
		System.out.println("Limite de c4:"+c4.limite);
		System.out.println("Limite de c3:"+c3.limite);
		
		if(c3 == c4) {
			System.out.println("são iguais");
		} else {
			System.out.println("são diferentes");
		}
		
		Conta c5;
		c5 = new Conta();
		c5.nome = "Brenno";
		
		Conta c6;
		c6 = new Conta();
		c6.nome = "Brenno";
		
		if(c5 == c6) {
			System.out.println("são iguais");
		} else {
			System.out.println("são diferentes");
		}
		
		//obs: funciona, mas não é boa prática
		if(c5.nome == c6.nome) {
			System.out.println("são iguais");
		} else {
			System.out.println("são diferentes");
		}
		
		if(c5.equals(c6)) {
			System.out.println("são iguais");
		} else {
			System.out.println("são diferentes");
		}
		
		String c7 = "Clayton";
		String c8 = "Clayton2";
		
		boolean result = c7.equals(c8);
		System.out.println(result);
		
		if(c7.equals(c8)) {
			System.out.println("são iguais");
		} else {
			System.out.println("são diferentes");
		}
			
	}
}