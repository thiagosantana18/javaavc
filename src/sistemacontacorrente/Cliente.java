package sistemaContaCorrente;

public class Cliente implements AcessoInterno{

	private String nome;
	private String sobrenome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean verifica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " " + this.getSobrenome() + "\n CPF: " + this.getCpf();
	}
	
}
