package bibliotecas;

public class TestaMath3 {

	public static void main(String[] args) {
		double n7 = Math.log(8.91);
		System.out.println(n7);
		//O método log retorna o logaritmo natural de um
		// valor do tipo double.
		
		double n8 = Math.pow(n7, 2.0);
		System.out.println(n8);
		//O método pow retorna um valor do tipo double
		//elevado a um segundo valor do tipo double.
		
		double n9 = Math.sqrt(n8);
		System.out.println(n9);
		//O método sqrt retorna a raiz quadrada de um
		//valor do tipo double.
		
		double n10 = Math.sin(n9);
		System.out.println(n10);
		//O método sin retorna o sino trigonométrico de um
		//valor de um angulo do tipo double informado.
		
		double n11 = Math.toDegrees(n8);
		System.out.println(n11);
		//O método toDegrees converte um angulo medido em
		//radianos para o valor equivalente em graus.
		
		double n12 = Math.toRadians(n11);
		System.out.println(n12);
		//O método toRadians converte um angulo medido em
		//graus para o valor equivalente em radianos.
		
		

	}

}
