package sistemacontacorrente;

public class Conta2 {
	int numero;
	String nome;
	double saldo;
	double limite;
	
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
	
	public String toString() {
		return("Número:"+this.numero+ "\nNome: " +this.nome+ "\nSaldo"+this.saldo+ "\nLimite: "+this.limite);
	}

}
