package cinema;

import java.awt.Color;

/**
 *
 * @author jonas
 */
public class TelaInicial extends javax.swing.JFrame{
    
    protected static EstadoTela estado;
    
    public TelaInicial() {
        initComponents();
        getContentPane().setBackground(Color.LIGHT_GRAY);
        estado = new TelaInicialClaro();
    }
    
    public void tornarClaro(){
        estado = estado.tornarClaro();
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }
 
    public void tornarEscuro(){
        estado = estado.tornarEscuro();
        getContentPane().setBackground(Color.darkGray);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFilme03 = new javax.swing.JLabel();
        jLabelFilme04 = new javax.swing.JLabel();
        jLabelFilme02 = new javax.swing.JLabel();
        buttonCadastro = new javax.swing.JButton();
        buttonModoNoturno = new javax.swing.JButton();
        jLabelFilme06 = new javax.swing.JLabel();
        jLabelFilme01 = new javax.swing.JLabel();
        jLabelFilme07 = new javax.swing.JLabel();
        jLabelFilme08 = new javax.swing.JLabel();
        jLabelFilme05 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("telaInicial"); // NOI18N

        jLabelFilme03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/Dr Estranho M.png"))); // NOI18N
        jLabelFilme03.setText("jLabel1");
        jLabelFilme03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFilme04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/Dumbledore M.png"))); // NOI18N
        jLabelFilme04.setText("jLabel1");
        jLabelFilme04.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFilme02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/Cidade Perdida M.png"))); // NOI18N
        jLabelFilme02.setText("jLabel1");
        jLabelFilme02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonCadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonCadastro.setText("Cadastrar-se");
        buttonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroActionPerformed(evt);
            }
        });

        buttonModoNoturno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/modo-escuro.png"))); // NOI18N
        buttonModoNoturno.setToolTipText("");
        buttonModoNoturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModoNoturnoActionPerformed(evt);
            }
        });

        jLabelFilme06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/thor M.png"))); // NOI18N
        jLabelFilme06.setText("jLabel1");
        jLabelFilme06.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFilme01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/morbius M.png"))); // NOI18N
        jLabelFilme01.setText("jLabel1");
        jLabelFilme01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFilme07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/sonic M.png"))); // NOI18N
        jLabelFilme07.setText("jLabel1");
        jLabelFilme07.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFilme08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/jurassic M.png"))); // NOI18N
        jLabelFilme08.setText("jLabel1");
        jLabelFilme08.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelFilme05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/homen do Norte M.png"))); // NOI18N
        jLabelFilme05.setText("jLabel1");
        jLabelFilme05.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonModoNoturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1111, 1111, 1111)
                        .addComponent(buttonCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFilme01, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFilme05, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFilme02, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFilme06, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFilme03, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFilme07, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFilme08, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFilme04, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonModoNoturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFilme02, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelFilme03, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelFilme04, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelFilme01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFilme06, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFilme07, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFilme08, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFilme05, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroActionPerformed
        TelaCadastro.getInstancia().setVisible(true);
    }//GEN-LAST:event_buttonCadastroActionPerformed

    private void buttonModoNoturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModoNoturnoActionPerformed
         
        if(estado instanceof TelaInicialClaro){
            this.tornarEscuro();
        }else{
            this.tornarClaro();
        }
    }//GEN-LAST:event_buttonModoNoturnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastro;
    private javax.swing.JButton buttonModoNoturno;
    private javax.swing.JLabel jLabelFilme01;
    private javax.swing.JLabel jLabelFilme02;
    private javax.swing.JLabel jLabelFilme03;
    private javax.swing.JLabel jLabelFilme04;
    private javax.swing.JLabel jLabelFilme05;
    private javax.swing.JLabel jLabelFilme06;
    private javax.swing.JLabel jLabelFilme07;
    private javax.swing.JLabel jLabelFilme08;
    // End of variables declaration//GEN-END:variables
}
