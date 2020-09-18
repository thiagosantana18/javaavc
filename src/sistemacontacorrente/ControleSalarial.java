package sistemaContaCorrente;

public class ControleSalarial {
	private double totalSalarios=0;
	
	//Polimorfismo!!!
	//aplicamos polimorfismo  -> pode ter comportamentos diferentes
	
	public void setTotalSalarios(Funcionario funcionario) {
		this.totalSalarios+=funcionario.getSalario();
	}

	public double getTotalSalarios() {
		return this.totalSalarios;
	}
}
