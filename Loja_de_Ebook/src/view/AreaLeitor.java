package view;

import javax.swing.*;

/**
 *
 * @author pablo
 */
public class AreaLeitor extends JFrame {
	private JLabel app;
	private JButton bBibli;
	private JButton bCatalogo;
	private JButton bPerfil;
	private JButton bSair;
	private JPanel pFilho;
	private JPanel pInterno;
	private JPanel pMae;
	private JLabel texName;

	/**
	 * Creates new form AreaLeitor
	 */
	public AreaLeitor() {
		initComponents();
	}

	private void initComponents() {

		pMae = new JPanel();
		bSair = new JButton();
		texName = new JLabel();
		app = new JLabel();
		pFilho = new JPanel();
		pInterno = new JPanel();
		bCatalogo = new JButton();
		bBibli = new JButton();
		bPerfil = new JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setMinimumSize(new java.awt.Dimension(785, 415));
		getContentPane().setLayout(null);

		pMae.setBackground(new java.awt.Color(0, 102, 153));
		pMae.setForeground(new java.awt.Color(255, 255, 255));
		pMae.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		pMae.setLayout(null);

		bSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		bSair.setForeground(new java.awt.Color(153, 0, 51));
		bSair.setText("Sair");
		bSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bSairActionPerformed(evt);
			}
		});
		pMae.add(bSair);
		bSair.setBounds(690, 10, 72, 23);

		texName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
		texName.setForeground(new java.awt.Color(255, 255, 255));
		texName.setHorizontalAlignment(SwingConstants.RIGHT);
		texName.setText("Name");
		pMae.add(texName);
		texName.setBounds(413, 15, 251, 14);

		app.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
		app.setForeground(new java.awt.Color(255, 255, 255));
		app.setText("The book on the table");
		pMae.add(app);
		app.setBounds(18, 6, 230, 26);

		pFilho.setBackground(new java.awt.Color(255, 255, 255));
		pFilho.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		pFilho.setLayout(null);

		pInterno.setBackground(new java.awt.Color(255, 255, 255));
		pInterno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		pInterno.setLayout(null);

		bCatalogo.setBackground(new java.awt.Color(242, 242, 242));
		bCatalogo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		bCatalogo.setForeground(new java.awt.Color(0, 102, 153));
		bCatalogo.setText("Comprar um livro");
		bCatalogo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bCatalogoActionPerformed(evt);
			}
		});
		pInterno.add(bCatalogo);
		bCatalogo.setBounds(0, 60, 300, 34);

		bBibli.setBackground(new java.awt.Color(242, 242, 242));
		bBibli.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		bBibli.setForeground(new java.awt.Color(0, 102, 153));
		bBibli.setText("Acessar minha biblioteca");
		bBibli.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bBibliActionPerformed(evt);
			}
		});
		pInterno.add(bBibli);
		bBibli.setBounds(0, 140, 300, 34);

		bPerfil.setBackground(new java.awt.Color(242, 242, 242));
		bPerfil.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
		bPerfil.setForeground(new java.awt.Color(0, 102, 153));
		bPerfil.setText("Meu perfil");
		bPerfil.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bPerfilActionPerformed(evt);
			}
		});
		pInterno.add(bPerfil);
		bPerfil.setBounds(0, 220, 300, 34);

		pFilho.add(pInterno);
		pInterno.setBounds(230, 20, 300, 290);

		pMae.add(pFilho);
		pFilho.setBounds(0, 39, 770, 340);

		getContentPane().add(pMae);
		pMae.setBounds(0, 0, 770, 380);

		pack();
	}

	private void bBibliActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void bCatalogoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void bPerfilActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void bSairActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AreaLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AreaLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AreaLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AreaLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AreaLeitor().setVisible(true);
			}
		});
	}

}
