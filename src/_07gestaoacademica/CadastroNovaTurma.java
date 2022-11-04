package _07gestaoacademica;

import java.awt.Color;

public class CadastroNovaTurma extends javax.swing.JFrame {

    //Atributos
    GestaoContaUsuario novaGestaoContaUsuario;
    ListagemDeTurma voltarParaListagemDeTurma;
    int mouseX, mouseY;
    
    public CadastroNovaTurma() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        cabecalhoPanel4 = new javax.swing.JPanel();
        sairPaginaButton6 = new javax.swing.JButton();
        botaoVoltarLabel = new javax.swing.JLabel();
        tituloDaPaginaLabel = new javax.swing.JLabel();
        botaoSalvar = new _07gestaoacademica.CustomizacaoBotao();
        separador = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        cabecalhoPanel4.setBackground(new java.awt.Color(204, 204, 204));
        cabecalhoPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabecalhoPanel4MouseDragged(evt);
            }
        });
        cabecalhoPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabecalhoPanel4MousePressed(evt);
            }
        });

        sairPaginaButton6.setBackground(new java.awt.Color(255, 255, 255));
        sairPaginaButton6.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        sairPaginaButton6.setForeground(new java.awt.Color(0, 0, 0));
        sairPaginaButton6.setText("X");
        sairPaginaButton6.setBorder(null);
        sairPaginaButton6.setContentAreaFilled(false);
        sairPaginaButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairPaginaButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairPaginaButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sairPaginaButton6MouseExited(evt);
            }
        });
        sairPaginaButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairPaginaButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cabecalhoPanel4Layout = new javax.swing.GroupLayout(cabecalhoPanel4);
        cabecalhoPanel4.setLayout(cabecalhoPanel4Layout);
        cabecalhoPanel4Layout.setHorizontalGroup(
            cabecalhoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairPaginaButton6)
                .addGap(18, 18, 18))
        );
        cabecalhoPanel4Layout.setVerticalGroup(
            cabecalhoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sairPaginaButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botaoVoltarLabel.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        botaoVoltarLabel.setForeground(new java.awt.Color(102, 102, 102));
        botaoVoltarLabel.setText("←");
        botaoVoltarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoVoltarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoVoltarLabelMouseExited(evt);
            }
        });

        tituloDaPaginaLabel.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        tituloDaPaginaLabel.setForeground(new java.awt.Color(30, 30, 30));
        tituloDaPaginaLabel.setText("Nova Turma");

        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setText("Salvar");
        botaoSalvar.setCor(new java.awt.Color(36, 53, 61));
        botaoSalvar.setCorBorda(new java.awt.Color(255, 255, 255));
        botaoSalvar.setCorEntrou(new java.awt.Color(19, 176, 110));
        botaoSalvar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        separador.setForeground(new java.awt.Color(234, 234, 234));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botaoVoltarLabel)
                .addGap(22, 22, 22)
                .addComponent(tituloDaPaginaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(cabecalhoPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(cabecalhoPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloDaPaginaLabel)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairPaginaButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairPaginaButton6MouseEntered
        Color corSelecionado = new Color(89, 89, 89);
        sairPaginaButton2.setForeground(corSelecionado);
    }//GEN-LAST:event_sairPaginaButton6MouseEntered

    private void sairPaginaButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairPaginaButton6MouseExited
        sairPaginaButton2.setForeground(Color.BLACK);
    }//GEN-LAST:event_sairPaginaButton6MouseExited

    private void sairPaginaButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairPaginaButton6ActionPerformed
        novaGestaoContaUsuario = new GestaoContaUsuario();
        novaGestaoContaUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairPaginaButton6ActionPerformed

    private void cabecalhoPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanel4MouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_cabecalhoPanel4MouseDragged

    private void cabecalhoPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanel4MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_cabecalhoPanel4MousePressed

    private void botaoVoltarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseClicked
        voltarParaListagemDeTurma = new ListagemDeTurma();
        voltarParaListagemDeTurma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarLabelMouseClicked

    private void botaoVoltarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseEntered
        botaoVoltarLabel.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_botaoVoltarLabelMouseEntered

    private void botaoVoltarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseExited
        botaoVoltarLabel.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_botaoVoltarLabelMouseExited

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroNovaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroNovaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroNovaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroNovaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroNovaTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private _07gestaoacademica.CustomizacaoBotao botaoSalvar;
    private javax.swing.JLabel botaoVoltarLabel;
    private javax.swing.JPanel cabecalhoPanel;
    private javax.swing.JPanel cabecalhoPanel1;
    private javax.swing.JPanel cabecalhoPanel2;
    private javax.swing.JPanel cabecalhoPanel3;
    private javax.swing.JPanel cabecalhoPanel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sairPaginaButton2;
    private javax.swing.JButton sairPaginaButton3;
    private javax.swing.JButton sairPaginaButton4;
    private javax.swing.JButton sairPaginaButton5;
    private javax.swing.JButton sairPaginaButton6;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel tituloDaPaginaLabel;
    // End of variables declaration//GEN-END:variables
}