package view;

import java.awt.Color;

import javax.swing.*;

public class Login {

	public Login() {

		JFrame frame1 = new JFrame("Login"); // cria o JFrame
		frame1.setSize(300, 250); // define o tamanho do JFrame
		frame1.setLocationRelativeTo(null); // coloca a tela no meio

		JPanel telaLogin = new JPanel(); // cria o Jpanel
		telaLogin.setLayout(null); // Define sem Layout
		telaLogin.setVisible(true); // Deixa ele visivel na tela
		telaLogin.setBackground(Color.cyan); // poem a cor de traz da tela de azul(cyan)

		JLabel login = new JLabel("Login");
		login.setBounds(120, 20, 120, 50);

		JLabel cpf = new JLabel("CPF:");
		cpf.setBounds(50, 60, 100, 30);

		JLabel senha = new JLabel("Senha:");
		senha.setBounds(50, 100, 100, 30);

		JTextField cpfcaixa = new JTextField();
		cpfcaixa.setBounds(100, 60, 100, 30);

		JPasswordField senhacaixa = new JPasswordField();
		senhacaixa.setBounds(100, 100, 100, 30);

		JButton botaoLogin = new JButton("Login");
		botaoLogin.setBounds(140, 140, 70, 30);

		JButton botaoCadastro = new JButton("Cadastrar");
		botaoCadastro.setBounds(40, 140, 90, 30);

		telaLogin.add(login);
		telaLogin.add(cpf);
		telaLogin.add(cpfcaixa);
		telaLogin.add(senha);
		telaLogin.add(senhacaixa);
		telaLogin.add(botaoLogin);
		telaLogin.add(botaoCadastro);

		frame1.add(telaLogin);
		frame1.setVisible(true);

	}

}
