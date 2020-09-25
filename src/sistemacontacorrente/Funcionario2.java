package sistemacontacorrente;

public class Funcionario2 {
	//protected String nome;
	private String nome;
	private String cpf;
	private String departamento;
	private String dataAdmissao;
	protected double salario;
	private String status;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//bonificacao passou de fixa para percentual do salario
	double getBonus() {//5% do salario para o func comum
		return this.salario * 0.05;
	}

	boolean verifica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}