package sistemaContaCorrente;

//Classe abstrata não precisa implementar metodos abstratos dos pais abstratos

public abstract class FuncionarioEspecial extends Funcionario{
	abstract boolean verifica(String senha);
}
