package cinema;

import validador.ValidadorLogin;

/**
 *
 * @author jonas
 */
public class telaCadastro extends javax.swing.JFrame {

    private static telaCadastro instanciaDaTelaCadastro; // armazena a instância da tela de cadastro
    
    private telaCadastro() { //Impede que seja instanciada diretamente pelo construtor
        initComponents();
        jLabelCadastradoIcon.setVisible(false);
    }
    
    public static final telaCadastro getInstancia(){
        
        if(instanciaDaTelaCadastro==null) instanciaDaTelaCadastro = new telaCadastro();
        return instanciaDaTelaCadastro;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jLabelConfirmSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmSenha = new javax.swing.JPasswordField();
        jButtonCancel = new javax.swing.JButton();
        jButtonConfirm = new javax.swing.JButton();
        jLabelIcon = new javax.swing.JLabel();
        jLabelCadastradoIcon = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelEmail.setText("Email");
        jLabelEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldEmail.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabelNome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelNome.setText("Nome");
        jLabelNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldNome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelSenha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelSenha.setText("Senha");
        jLabelSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelConfirmSenha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelConfirmSenha.setText("Confirmar Senha");
        jLabelConfirmSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPasswordFieldSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jPasswordFieldConfirmSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jButtonCancel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonConfirm.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonConfirm.setText("Confirmar");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });

        jLabelIcon.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/conecte-se.png"))); // NOI18N
        jLabelIcon.setText("   Cadastre-se");

        jLabelCadastradoIcon.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCadastradoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/verificado.png"))); // NOI18N
        jLabelCadastradoIcon.setText("Cadastrado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCadastradoIcon))
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelConfirmSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConfirm)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadastradoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

                
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        
        AdaptadorValidador validador = new AdaptadorValidador();
        
        String nome = jTextFieldNome.getText();
        String email = jTextFieldEmail.getText();
        String senha = jPasswordFieldSenha.getText();
        String senhaConfirm = jPasswordFieldConfirmSenha.getText();
        
        if(validador.validadorAdaptado(email, senha, senhaConfirm)){   
            jLabelCadastradoIcon.setVisible(true);         
            
        }
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
         instanciaDaTelaCadastro.setVisible(false);
         jLabelCadastradoIcon.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JLabel jLabelCadastradoIcon;
    private javax.swing.JLabel jLabelConfirmSenha;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPasswordFieldConfirmSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
