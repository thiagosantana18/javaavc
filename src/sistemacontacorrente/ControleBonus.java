package sistemacontacorrente;

public class ControleBonus {
	private double totalBonus = 0;
	
	//mas classes abstratas podem ser referenciadas
	public void setTotalBonus(Gerente g1) {
		this.totalBonus+=g1.getBonus();
	}
	
	public double getTotalBonus() {
		return this.totalBonus;
	}
}
