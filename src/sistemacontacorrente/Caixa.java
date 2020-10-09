package sistemacontacorrente;

public class Caixa extends FuncionarioEspecial {

	int senha;
	
	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	public boolean verifica(int senha) {
//		return false;
//	}

	@Override
	boolean verifica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
