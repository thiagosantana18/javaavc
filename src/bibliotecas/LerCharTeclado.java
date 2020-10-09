package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerCharTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma tecla: ");
		InputStream is = System.in;
		//InputStream � a classe Java que sabe capturar uma entrada no Sistema,
		//nesse caso recebendo-o da entrada padr�o.
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transform�-lo em char.
		char c = 0;
		try {
			c = (char) isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Voc� digitou a tecla: "+c);
	}
}