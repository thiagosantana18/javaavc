package sistemacontacorrente;

public class TestaContaCliente {
	public static void main(String[] args) {
		Conta3 c3 = new Conta3("clayton","1234");
		
		c3.numero = 001;
		System.out.println("Nro conta:"+c3.numero);
		
		//Somente tentando entender o problema
		//Solucao Gambiarra!!!
		//Nao fortalece a composicao
		Cliente c1 = new Cliente();
		
		c3.cliente = c1;
		
		c3.cliente.nome = "Lucas";
		
		System.out.println("Nome: "+c3.cliente.nome);
	}
}