package sistemacontacorrente;

//Conta4 = Conta3 + conteudo static
//atributos e metodos static
public class Conta4 {
	private static int contadorContas;
	int numero;
	Cliente cliente;
	double saldo;
	double limite;
	
	Conta4(String nome, String cpf){
		cliente = new Cliente();
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		Conta4.contadorContas++;
	}
	
//	void contarContas() {
//		contadorContas++;
//	}
	
	public static int getContadorContas() {
		return Conta4.contadorContas;
	}
	
	boolean sacar(double valor) {
		if (valor <= this.saldo+this.limite) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
}