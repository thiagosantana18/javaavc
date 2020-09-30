package bibliotecas;

public class TestaMath2 {
	
	public static void main(String[] args) {
		double n1 = Math.random();
		System.out.println(n1);
		//O método random() retorna um valor do tipo double
		//maior ou igual a 0.0 e menor que 1.0.
		
		float n2 = Math.max(3,2);
		System.out.println(n2);
		//O método max retorna o maior de dois valores,
		//que podem ser do tipo double, float, int ou long.
		
		int n3 = Math.min(15,43);
		System.out.println(n3);
		//O método max retorna o menor de dois valores,
		//que podem ser do tipo double, float, int ou long.
		
		double n4 = Math.ceil(3.75);
		System.out.println(n4);
		//O método ceil retorna um valor do tipo int que seja
		//o mais próximo acima do valor do tipo double informado.
		
		double n5 = Math.floor(3.75);
		System.out.println(n5);
		//O método floor retorna um valor do tipo int que seja
		//o mais próximo abaixo do valor do tipo double informado.
		
		double n6 = Math.exp(2);
		System.out.println(n6);
		//O método exp retorna o número e elevado a um valor
		//do tipo double.
	}
}
