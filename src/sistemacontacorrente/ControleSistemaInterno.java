package sistemacontacorrente;

//abstract Funcionario
// -> abs FuncionarioEspecial (verifica) ext Funcionario
// -> Gerente

public class ControleSistemaInterno {
	String senha;
	
	void validaSenha(AcessoInterno funcionario) {
		funcionario.verifica(senha);
	}
}
