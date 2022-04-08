package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import control.*;

/**
 *
 * @author pablo
 */
public class TelaCadastraPessoa extends JFrame {

	/**
	 * Declaração dos componentes visuais
	 */
	private static final long serialVersionUID = 1L;
	private ControlDados dados;

	public TelaCadastraPessoa(ControlDados dados, Home h) {
		this.dados = dados;
		this.h = h;
	}

	private static Boolean opera;
	private JButton botaoCadastra;
	private JButton botaoCancela;
	private JTextField campoCpf;
	private JTextField campoEmail;
	private JTextField campoName;
	private JPasswordField campoSenha;
	private JFormattedTextField campoData;
	private JPanel jPanel1;
	private JLabel texCpf;
	private JLabel texData;
	private JLabel texEmail;
	private JLabel texNome;
	private JLabel texSenha;
	private JLabel texTitulo;
	private JComboBox<String> selectCargo;
	private Home h;

	public void telaCadastraLeitor(ControlDados d) {
		opera = true;
		dados = d;
		jPanel1 = new JPanel();
		texTitulo = new JLabel();
		texNome = new JLabel();
		texCpf = new JLabel();
		texEmail = new JLabel();
		texSenha = new JLabel();
		texData = new JLabel();
		campoName = new JTextField();
		campoCpf = new JTextField();
		campoEmail = new JTextField();
		campoSenha = new JPasswordField();
		try {
			campoData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// permite apenas numeros no campo cpf
		campoCpf.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {
				if (!((e.getKeyChar() >= KeyEvent.VK_0 && e.getKeyChar() <= KeyEvent.VK_9)
						|| (e.getKeyChar() == KeyEvent.VK_ENTER || e.getKeyChar() == KeyEvent.VK_SPACE
								|| e.getKeyChar() == KeyEvent.VK_BACK_SPACE))) {
					e.consume();
				}
			}

			public void keyPressed(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
			}
		});

		botaoCadastra = new JButton();
		botaoCancela = new JButton();

		texTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		texTitulo.setText("Cadastra Leitor");
		texTitulo.setToolTipText("");

		texNome.setText("Nome:");

		texCpf.setText("CPF:");

		texEmail.setText("Email:");

		texSenha.setText("Senha:");

		texData.setText("Data de nacimento:");

		botaoCadastra.setBackground(new java.awt.Color(51, 153, 0));
		botaoCadastra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		botaoCadastra.setForeground(new java.awt.Color(255, 255, 255));
		botaoCadastra.setText("Cadastrar");

		botaoCancela.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		botaoCancela.setForeground(new java.awt.Color(153, 0, 0));
		botaoCancela.setText("Cancelar");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(189, 189, 189).addComponent(texTitulo))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(35, 35, 35)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(texNome, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(texCpf, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(texEmail, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(texSenha, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(texData, GroupLayout.Alignment.LEADING))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(
										jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(campoData).addComponent(campoName)
												.addComponent(campoCpf, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
												.addComponent(campoEmail, GroupLayout.DEFAULT_SIZE, 359,
														Short.MAX_VALUE)
												.addComponent(campoSenha)))
						.addGroup(GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(botaoCancela)
										.addGap(73, 73, 73).addComponent(botaoCadastra).addGap(112, 112, 112)))
						.addContainerGap(35, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(texTitulo)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(texNome).addComponent(campoName, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(campoCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(texCpf))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(campoEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(texEmail))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(campoSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(texSenha))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(campoData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(texData))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(botaoCancela).addComponent(botaoCadastra))
						.addGap(30, 30, 30)));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		this.setLocationRelativeTo(null); // coloca a tela no meio
		botaoCadastra.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoCadastraActionPerformed(evt);
			}
		});
		botaoCancela.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoCancelaActionPerformed(evt);
			}
		});
	}

	public void telaCadastraFucionario(ControlDados d) {
		opera = false;
		dados = d;
		jPanel1 = new JPanel();
		texTitulo = new JLabel();
		texNome = new JLabel();
		texCpf = new JLabel();
		texEmail = new JLabel();
		texSenha = new JLabel();
		texData = new JLabel();
		campoName = new JTextField();
		campoCpf = new JTextField();
		campoEmail = new JTextField();
		campoSenha = new JPasswordField();
		botaoCadastra = new JButton();
		botaoCancela = new JButton();
		selectCargo = new JComboBox<>();

		// permite apenas numeros no campo cpf
		campoCpf.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {
				if (!((e.getKeyChar() >= KeyEvent.VK_0 && e.getKeyChar() <= KeyEvent.VK_9)
						|| (e.getKeyChar() == KeyEvent.VK_ENTER || e.getKeyChar() == KeyEvent.VK_SPACE
								|| e.getKeyChar() == KeyEvent.VK_BACK_SPACE))) {
					e.consume();
				}
			}

			public void keyPressed(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
			}
		});

		texTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		texTitulo.setText("Cadastra Funcionario");
		texTitulo.setToolTipText("");

		texNome.setText("Nome:");

		texCpf.setText("CPF:");

		texEmail.setText("Email:");

		texSenha.setText("Senha:");

		texData.setText("Cargo:");

		botaoCadastra.setBackground(new java.awt.Color(51, 153, 0));
		botaoCadastra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		botaoCadastra.setForeground(new java.awt.Color(255, 255, 255));
		botaoCadastra.setText("Cadastrar");

		botaoCancela.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		botaoCancela.setForeground(new java.awt.Color(153, 0, 0));
		botaoCancela.setText("Cancelar");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		selectCargo.setModel(
				new DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente", "Desenvolvedor", "Atendente" }));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(135, 135, 135)
										.addComponent(botaoCancela).addGap(73, 73, 73).addComponent(botaoCadastra))
								.addGroup(
										jPanel1Layout
												.createSequentialGroup().addGap(35, 35, 35).addGroup(jPanel1Layout
														.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
														.addComponent(texNome, GroupLayout.Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
														.addComponent(texCpf, GroupLayout.Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(texEmail, GroupLayout.Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(texSenha, GroupLayout.Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																texData, GroupLayout.Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE, 69,
																GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(texTitulo)
														.addGroup(jPanel1Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(campoName)
																.addComponent(campoCpf, GroupLayout.DEFAULT_SIZE, 359,
																		Short.MAX_VALUE)
																.addComponent(campoEmail, GroupLayout.DEFAULT_SIZE, 359,
																		Short.MAX_VALUE)
																.addComponent(campoSenha).addComponent(selectCargo, 0,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
						.addContainerGap(35, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(texTitulo)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(texNome).addComponent(campoName, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(campoCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(texCpf))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(campoEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(texEmail))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(campoSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(texSenha))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(texData).addComponent(selectCargo, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(botaoCancela).addComponent(botaoCadastra))
						.addGap(29, 29, 29)));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		botaoCadastra.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoCadastraActionPerformed(evt);
			}
		});
		botaoCancela.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoCancelaActionPerformed(evt);
			}
		});
		pack();
		this.setLocationRelativeTo(null); // coloca a tela no meio
	}

	@SuppressWarnings("deprecation")
	private void botaoCadastraActionPerformed(java.awt.event.ActionEvent evt) {
		boolean res = false;
		if (opera) {
			if (dados.checaCpf(Long.parseLong(campoCpf.getText()), opera)) {
				res = dados.cadastraPessoa(campoName.getText(), Long.parseLong(campoCpf.getText()),
						campoEmail.getText(), campoSenha.getText(), campoData.getText(), opera);
			} else {
				JOptionPane.showMessageDialog(null,
						"Já exixte leitor com este CPF, e por causa disto o cadastro foi cancelado", null,
						JOptionPane.ERROR_MESSAGE);
			}
		} else {
			if (dados.checaCpf(Long.parseLong(campoCpf.getText()), opera)) {
				res = dados.cadastraPessoa(campoCpf.getText(), Long.parseLong(campoCpf.getText()), campoEmail.getText(),
						campoSenha.getText(), "" + selectCargo.getModel(), opera);
			} else {
				JOptionPane.showMessageDialog(null,
						"Já exixte funcionario com este CPF, e por causa disto o cadastro foi cancelado", null,
						JOptionPane.ERROR_MESSAGE);
			}
		}

		if (res) {
			JOptionPane.showMessageDialog(null, "Cadastro realizado", null, JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
			;
		}
	}

	private void botaoCancelaActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		;
	}

}
