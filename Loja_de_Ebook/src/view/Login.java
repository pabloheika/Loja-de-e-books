package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import control.ControlDados;
import control.ControlPessoa;

/**
 *
 * @author pablo
 */
public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bEntra;
	private JButton bTroca;
	private JTextField campoCpf;
	private JTextField campoSenha;
	private JPanel pCorpo;
	private JPanel pLogin;
	private JPanel pTitulo;
	private JLabel texCpf;
	private JLabel texSenha;
	private JLabel texTitulo;
	private boolean tro = true;
	private ControlDados d;
	private ControlPessoa p;
	private Home h;

	public Login(ControlDados dados, Home home) {
		initComponents();
		d = dados;
		p = new ControlPessoa(d);
		h = home;
	}

	private void initComponents() {

		pLogin = new JPanel();
		pTitulo = new JPanel();
		texTitulo = new JLabel();
		pCorpo = new JPanel();
		texCpf = new JLabel();
		texSenha = new JLabel();
		campoCpf = new JTextField();
		campoSenha = new JTextField();
		bEntra = new JButton();
		bTroca = new JButton();

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

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setMaximizedBounds(new java.awt.Rectangle(0, 0, 400, 300));
		setMinimumSize(new java.awt.Dimension(415, 335));
		setSize(new java.awt.Dimension(400, 300));
		getContentPane().setLayout(null);

		pLogin.setLayout(null);

		pTitulo.setBackground(new java.awt.Color(0, 102, 153));
		pTitulo.setLayout(null);

		texTitulo.setBackground(new java.awt.Color(0, 102, 153));
		texTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
		texTitulo.setForeground(new java.awt.Color(255, 255, 255));
		texTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		texTitulo.setText("Login");
		texTitulo.setToolTipText("");
		texTitulo.setAlignmentY(0.0F);
		texTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		pTitulo.add(texTitulo);
		texTitulo.setBounds(6, 10, 388, 30);
		texTitulo.getAccessibleContext().setAccessibleName("texTitulo");
		texTitulo.getAccessibleContext().setAccessibleDescription("");

		pLogin.add(pTitulo);
		pTitulo.setBounds(0, 0, 400, 50);

		pCorpo.setBackground(new java.awt.Color(255, 255, 255));
		pCorpo.setLayout(null);

		texCpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
		texCpf.setText("CPF:");
		pCorpo.add(texCpf);
		texCpf.setBounds(40, 20, 37, 16);

		texSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
		texSenha.setText("Senha:");
		pCorpo.add(texSenha);
		texSenha.setBounds(40, 90, 60, 14);
		pCorpo.add(campoCpf);
		campoCpf.setBounds(31, 33, 342, 52);

		campoSenha.setToolTipText("");
		pCorpo.add(campoSenha);
		campoSenha.setBounds(31, 103, 342, 52);

		bEntra.setBackground(new java.awt.Color(51, 153, 0));
		bEntra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
		bEntra.setForeground(new java.awt.Color(255, 255, 255));
		bEntra.setText("Entrar");
		bEntra.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bEntraActionPerformed(evt);
			}
		});
		pCorpo.add(bEntra);
		bEntra.setBounds(234, 186, 110, 30);

		bTroca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
		bTroca.setText("Funcionario");
		bTroca.setToolTipText("");
		bTroca.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bTrocaActionPerformed(evt);
			}
		});
		pCorpo.add(bTroca);
		bTroca.setBounds(55, 186, 110, 30);

		pLogin.add(pCorpo);
		pCorpo.setBounds(0, 50, 400, 250);

		getContentPane().add(pLogin);
		pLogin.setBounds(0, 0, 400, 300);

		pack();
		setLocationRelativeTo(null);
	}

	private void bTrocaActionPerformed(java.awt.event.ActionEvent evt) {
		if (tro) {
			tro = false;
			bTroca.setText("Leitor");
			texTitulo.setText("Login funcionario");

		} else {
			tro = true;
			bTroca.setText("Funcionario");
			texTitulo.setText("Login");
		}

	}

	private void bEntraActionPerformed(java.awt.event.ActionEvent evt) {
		if (tro) {
			System.out.println(Long.parseLong(campoCpf.getText()) + campoSenha.getText());
			System.out.println(p.validaLogin(tro, Long.parseLong(campoCpf.getText()), campoSenha.getText()));
			if(p.validaLogin( tro , Long.parseLong(campoCpf.getText()), campoSenha.getText())) {
				new AreaLeitor(p.pegaLeitor(Long.parseLong(campoCpf.getText())), h).setVisible(true);
				h.invisivel();
				this.dispose();
				
			}else {
				JOptionPane.showMessageDialog(null,
						"Uma ou mais credenciais são invalidas", null,
						JOptionPane.ERROR_MESSAGE);
			}

		} else {
			if(p.validaLogin(tro, Long.parseLong(campoCpf.getText()), campoSenha.getText())) {
				
			}else {
				JOptionPane.showMessageDialog(null,
						"Uma ou mais credenciais são invalidas", null,
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}