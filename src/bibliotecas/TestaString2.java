package bibliotecas;

public class TestaString2 {

	public static void main(String[] args) {
		String a = "Aprendendo muito Java";
		String b[] = a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		//System.out.println(b[3]);
		
		String c = "aprendendo muito java";
		int i = a.compareTo(a);
		System.out.println(i);
		int j = a.compareTo(c);
		System.out.println(j);
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
		
		a.toLowerCase();
		System.out.println(a);
		String d = a.toLowerCase();
		System.out.println(d);
		String e = a.toUpperCase();
		System.out.println(e);
		//Com a vari�vel "a" e o aux�lio de outras vari�veis
		//crie exemplos para demonstrar a funcionalidade
		//dos seguintes m�todos de String (podem ou n�o ter params):
		//charAt(); lenght(); substring(); indexOf(); lastIndexOf();
		//isEmpty(); contains(); replace();
	}
}
