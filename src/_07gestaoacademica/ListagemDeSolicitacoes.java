package _07gestaoacademica;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class ListagemDeSolicitacoes extends javax.swing.JFrame {

    //Atributos
    private GestaoContaUsuario novaGestaoContaUsuario;
    private DashboardAluno voltarDashboardAluno;
    private int mouseX, mouseY;
    
    public ListagemDeSolicitacoes() {
        
        initComponents();
        setLocationRelativeTo(null);
        
        //Tabela
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        
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
        cabecalhoPanel = new javax.swing.JPanel();
        sairPaginaButton = new javax.swing.JButton();
        botaoVoltarLabel = new javax.swing.JLabel();
        tituloDaPaginaLabel = new javax.swing.JLabel();
        solicitarMatricula = new _07gestaoacademica.CustomizacaoBotao();
        separador = new javax.swing.JSeparator();
        disciplinaTurmaLabel = new javax.swing.JLabel();
        campoDisciplinaDaTurma = new _07gestaoacademica.CampoDeEscrita();
        dataLabel = new javax.swing.JLabel();
        campoDataInicial = new _07gestaoacademica.CampoDeEscrita();
        aLabel = new javax.swing.JLabel();
        campoDataFinal = new _07gestaoacademica.CampoDeEscrita();
        statusLabel = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        limparCampoButton = new _07gestaoacademica.CustomizacaoBotao();
        pesquisarTurmaButton = new _07gestaoacademica.CustomizacaoBotao();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSolicitacoes = new _07gestaoacademica.JTablePersonalizada();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cabecalhoPanel.setBackground(new java.awt.Color(204, 204, 204));
        cabecalhoPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabecalhoPanelMouseDragged(evt);
            }
        });
        cabecalhoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabecalhoPanelMousePressed(evt);
            }
        });

        sairPaginaButton.setBackground(new java.awt.Color(255, 255, 255));
        sairPaginaButton.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        sairPaginaButton.setForeground(new java.awt.Color(0, 0, 0));
        sairPaginaButton.setText("X");
        sairPaginaButton.setBorder(null);
        sairPaginaButton.setContentAreaFilled(false);
        sairPaginaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairPaginaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairPaginaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sairPaginaButtonMouseExited(evt);
            }
        });
        sairPaginaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairPaginaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cabecalhoPanelLayout = new javax.swing.GroupLayout(cabecalhoPanel);
        cabecalhoPanel.setLayout(cabecalhoPanelLayout);
        cabecalhoPanelLayout.setHorizontalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairPaginaButton)
                .addGap(18, 18, 18))
        );
        cabecalhoPanelLayout.setVerticalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sairPaginaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        tituloDaPaginaLabel.setText("Listagem de Solicitações");

        solicitarMatricula.setForeground(new java.awt.Color(255, 255, 255));
        solicitarMatricula.setText("Solicitar Matrícula");
        solicitarMatricula.setCor(new java.awt.Color(36, 53, 61));
        solicitarMatricula.setCorBorda(new java.awt.Color(255, 255, 255));
        solicitarMatricula.setCorEntrou(new java.awt.Color(19, 176, 110));
        solicitarMatricula.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        solicitarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarMatriculaActionPerformed(evt);
            }
        });

        separador.setForeground(new java.awt.Color(234, 234, 234));

        disciplinaTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        disciplinaTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        disciplinaTurmaLabel.setText("Disciplina");

        campoDisciplinaDaTurma.setText("");
        campoDisciplinaDaTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDisciplinaDaTurmaKeyPressed(evt);
            }
        });

        dataLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dataLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataLabel.setText("Data");

        campoDataInicial.setText("");
        campoDataInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDataInicialKeyPressed(evt);
            }
        });

        aLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        aLabel.setForeground(new java.awt.Color(0, 0, 0));
        aLabel.setText("a");

        campoDataFinal.setText("");
        campoDataFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDataFinalKeyPressed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(0, 0, 0));
        statusLabel.setText("Status");

        statusComboBox.setBackground(new java.awt.Color(234, 234, 234));
        statusComboBox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        statusComboBox.setForeground(new java.awt.Color(81, 81, 81));
        statusComboBox.setBorder(null);

        limparCampoButton.setBackground(new java.awt.Color(188, 188, 188));
        limparCampoButton.setForeground(new java.awt.Color(255, 255, 255));
        limparCampoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_07gestaoacademica/images/sairP.png"))); // NOI18N
        limparCampoButton.setCor(new java.awt.Color(188, 188, 188));
        limparCampoButton.setCorBorda(new java.awt.Color(255, 255, 255));
        limparCampoButton.setCorClicou(new java.awt.Color(117, 146, 153));
        limparCampoButton.setCorEntrou(new java.awt.Color(142, 159, 163));
        limparCampoButton.setCorSaiu(new java.awt.Color(188, 188, 188));
        limparCampoButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        limparCampoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampoButtonActionPerformed(evt);
            }
        });

        pesquisarTurmaButton.setForeground(new java.awt.Color(255, 255, 255));
        pesquisarTurmaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_07gestaoacademica/images/lupaB.png"))); // NOI18N
        pesquisarTurmaButton.setCor(new java.awt.Color(76, 95, 99));
        pesquisarTurmaButton.setCorBorda(new java.awt.Color(255, 255, 255));
        pesquisarTurmaButton.setCorClicou(new java.awt.Color(117, 146, 153));
        pesquisarTurmaButton.setCorEntrou(new java.awt.Color(87, 123, 132));
        pesquisarTurmaButton.setCorSaiu(new java.awt.Color(76, 95, 99));
        pesquisarTurmaButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pesquisarTurmaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarTurmaButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        tabelaSolicitacoes.setBackground(new java.awt.Color(255, 255, 255));
        tabelaSolicitacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaSolicitacoes.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaSolicitacoes.setSelectionBackground(new java.awt.Color(19, 176, 110));
        jScrollPane1.setViewportView(tabelaSolicitacoes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabecalhoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separador)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botaoVoltarLabel)
                .addGap(22, 22, 22)
                .addComponent(tituloDaPaginaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(solicitarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(disciplinaTurmaLabel)
                                .addGap(0, 102, Short.MAX_VALUE))
                            .addComponent(campoDisciplinaDaTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dataLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(limparCampoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisarTurmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(statusLabel))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cabecalhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloDaPaginaLabel)
                        .addComponent(solicitarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disciplinaTurmaLabel)
                            .addComponent(statusLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pesquisarTurmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limparCampoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aLabel)
                            .addComponent(campoDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDisciplinaDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
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

    private void sairPaginaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairPaginaButtonMouseEntered
        Color corSelecionado = new Color(89, 89, 89);
        sairPaginaButton.setForeground(corSelecionado);
    }//GEN-LAST:event_sairPaginaButtonMouseEntered

    private void sairPaginaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairPaginaButtonMouseExited
        sairPaginaButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_sairPaginaButtonMouseExited

    private void sairPaginaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairPaginaButtonActionPerformed
        novaGestaoContaUsuario = new GestaoContaUsuario();
        novaGestaoContaUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairPaginaButtonActionPerformed

    private void cabecalhoPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_cabecalhoPanelMouseDragged

    private void cabecalhoPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_cabecalhoPanelMousePressed

    private void botaoVoltarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseClicked
        voltarDashboardAluno = new DashboardAluno();
        voltarDashboardAluno.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarLabelMouseClicked

    private void botaoVoltarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseEntered
        botaoVoltarLabel.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_botaoVoltarLabelMouseEntered

    private void botaoVoltarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseExited
        botaoVoltarLabel.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_botaoVoltarLabelMouseExited

    private void solicitarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarMatriculaActionPerformed

        SolicitarMatriculaAluno janelaSolicitacaoMatricula = new SolicitarMatriculaAluno();
        janelaSolicitacaoMatricula.setVisible(true);
        janelaSolicitacaoMatricula.voltarAoDashBoard(false);
        this.dispose();
        
    }//GEN-LAST:event_solicitarMatriculaActionPerformed

    private void campoDisciplinaDaTurmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDisciplinaDaTurmaKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        pesquisarTurmaButtonActionPerformed(null);

    }//GEN-LAST:event_campoDisciplinaDaTurmaKeyPressed

    private void campoDataInicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDataInicialKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataInicialKeyPressed

    private void campoDataFinalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDataFinalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataFinalKeyPressed

    private void limparCampoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampoButtonActionPerformed

        campoDisciplinaDaTurma.setText("");
        statusComboBox.setSelectedIndex(-1);
        statusComboBox.requestFocus();
        pesquisarTurmaButton.requestFocus();
        pesquisarTurmaButton.doClick();

    }//GEN-LAST:event_limparCampoButtonActionPerformed

    private void pesquisarTurmaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarTurmaButtonActionPerformed

        
    }//GEN-LAST:event_pesquisarTurmaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ListagemDeSolicitacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemDeSolicitacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemDeSolicitacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemDeSolicitacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemDeSolicitacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aLabel;
    private javax.swing.JLabel botaoVoltarLabel;
    private javax.swing.JPanel cabecalhoPanel;
    private _07gestaoacademica.CampoDeEscrita campoDataFinal;
    private _07gestaoacademica.CampoDeEscrita campoDataInicial;
    private _07gestaoacademica.CampoDeEscrita campoDisciplinaDaTurma;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel disciplinaTurmaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private _07gestaoacademica.CustomizacaoBotao limparCampoButton;
    private _07gestaoacademica.CustomizacaoBotao pesquisarTurmaButton;
    private javax.swing.JButton sairPaginaButton;
    private javax.swing.JSeparator separador;
    private _07gestaoacademica.CustomizacaoBotao solicitarMatricula;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusLabel;
    private _07gestaoacademica.JTablePersonalizada tabelaSolicitacoes;
    private javax.swing.JLabel tituloDaPaginaLabel;
    // End of variables declaration//GEN-END:variables
}
