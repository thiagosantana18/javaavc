package sistemacontacorrente;

public class Conta2 {

	private int numero;
	private double saldo;
	private double limite;
	private Cliente cliente;
	
	public Conta2(String nome, String cpf) {
		this.cliente = new Cliente();
		this.cliente.setNome(nome);
		this.cliente.setCpf(cpf);
	}
	
	public Conta2(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
		return ("Numero da conta: " + getNumero() + "\nTitular: \n" + this.cliente + "\nSaldo: " + getSaldo() + "\nLimite: " + getLimite());
	}
}
