package sistemacontacorrente;

public class TestaConta4 {
	public static void main(String[] args) {
		Conta4 c1 = new Conta4("Railton","1234");
		System.out.println("Nome do cliente: "+c1.cliente.nome);
		System.out.println("CPF do cliente: "+c1.cliente.cpf);
		//int contador = c1.getContadorContas();
		int contador = Conta4.getContadorContas();//pois agora eh um metodo da classe
		System.out.println("Nosso banco possui "+contador+" contas");
		
		Conta4 c2 = new Conta4("Lucas","5678");
		System.out.println("Nome do cliente: "+c2.cliente.nome);
		System.out.println("CPF do cliente: "+c2.cliente.cpf);
		//contador = c2.getContadorContas();
		contador = Conta4.getContadorContas();//pois agora eh um metodo da classe
		System.out.println("Nosso banco possui "+contador+" contas");
	}
}