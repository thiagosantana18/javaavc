package view;

import java.sql.SQLException;
import java.util.Scanner;

import controller.ContatoDao;
import model.Contato;

public class TestaDao {
	public static void main(String[] args) {	
		int op = 0 ;
		String escolha = "S";
		
		Scanner sc = new Scanner(System.in);
		while ( !escolha.equals("N")) {
			System.out.println("QUAL OPERAÇÃO GOSTARIA DE USAR?");
			System.out.println("DIGITE 1 PARA CRIAR UM CONTATO");
			System.out.println("DIGITE 2 PARA ALTERAR UM CONTATO");
			System.out.println("DIGITE 3 PARA DELETAR UM CONTATO");
			op = sc.nextInt();
			sc.nextLine();
			
			switch (op) {
			case 1:
				try {
					Contato contato = new Contato();
					System.out.println("Insira o nome: ");
					contato.setNome(sc.nextLine());
					System.out.println("Insira email: ");
					contato.setEmail(sc.nextLine());
					System.out.println("Insira o endereco: ");
					contato.setEndereco(sc.nextLine());
					
					ContatoDao dao;
					dao = new ContatoDao();
					dao.adiciona(contato);
					System.out.println("Gravação feita no BD");
				} catch (SQLException e) {
					e.printStackTrace();
				} 
				break;
			case 2:
				try {
					Contato contato = new Contato();
					System.out.println("Insira o ID que gostaria de alterar: ");
					contato.setId(sc.nextLong());
					sc.nextLine();
					System.out.println("Insira o Novo nome: ");
					contato.setNome(sc.nextLine());
					System.out.println("Insira o Novo email");
					contato.setEmail(sc.nextLine());
					System.out.println("Insira o Novo endereco");
					contato.setEndereco(sc.nextLine());
				
					ContatoDao dao;
					dao = new ContatoDao();
					dao.editar(contato);
					System.out.println("Gravação feita no BD");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					Contato contato = new Contato();
					System.out.println("Insira o ID que gostaria de deletar: ");
					contato.setId(sc.nextLong());
					
					ContatoDao dao;
					dao = new ContatoDao();
					dao.remove(contato);
					System.out.println("Gravação feita no BD");
					sc.nextLine();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("VALOR INVALIDO");
				break;
			}
			
			System.out.println("Deseja Continuar? S/N");
			escolha = sc.next();
			sc.nextLine();
		}
		sc.close();
	}
}
