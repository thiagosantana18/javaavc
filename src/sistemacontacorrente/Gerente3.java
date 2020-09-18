package sistemacontacorrente;

public class Gerente3 extends Funcionario2{
	int senha;
	
	double getBonus() {//5% que é bonus base + 5000
					   //para o gerente
		//return this.salario * 0.05 + 5000;
		//melhorar a minha manutenibilidade
		//chamando o recurso da classe pai ou
		//super classe: palavra reservada "super"
		return super.getBonus() + 5000;
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