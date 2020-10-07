package bibliotecas;

public class TestaString3 {

	public static void main(String[] args) {
		String p1 = "Thiago Santana";
		char c1 = p1.charAt(1);
		System.out.println(c1);
		//O m�todo charAt() retorna o caracter correspondente
		//ao �ndice informado da String.
		
		int i1 = p1.length();
		System.out.println(i1);
		//O m�todo length() retorna o tamanho total da String.
		
		String p2 = p1.substring(7);
		System.out.println(p2);
		//O m�todo substring() retorna uma String que � parte da
		//String principal, come�ando pelo carater correspondente
		//ao �ndice informado.
		
		int i2 = p1.indexOf("i");
		System.out.println(i2);
		//O m�todo indexOf() retorna o �ndice da primeira
		//ocorr�ncia do caracter informado. Caso n�o houver nenhuma
		//ocorr�ncia, retorna -1.
		
		int i3 = p1.lastIndexOf("a");
		System.out.println(i3);
		//O m�todo lastIndexOf() retorna o �ndice da �ltima
		//ocorr�ncia do caracter informado. Caso n�o houver nenhuma
		//ocorr�ncia, retorna -1.
		
		boolean b1 = p1.isEmpty();
		System.out.println(b1);
		//O m�todo isEmpty() retorna true se e somente se o tamanho
		//total da String for 0, sen�o retorna false.
		
		boolean b2 = p1.contains("San");
		System.out.println(b2);
		//O m�todo isEmpty() retorna true se e somente se a String
		//possui a sequ�ncia de caracteres informada, sen�o retorna false.
		
		String p3 = p1.replace("Santana", "Gon�alves");
		System.out.println(p3);
		//O m�todo replace() troca a sequ�ncia de caracteres informada por uma
		//segunda sequ�ncia de caracteres informada.
	}

}
