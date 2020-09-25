package sistemacontacorrente;


//Conta4 = Conta3 + conteúdo static
//atributos e metodos static

//atributo static transforma o atributo de objeto para atributo de classe
public class Conta4 {

	private static int contadorContas;
	private int numero;
	private double saldo;
	private double limite;
	Cliente cliente;
	
	public Conta4(String nome, String cpf) {
		this.cliente = new Cliente();
		this.cliente.setNome(nome);
		this.cliente.setCpf(cpf);
		Conta4.contadorContas++;
	}
	
	public static int getContadorDeConta() {
		return Conta4.contadorContas;
	}
	
	public Conta4(Cliente cliente) {
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
