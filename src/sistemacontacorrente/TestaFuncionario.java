package sistemacontacorrente;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Clayton";
		f1.salario = 1000;
		f1.status = "ativo";
		System.out.println("Salario: "+f1.salario);
		f1.bonificar(500);
		System.out.println("Salario Natal: "+f1.salario);
	}
}