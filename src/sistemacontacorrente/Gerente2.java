package sistemacontacorrente;

public class Gerente2 extends Funcionario2{
	int senha;
	
	double getBonus() {//15% do salario para o gerente
		return this.salario * 0.15;
	}
	
	public boolean verifica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso autorizado!");
			return true;
		} else {
			System.out.println("Acesso não autorizado!");
			return false;
		}
	}
}