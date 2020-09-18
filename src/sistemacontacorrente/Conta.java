package sistemacontacorrente;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean sacar(double valor) {
		//double saldoAlterado = saldo - valor;
		//saldo = saldoAlterado;
		//OUTRO OPCAO1
		//saldo = saldo - valor;
		//OUTRO OPCAO2
		//saldo -= valor;
		//OUTRO OPCAO3
		//this.saldo -= valor;
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