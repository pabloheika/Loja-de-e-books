package view;

import java.awt.*;

import javax.swing.*;

public class Menu {
	
	public Menu() {
		
	JFrame frame = new JFrame("Menu"); //cria o JFrame
	frame.setSize(1250, 650); //define o tamanho do JFrame
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	
	JPanel painel = new JPanel(); //cria o Jpanel
	painel.setLayout(null); //Define sem Layout
	painel.setVisible(true); //Deixa ele visivel na tela
	painel.setBackground(Color.cyan); //poem a cor de traz da tela de azul(cyan)
	
	JButton botaoLogin = new JButton("Login"); //cria o JButton de Login
	botaoLogin.setBounds(1000, 20, 100, 30); //define o tamanho e o botao ira aparecer na tela
	
	JButton botaoCadastro = new JButton("Cadastro"); //cria o JButton de Cadastro
	botaoCadastro.setBounds(1120, 20, 100, 30); //define o tamanho e o botao ira aparecer na tela
	
	JLabel lojadeEbook = new JLabel("Loja de Ebook"); //cria o texto
	lojadeEbook.setBounds(50, 20, 200, 30);
	lojadeEbook.setFont(new Font("Verdana", Font.PLAIN, 15));
	
	
	
	painel.add(lojadeEbook); //adciciona o texto ao JPanel
	painel.add(botaoLogin); //adiciona o Botao de login ao JPanel
	painel.add(botaoCadastro); //adiciona o Botao de Cadastro ao JPanel
	
	frame.add(painel); // Adiciona o Jpanel ao JFram
	
	
	frame.setVisible(true); // deixa o JFrame visivel
	}
	

	
}
