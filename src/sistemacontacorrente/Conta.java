package sistemaContaCorrente;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	private double limite;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo+=valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo + this.limite>=valor) {
			this.saldo-=valor; //O saldo pode ficar negativo mesmo.
			return true;
		}
		else { 
			return false;
		}
	}
	
	public String toString() {
		return ("Numero da conta: " + getNumero() + "\nNome do titular: " + getNome() + "\nSaldo: " + getSaldo() + "\nLimite: " + getLimite());
	}
}
