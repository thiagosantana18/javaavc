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
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaChatCliente extends JFrame {

	private JPanel contentPane;
	private JTextArea mensagem;
	private static Socket client;
	
	public static void main(String[] args) {
		TelaChatCliente tela = new TelaChatCliente();
		tela.setVisible(true);
			try {
				client = new Socket("127.0.0.1", 10000);
				JOptionPane.showMessageDialog(null, "Cliente conectado ao serivdor."+"\n");
			}  catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void enviarmensagem(String msg) {
		try {
			PrintStream out = new PrintStream(client.getOutputStream());
			out.println(msg);
			JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public TelaChatCliente() {
		setTitle("CLIENTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mensagens:");
		lblNewLabel.setBounds(14, 23, 410, 16);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		mensagem = new JTextArea();
		mensagem.setBounds(14, 50, 300, 112);
		contentPane.add(mensagem);
		
		JButton btnNewButton = new JButton("Enviar Mensagem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enviarmensagem(mensagem.getText());
				mensagem.setText("");
			}
		});
		btnNewButton.setBounds(14, 185, 138, 23);
		contentPane.add(btnNewButton);
	}
}