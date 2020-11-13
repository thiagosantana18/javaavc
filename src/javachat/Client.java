package javachat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("127.0.0.1", 10000);
			System.out.println("Cliente conectado ao serivdor");
		
			Scanner s = new Scanner(System.in);
			PrintStream out = new PrintStream(client.getOutputStream());
			
			while(s.hasNextLine()) {
				out.println(s.nextLine());
			}
			
			out.close();
			s.close();
			client.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}