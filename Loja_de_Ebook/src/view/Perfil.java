package view;

import javax.swing.*;

import model.*;

/**
*
* @author pablo
*/
public class Perfil extends JPanel {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private JButton btSalvar;
	   private JButton btVoltar;
	   private JTextField campoCpf;
	   private JTextField campoData;
	   private JTextField campoEmail;
	   private JTextField campoNome;
	   private JPasswordField campoSenha;
	   private JLabel tesTitulo;
	   private JLabel texCpf;
	   private JLabel texData;
	   private JLabel texEmail;
	   private JLabel texNome;
	   private JLabel texSenha; 
	   private Leitor l;
	   private AreaLeitor a;

   /**
    * Creates new form Perfil
    */
   public Perfil(Leitor leitor, AreaLeitor area) {
       
       l = leitor;
       a = area;
       initComponents();
   }
                       
   private void initComponents() {

       btVoltar = new JButton();
       tesTitulo = new JLabel();
       texNome = new JLabel();
       campoNome = new JTextField();
       campoCpf = new JTextField();
       texCpf = new JLabel();
       campoEmail = new JTextField();
       texEmail = new JLabel();
       texSenha = new JLabel();
       campoData = new JTextField();
       texData = new JLabel();
       campoSenha = new JPasswordField();
       btSalvar = new JButton();

       setBackground(new java.awt.Color(255, 255, 255));
       setMinimumSize(new java.awt.Dimension(770, 293));
       setLayout(null);

       btVoltar.setBackground(new java.awt.Color(255, 255, 255));
       btVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
       btVoltar.setForeground(new java.awt.Color(0, 102, 153));
       btVoltar.setText("Voltar");
       btVoltar.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               btVoltarActionPerformed(evt);
           }
       });
       add(btVoltar);
       btVoltar.setBounds(22, 19, 82, 23);

       tesTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
       tesTitulo.setForeground(new java.awt.Color(51, 51, 51));
       tesTitulo.setHorizontalAlignment(SwingConstants.CENTER);
       tesTitulo.setText("Perfil");
       add(tesTitulo);
       tesTitulo.setBounds(269, 19, 188, 37);

       texNome.setForeground(new java.awt.Color(51, 51, 51));
       texNome.setText("Nome:");
       add(texNome);
       texNome.setBounds(22, 85, 56, 16);

       campoNome.setBackground(new java.awt.Color(255, 255, 255));
       campoNome.setForeground(new java.awt.Color(51, 51, 51));
       campoNome.setText(l.getNome());
       add(campoNome);
       campoNome.setBounds(131, 82, 594, 22);

       campoCpf.setEditable(false);
       campoCpf.setBackground(new java.awt.Color(255, 255, 255));
       campoCpf.setForeground(new java.awt.Color(51, 51, 51));
       campoCpf.setText(""+ l.getCpf());
       add(campoCpf);
       campoCpf.setBounds(131, 116, 594, 22);

       texCpf.setForeground(new java.awt.Color(51, 51, 51));
       texCpf.setText("CPF:");
       add(texCpf);
       texCpf.setBounds(22, 119, 54, 16);

       campoEmail.setBackground(new java.awt.Color(255, 255, 255));
       campoEmail.setForeground(new java.awt.Color(51, 51, 51));
       campoEmail.setText(l.getEmail());
       add(campoEmail);
       campoEmail.setBounds(131, 150, 594, 22);

       texEmail.setForeground(new java.awt.Color(51, 51, 51));
       texEmail.setText("Email:");
       add(texEmail);
       texEmail.setBounds(22, 153, 52, 16);

       texSenha.setForeground(new java.awt.Color(51, 51, 51));
       texSenha.setText("Senha:");
       add(texSenha);
       texSenha.setBounds(22, 187,110, 16);

       campoData.setBackground(new java.awt.Color(255, 255, 255));
       campoData.setForeground(new java.awt.Color(51, 51, 51));
       campoData.setText(l.getDataNascimento());
       add(campoData);
       campoData.setBounds(131, 218, 594, 22);

       texData.setForeground(new java.awt.Color(51, 51, 51));
       texData.setText("Data de nacimento:");
       add(texData);
       texData.setBounds(22, 221, 110,16);

       campoSenha.setBackground(new java.awt.Color(255, 255, 255));
       campoSenha.setForeground(new java.awt.Color(51, 51, 51));
       campoSenha.setText(l.getSenha());
       add(campoSenha);
       campoSenha.setBounds(131, 184, 594, 22);

       btSalvar.setBackground(new java.awt.Color(51, 153, 0));
       btSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
       btSalvar.setForeground(new java.awt.Color(255, 255, 255));
       btSalvar.setText("Salvar");
       btSalvar.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               btSalvarActionPerformed(evt);
           }
       });
       add(btSalvar);
       btSalvar.setBounds(649, 258, 72, 21);
   }// </editor-fold>                        

   private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                         
       a.fechaPerfil();
   }                                                                                

   @SuppressWarnings("deprecation")
private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {  
		l.setDataNascimento(campoData.getText());
		l.setEmail(campoEmail.getText());
		l.setNome(campoNome.getText());
		l.setSenha(campoSenha.getText());
		JOptionPane.showMessageDialog(null, "Alteração realizada", null, JOptionPane.INFORMATION_MESSAGE);
   }                                        

                    
                 
}
