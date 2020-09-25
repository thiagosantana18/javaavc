package sistemacontacorrente;

public class TestaConta4 {

	public static void main(String[] args) {
		Conta4 c1 = new Conta4("Railton","2345");
		System.out.println("Nome do cliente:" + c1.cliente.getNome());
		System.out.println("CPF do cliente: " + c1.cliente.getCpf());
		int contador = Conta4.getContadorDeConta();
		System.out.println("Quantidade de contas: " + contador);
		
		Conta4 c2 = new Conta4("Lucas","2333");
		System.out.println("Nome do cliente:" + c2.cliente.getNome());
		System.out.println("CPF do cliente: " + c2.cliente.getCpf());
		contador = Conta4.getContadorDeConta();
		System.out.println("Quantidade de contas: " + contador);
		
		
	}

}
