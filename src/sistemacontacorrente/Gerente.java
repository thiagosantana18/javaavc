package sistemacontacorrente;

public class Gerente extends Funcionario2{
	private int senha;
	
	@Override
	public double getBonus() {
//		double sal = super.getSalario();
//		return sal * 0.15;
//		return super.getBonus() + 5000;
		return (super.getSalario() * 0.5) + 5000;
	}
	
	public boolean verifica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso autorizado!");
			return true;
		}
		else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	boolean verifica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}

