package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Cadastro {
	
	public Cadastro() {
		JFrame frame = new JFrame("Cadastro"); //cria o JFrame
		frame.setSize(300, 300); //define o tamanho do JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //termina a aplicação se fechar o app
		frame.setLocationRelativeTo(null); //coloca a tela no meio
		
		JPanel telaCadastro = new JPanel(); //cria o Jpanel
		telaCadastro.setLayout(null); //Define sem Layout
		telaCadastro.setVisible(true); //Deixa ele visivel na tela
		telaCadastro.setBackground(Color.cyan); //poem a cor de traz da tela de azul(cyan)
		
		JLabel login = new JLabel("Cadastro");
		login.setBounds(120, 20, 120, 50);
		
		JLabel cpf = new JLabel("CPF:");
		cpf.setBounds(50, 60, 100, 30);
		
		JTextField cpfcaixa = new JTextField();
		cpfcaixa.setBounds(100, 60, 100, 30);
		
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(50, 100, 100, 30);
		
		JTextField nomeCaixa = new JTextField();
		nomeCaixa.setBounds(100, 100, 100, 30);
		
		JLabel email = new JLabel("Email:");
		email.setBounds(50, 140, 100, 30);
		
		JTextField emailCaixa = new JTextField();
		emailCaixa.setBounds(100, 140, 100, 30);
		
		JLabel senha = new JLabel("Senha:");
		senha.setBounds(50, 180, 100, 30);
		
		JPasswordField senhacaixa = new JPasswordField();
		senhacaixa.setBounds(100, 180, 100, 30);
		
		JButton botaoLogin = new JButton("Cadastrar");
		botaoLogin.setBounds(140, 220, 90, 30);
		
		JButton botaoCadastro = new JButton("Login");
		botaoCadastro.setBounds(40, 220, 70, 30);
		
		telaCadastro.add(login);
		telaCadastro.add(cpf);
		telaCadastro.add(cpfcaixa);
		telaCadastro.add(nome);
		telaCadastro.add(nomeCaixa);
		telaCadastro.add(email);
		telaCadastro.add(emailCaixa);
		telaCadastro.add(senha);
		telaCadastro.add(senhacaixa);
		telaCadastro.add(botaoLogin);
		telaCadastro.add(botaoCadastro);
		
		frame.add(telaCadastro);
		frame.setVisible(true);
		
	}

}
