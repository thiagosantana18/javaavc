package sistemacontacorrente;

public class Gerente2 extends Funcionario implements AcessoInterno {
	private int senha;
	
	@Override
	public double getBonus() {
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
	
	public boolean verifica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}

