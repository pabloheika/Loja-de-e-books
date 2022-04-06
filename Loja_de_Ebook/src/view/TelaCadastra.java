
package view;

import java.awt.Color;

import javax.swing.*;

/**
 *
 * @author pablo
 */
public class TelaCadastra extends  JPanel {
	/**
	 * 
	 */
	private static JFrame frame = new JFrame("Cadastro"); //cria o JFrame
	private static JPanel painel = new JPanel(); //cria o Jpanel
	private static final long serialVersionUID = 1L;
	private static JButton jButton3;
    private static JButton jButton4;
    private static JComboBox<String> jComboBox2;
    private static JLabel jLabel10;
    private static JLabel jLabel11;
    private static JLabel jLabel12;
    private static JLabel jLabel7;
    private static JLabel jLabel8;
    private static JLabel jLabel9;
    private static JPasswordField jPasswordField3;
    private static JTextField jTextField3;
    private static JTextField jTextField5;
    private static JTextField jTextField6;
    /**
     * Construtor chama metodo tela CadastraFuncionario
     */
    public TelaCadastra() {
        tela();
        
    }
                        
    private void tela() {

    	
        jTextField3 = new  JTextField();
        jTextField5 = new  JTextField();
        jLabel7 = new  JLabel();
        jLabel8 = new  JLabel();
        jLabel9 = new  JLabel();
        jLabel10 = new  JLabel();
        jComboBox2 = new  JComboBox<>();
        jTextField6 = new  JTextField();
        jLabel11 = new  JLabel();
        jPasswordField3 = new  JPasswordField();
        jButton3 = new  JButton();
        jButton4 = new  JButton();
        jLabel12 = new  JLabel();

        frame.setSize(523, 310); //define o tamanho do JFrame
    	frame.setLocationRelativeTo(null); //coloca a tela no meio
    	
    	painel.setLayout(null); //Define sem Layout
    	painel.setVisible(true); //Deixa ele visivel na tela
    	painel.setBackground(Color.gray); //poem a cor de traz da tela de cinza
    	
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Cargo:");

        jLabel8.setText("Nome:");

        jLabel9.setText("Senha:");

        jLabel10.setText("CPF:");

        jComboBox2.setModel(new  DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente", "Desenvolvedor", "Atendente" }));
        jComboBox2.setToolTipText("");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel11.setText("Email:");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 51, 0));
        jButton3.setText("Cancelar");

        jButton4.setBackground(new java.awt.Color(0, 153, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cadastrar");

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel12.setText("Cadastro de funcionario");

         GroupLayout layout = new  GroupLayout(painel);
        painel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField5))
                    .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, 0,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(22, 22, 22)
                        .addComponent(jTextField6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3,  GroupLayout.PREFERRED_SIZE, 396,  GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField3,  GroupLayout.PREFERRED_SIZE, 396,  GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButton3)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel12)
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel12,  GroupLayout.PREFERRED_SIZE, 42,  GroupLayout.PREFERRED_SIZE)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField6,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPasswordField3,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        
    	
        frame.add(painel); // Adiciona o Jpanel ao JFrame
    	frame.setVisible(true); // deixa o JFrame visivel
    }                     

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           


    // Variables declaration - do not modify                     
    
    // End of variables declaration                   
}

