package _07gestaoacademica;

import java.awt.Color;


public class ListagemProfessor extends javax.swing.JFrame {

    //Atributos
    private int mouseX, mouseY;
    GestaoContaUsuario novaGestaoContaUsuario;
    DashboardCoordenador voltarDashboardCoordenador;
    
    public ListagemProfessor() {
        initComponents();
        setLocationRelativeTo(null);
        
        ModeloTabelaProfessor tableModel = new ModeloTabelaProfessor();
        tabelaProfessor.setModel(tableModel);
        
        tabelaProfessor.getTableHeader().setOpaque(false);
        tabelaProfessor.getTableHeader().setBackground(Color.red);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sairPaginaButton2 = new javax.swing.JButton();
        tituloCabecalhoLabel = new javax.swing.JLabel();
        tituloCabecalhoLabel1 = new javax.swing.JLabel();
        campoDeEscrita1 = new _07gestaoacademica.CampoDeEscrita();
        jLabel1 = new javax.swing.JLabel();
        entrarContaBotton = new _07gestaoacademica.CustomizacaoBotao();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        campoDeEscrita2 = new _07gestaoacademica.CampoDeEscrita();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProfessor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        sairPaginaButton2.setBackground(new java.awt.Color(255, 255, 255));
        sairPaginaButton2.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        sairPaginaButton2.setForeground(new java.awt.Color(0, 0, 0));
        sairPaginaButton2.setText("X");
        sairPaginaButton2.setBorder(null);
        sairPaginaButton2.setContentAreaFilled(false);
        sairPaginaButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairPaginaButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairPaginaButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sairPaginaButton2MouseExited(evt);
            }
        });
        sairPaginaButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairPaginaButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairPaginaButton2)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sairPaginaButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tituloCabecalhoLabel.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        tituloCabecalhoLabel.setForeground(new java.awt.Color(30, 30, 30));
        tituloCabecalhoLabel.setText("Listagem de Professores");

        tituloCabecalhoLabel1.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        tituloCabecalhoLabel1.setForeground(new java.awt.Color(102, 102, 102));
        tituloCabecalhoLabel1.setText("←");
        tituloCabecalhoLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tituloCabecalhoLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloCabecalhoLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloCabecalhoLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloCabecalhoLabel1MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        entrarContaBotton.setForeground(new java.awt.Color(255, 255, 255));
        entrarContaBotton.setText("Novo Professor");
        entrarContaBotton.setCor(new java.awt.Color(36, 53, 61));
        entrarContaBotton.setCorBorda(new java.awt.Color(255, 255, 255));
        entrarContaBotton.setCorEntrou(new java.awt.Color(19, 176, 110));
        entrarContaBotton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        entrarContaBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarContaBottonActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(234, 234, 234));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Turma");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setColumnHeader(null);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabelaProfessor.setBackground(new java.awt.Color(255, 255, 255));
        tabelaProfessor.setFocusable(false);
        tabelaProfessor.setRowHeight(24);
        tabelaProfessor.setSelectionBackground(new java.awt.Color(169, 195, 200));
        tabelaProfessor.setShowHorizontalLines(true);
        tabelaProfessor.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaProfessor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloCabecalhoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloCabecalhoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entrarContaBotton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(campoDeEscrita1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(campoDeEscrita2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloCabecalhoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entrarContaBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloCabecalhoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeEscrita1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeEscrita2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairPaginaButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairPaginaButton2MouseEntered
        Color corSelecionado = new Color(89, 89, 89);
        sairPaginaButton2.setForeground(corSelecionado);
    }//GEN-LAST:event_sairPaginaButton2MouseEntered

    private void sairPaginaButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairPaginaButton2MouseExited
        sairPaginaButton2.setForeground(Color.BLACK);
    }//GEN-LAST:event_sairPaginaButton2MouseExited

    private void sairPaginaButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairPaginaButton2ActionPerformed
        novaGestaoContaUsuario = new GestaoContaUsuario();
        novaGestaoContaUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairPaginaButton2ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void tituloCabecalhoLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloCabecalhoLabel1MouseEntered
        tituloCabecalhoLabel1.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_tituloCabecalhoLabel1MouseEntered

    private void tituloCabecalhoLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloCabecalhoLabel1MouseExited
        tituloCabecalhoLabel1.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_tituloCabecalhoLabel1MouseExited

    private void tituloCabecalhoLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloCabecalhoLabel1MouseClicked
        voltarDashboardCoordenador = new DashboardCoordenador();
        voltarDashboardCoordenador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tituloCabecalhoLabel1MouseClicked

    private void entrarContaBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarContaBottonActionPerformed

        

    }//GEN-LAST:event_entrarContaBottonActionPerformed

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
            java.util.logging.Logger.getLogger(ListagemProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private _07gestaoacademica.CampoDeEscrita campoDeEscrita1;
    private _07gestaoacademica.CampoDeEscrita campoDeEscrita2;
    private _07gestaoacademica.CustomizacaoBotao entrarContaBotton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton sairPaginaButton2;
    private javax.swing.JTable tabelaProfessor;
    private javax.swing.JLabel tituloCabecalhoLabel;
    private javax.swing.JLabel tituloCabecalhoLabel1;
    // End of variables declaration//GEN-END:variables
}
