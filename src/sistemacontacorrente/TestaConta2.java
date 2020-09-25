package sistemacontacorrente;

public class TestaConta2 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.setLimite(100);
		
		
		Conta c2 = new Conta();
		c2.setLimite(200);
		
		if (c1 == c2) { //OID - Object Identifier => testa hash
			System.out.println("São diferentes");
		}
	}

}
