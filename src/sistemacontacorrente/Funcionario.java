package sistemaContaCorrente;

abstract public class Funcionario {
	
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

	//bonificacao fixa ad-hoc
//	public void bonificar(double bonus) {
//		this.salario += bonus;
//	}
	
	//se a classe tiver metodos abstratos, ela tem que ser abstrata
	//mas nem toda classe abstrata tem metodos abstratos
	abstract public double getBonus();

	//a consequencia de uma classe ser abstrata, é que ela não pode ser instanciada
	//ela não pode ser instanciada 
	//mas pode ser referenciada
	//e a consequencia de um metodo ser abstrato eh que todos que herdam da classe abstrata são obrigados
	//a implementar o metodo abstrato
	
	//classe C1 abstrata com metodo m1 abstrato
	//classe C2 abstrata que herda C1->não precisa implementar
	//classe C3 concreta que herda C2->obrigada a implementar m1
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nDepartamento: " + this.getDepartamento() + 
				"\nData de Admiss�o: " + this.getDataAdmissao() + "\nSalario: " + this.getSalario() + "\nStatus: " +
				this.getStatus();
	}
}
