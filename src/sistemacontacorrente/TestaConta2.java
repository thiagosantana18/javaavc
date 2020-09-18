package sistemacontacorrente;

public class TestaConta2 {
	public static void main(String[] args) {
		//Conta c1; //declaracao da var c1 do tipo Conta
		//c1 = new Conta(); //instaciacao do objeto
		
		//declaracao e instanciacao na mesma linha
		Conta2 c1 = new Conta2();
		
		//inicializar os atributos c/ o operador "."
		c1.numero = 001;
		c1.nome = "Clayton";
		c1.saldo = 1000;
		c1.limite = 500;
		System.out.println("Num. conta: "+c1.numero);
		System.out.println("Titular conta: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite: "+c1.limite);
		
//		double valor = 5000; //inicializar valor do saque
//		boolean result = c1.sacar(valor); //operacao do saque
//		if(result) { //validacao do saque
//			System.out.println("Você sacou R$"+valor);
//		} else {
//			System.out.println("Limite acima do possível");
//		}
		
//		c1.sacar(5000);
//		System.out.println("Saldo atual: "+c1.saldo);
		
		if(c1.sacar(80)) {
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Limite acima do possível");
		}
		
		c1.depositar(1000);
		System.out.println("Saldo atual: "+c1.saldo);
		
		System.out.println(c1);
		
	}
}