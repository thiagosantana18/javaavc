package trabalhochat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

public class TelaChatServidor extends JFrame {

	private JPanel contentPane;
	private JTextArea painelTexto;
	private static String msg = "";
	
	public static void main(String[] args) {
		TelaChatServidor tela = new TelaChatServidor();
		tela.setVisible(true);
		try {
			
			ServerSocket server = new ServerSocket(10000);
			JOptionPane.showMessageDialog(null, "Porta 10000 aberta, aguardando conexão.");
			
			Socket client = server.accept();
			JOptionPane.showMessageDialog(null, "Conexão do cliente "+client.getInetAddress());
			
			Scanner s = new Scanner(client.getInputStream());
			while(s.hasNextLine()) {
				tela.painelTexto.setText(msg += s.nextLine() + "\n");
			}
			
			s.close();
			client.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public TelaChatServidor() {
		setTitle("SERVIDOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mensagens:");
		lblNewLabel.setBounds(14, 23, 300, 16);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		painelTexto = new JTextArea();
		painelTexto.setBackground(SystemColor.text);
		painelTexto.setBounds(14, 50, 300, 146);
		contentPane.add(painelTexto);
	}
}
