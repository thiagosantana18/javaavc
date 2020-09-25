package sistemacontacorrente;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.setNumero(1001);
		c1.setNome("Rod");
		c1.setSaldo(100);
		c1.setLimite(500);
		
		System.out.println(c1.sacar(5000) ? "Saque efetuado" : "Saldo insuficiente");
		
		System.out.println(c1.toString());
	}

}
