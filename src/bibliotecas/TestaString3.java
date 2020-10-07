package bibliotecas;

public class TestaString3 {

	public static void main(String[] args) {
		String p1 = "Thiago Santana";
		char c1 = p1.charAt(1);
		System.out.println(c1);
		//O método charAt() retorna o caracter correspondente
		//ao índice informado da String.
		
		int i1 = p1.length();
		System.out.println(i1);
		//O método length() retorna o tamanho total da String.
		
		String p2 = p1.substring(7);
		System.out.println(p2);
		//O método substring() retorna uma String que é parte da
		//String principal, começando pelo carater correspondente
		//ao índice informado.
		
		int i2 = p1.indexOf("i");
		System.out.println(i2);
		//O método indexOf() retorna o índice da primeira
		//ocorrência do caracter informado. Caso não houver nenhuma
		//ocorrência, retorna -1.
		
		int i3 = p1.lastIndexOf("a");
		System.out.println(i3);
		//O método lastIndexOf() retorna o índice da última
		//ocorrência do caracter informado. Caso não houver nenhuma
		//ocorrência, retorna -1.
		
		boolean b1 = p1.isEmpty();
		System.out.println(b1);
		//O método isEmpty() retorna true se e somente se o tamanho
		//total da String for 0, senão retorna false.
		
		boolean b2 = p1.contains("San");
		System.out.println(b2);
		//O método isEmpty() retorna true se e somente se a String
		//possui a sequência de caracteres informada, senão retorna false.
		
		String p3 = p1.replace("Santana", "Gonçalves");
		System.out.println(p3);
		//O método replace() troca a sequência de caracteres informada por uma
		//segunda sequência de caracteres informada.
	}

}
