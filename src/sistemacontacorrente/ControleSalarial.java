package sistemacontacorrente;

public class ControleSalarial {
	private double totalSalarios=0;
	
	//Polimorfismo!!!
	//aplicamos polimorfismo  -> pode ter comportamentos diferentes
	
	public void setTotalSalarios(Gerente g1) {
		this.totalSalarios+=g1.getSalario();
	}

	public double getTotalSalarios() {
		return this.totalSalarios;
	}
}
