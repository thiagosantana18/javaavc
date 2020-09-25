package sistemacontacorrente;

public class TestaGerente2 {

	public static void main(String[] args) {
//		Funcionario f1 = new Funcionario();
//		f1.setSalario(1000);
//		double salFunc = f1.getSalario();
//		System.out.println("Sal�rio do funcionario: R$"+salFunc);
//		double bonusFunc = f1.getBonus();
//		System.out.println("Bonus do funcionario: R$"+bonusFunc );
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		double salGer = g1.getSalario();
		System.out.println("Salario do gerente: R$"+salGer);
		double bonusGer = g1.getBonus();
		System.out.println("Bonus do funcionario: R$"+bonusGer );
		
	}

}
