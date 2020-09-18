package sistemaContaCorrente;

public class ControleBonus {
	private double totalBonus = 0;
	
	//mas classes abstratas podem ser referenciadas
	public void setTotalBonus(Funcionario funcionario) {
		this.totalBonus+=funcionario.getBonus();
	}
	
	public double getTotalBonus() {
		return this.totalBonus;
	}
}
