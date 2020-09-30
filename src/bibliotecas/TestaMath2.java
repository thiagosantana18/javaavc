package bibliotecas;

public class TestaMath2 {
	
	public static void main(String[] args) {
		double n1 = Math.random();
		System.out.println(n1);
		//O m�todo random() retorna um valor do tipo double
		//maior ou igual a 0.0 e menor que 1.0.
		
		float n2 = Math.max(3,2);
		System.out.println(n2);
		//O m�todo max retorna o maior de dois valores,
		//que podem ser do tipo double, float, int ou long.
		
		int n3 = Math.min(15,43);
		System.out.println(n3);
		//O m�todo max retorna o menor de dois valores,
		//que podem ser do tipo double, float, int ou long.
		
		double n4 = Math.ceil(3.75);
		System.out.println(n4);
		//O m�todo ceil retorna um valor do tipo int que seja
		//o mais pr�ximo acima do valor do tipo double informado.
		
		double n5 = Math.floor(3.75);
		System.out.println(n5);
		//O m�todo floor retorna um valor do tipo int que seja
		//o mais pr�ximo abaixo do valor do tipo double informado.
		
		double n6 = Math.exp(2);
		System.out.println(n6);
		//O m�todo exp retorna o n�mero e elevado a um valor
		//do tipo double.
	}
}
