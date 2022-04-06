package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import control.*;

public class Home implements ActionListener {
	private static JFrame frame = new JFrame("Home"); //cria o JFrame
	private static JPanel painel = new JPanel(); //cria o Jpanel
	private static JButton botaoLogin = new JButton("Login"); //cria o JButton de Login
	private static JButton botaoCadastro = new JButton("Cadastro"); //cria o JButton de Cadastro
	private static JLabel lojadeEbook = new JLabel("Loja de Ebook"); //cria o texto
	private static JList<String> list ;
	private static DefaultListCellRenderer renderer = new DefaultListCellRenderer();
	private String[] listaObras;
	public Home(ControlDados dados) {
	listaObras = new ControlObras(dados).getNomeObra();
	list = new JList<String>(listaObras);
	list.setCellRenderer(renderer);
	list.setBounds(20, 50, 350, 400);
	frame.setSize(1250, 650); //define o tamanho do JFrame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //termina a aplicação se fechar o app
	frame.setLocationRelativeTo(null); //coloca a tela no meio
	
	
	painel.setLayout(null); //Define sem Layout
	painel.setVisible(true); //Deixa ele visivel na tela
	painel.setBackground(Color.gray); //poem a cor de traz da tela de cinza
	
	
	botaoLogin.setBounds(1000, 20, 100, 30); //define o tamanho e o botao ira aparecer na tela
	
	
	botaoCadastro.setBounds(1120, 20, 100, 30); //define o tamanho e o botao ira aparecer na tela
	
	
	lojadeEbook.setBounds(50, 20, 200, 30); //degine o tamanho do texto
	lojadeEbook.setFont(new Font("Nirmala UI", Font.PLAIN, 24)); //define a fonte do texto
	
	painel.add(lojadeEbook); //adciciona o texto ao JPanel
	painel.add(botaoLogin); //adiciona o Botao de login ao JPanel
	painel.add(botaoCadastro); //adiciona o Botao de Cadastro ao JPanel
	painel.add(list);
	
	frame.add(painel); // Adiciona o Jpanel ao JFrame
	frame.setVisible(true); // deixa o JFrame visivel
	}
	public static void main(String[] args) {		
		ControlDados dados = new ControlDados();
		Home home = new Home(dados);
		botaoLogin.addActionListener(home);
		botaoCadastro.addActionListener(home);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botaoLogin)
			new Login();
		
		if(src == botaoCadastro)
			new TelaCadastra();
		
		
	}

	
}
