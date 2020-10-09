package sistemacontacorrente;

public class TestePolimorfismoControleSalarial {

	public static void main(String[] args) {
		ControleSalarial controle = new ControleSalarial();
				
//		Funcionario  f1 = new Funcionario();
//		f1.setSalario(1000);
//		controle.setTotalSalarios(f1);
//		System.out.println(controle.getTotalSalarios());
		
		Gerente g1 = new Gerente();
		g1.setSalario(2000);
		controle.setTotalSalarios(g1);
		System.out.println(controle.getTotalSalarios());
	}
}
