package _07gestaoacademica;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DashboardAluno extends javax.swing.JFrame {

    //Atributos
    GestaoContaUsuario novaGestaoContaUsuario;
    int mouseX, mouseY;
    
    public DashboardAluno() {
        
        initComponents();
        setLocationRelativeTo(null);
        
        nomeLabel.setText(BancoDeDados.pegaUsuario().getNome() + " | Aluno(a)");
        dataHora();
        
        
        turmaButton.mudarTexto("Suas turmas");
        turmaButton.mudarNumero(String.valueOf(BancoDeDados.quantidadeTurmaAluno()));
        turmaButton.mudarIcone("/_07gestaoacademica/images/turmaP.png");
        
        solicitarMatriculaButton.igualarFonte();
        solicitarMatriculaButton.mudarTexto("matrícula");
        solicitarMatriculaButton.mudarNumero("Solicitar");
        solicitarMatriculaButton.mudarIcone("/_07gestaoacademica/images/grupoP.png");
        
        suasSolicitacoesButton.mudarTexto("Suas solicitações");
        suasSolicitacoesButton.mudarNumero(String.valueOf(BancoDeDados.quantidadeSolicitacaoDeUmAluno()));
        suasSolicitacoesButton.mudarIcone("/_07gestaoacademica/images/emailP.png");
        
        suasNotasButton.mudarTexto("Suas notas");
        suasNotasButton.mudarNumero("0");
        suasNotasButton.mudarIcone("/_07gestaoacademica/images/notasP.png");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGeral = new javax.swing.JPanel();
        cabecalhoJPanel = new javax.swing.JPanel();
        tituloDoCabecalhoLabel = new javax.swing.JLabel();
        sairPaginaButton = new javax.swing.JButton();
        nomeLabel = new javax.swing.JLabel();
        dataLabel = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        turmaButton = new _07gestaoacademica.FormularioButton();
        solicitarMatriculaButton = new _07gestaoacademica.FormularioButton();
        suasSolicitacoesButton = new _07gestaoacademica.FormularioButton();
        suasNotasButton = new _07gestaoacademica.FormularioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelGeral.setBackground(new java.awt.Color(255, 255, 255));

        cabecalhoJPanel.setBackground(new java.awt.Color(242, 242, 242));
        cabecalhoJPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabecalhoJPanelMouseDragged(evt);
            }
        });
        cabecalhoJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabecalhoJPanelMousePressed(evt);
            }
        });

        tituloDoCabecalhoLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tituloDoCabecalhoLabel.setForeground(new java.awt.Color(102, 102, 102));
        tituloDoCabecalhoLabel.setText("DASHBOARD ALUNO");

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

        javax.swing.GroupLayout cabecalhoJPanelLayout = new javax.swing.GroupLayout(cabecalhoJPanel);
        cabecalhoJPanel.setLayout(cabecalhoJPanelLayout);
        cabecalhoJPanelLayout.setHorizontalGroup(
            cabecalhoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tituloDoCabecalhoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairPaginaButton)
                .addGap(15, 15, 15))
        );
        cabecalhoJPanelLayout.setVerticalGroup(
            cabecalhoJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloDoCabecalhoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sairPaginaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        nomeLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(76, 95, 99));
        nomeLabel.setText("NOME");

        dataLabel.setForeground(new java.awt.Color(117, 117, 117));
        dataLabel.setText("data");
        dataLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dataLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dataLabelMouseExited(evt);
            }
        });

        sairButton.setBackground(new java.awt.Color(255, 255, 255));
        sairButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        sairButton.setForeground(new java.awt.Color(76, 95, 99));
        sairButton.setText("Sair");
        sairButton.setBorder(null);
        sairButton.setContentAreaFilled(false);
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sairButtonMouseExited(evt);
            }
        });
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        turmaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turmaButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                turmaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                turmaButtonMouseExited(evt);
            }
        });

        solicitarMatriculaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solicitarMatriculaButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                solicitarMatriculaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                solicitarMatriculaButtonMouseExited(evt);
            }
        });

        suasSolicitacoesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suasSolicitacoesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suasSolicitacoesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suasSolicitacoesButtonMouseExited(evt);
            }
        });

        suasNotasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suasNotasButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suasNotasButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suasNotasButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout painelGeralLayout = new javax.swing.GroupLayout(painelGeral);
        painelGeral.setLayout(painelGeralLayout);
        painelGeralLayout.setHorizontalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabecalhoJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(suasSolicitacoesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solicitarMatriculaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelGeralLayout.createSequentialGroup()
                        .addComponent(dataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(suasNotasButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelGeralLayout.setVerticalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGeralLayout.createSequentialGroup()
                .addComponent(cabecalhoJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairButton)
                    .addComponent(nomeLabel)
                    .addComponent(dataLabel))
                .addGap(36, 36, 36)
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solicitarMatriculaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suasSolicitacoesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suasNotasButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos de simplificação
    private void dataHora() {
        
        Thread tempo = new Thread(){
            @Override
            public void run() {
                try {
                    while(true) {
                        
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                        LocalDateTime ldt = LocalDateTime.now();
                        dataLabel.setText(dtf.format(ldt));
                        sleep(1000);
                    }
                } catch (Exception e) {
                }
            }
        };
        tempo.start();
        
    }
    
    
    //Métodos de ação
    
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

    private void cabecalhoJPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoJPanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_cabecalhoJPanelMousePressed

    private void cabecalhoJPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoJPanelMouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY); //evento de mover a janela
    }//GEN-LAST:event_cabecalhoJPanelMouseDragged

    private void dataLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataLabelMouseEntered
        dataLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_dataLabelMouseEntered

    private void dataLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataLabelMouseExited
        dataLabel.setForeground(new Color(117, 117, 117));
    }//GEN-LAST:event_dataLabelMouseExited

    private void sairButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairButtonMouseEntered
        sairButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_sairButtonMouseEntered

    private void sairButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairButtonMouseExited
        sairButton.setForeground(new Color(76, 95, 99));
    }//GEN-LAST:event_sairButtonMouseExited

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        novaGestaoContaUsuario = new GestaoContaUsuario();
        novaGestaoContaUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void solicitarMatriculaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitarMatriculaButtonMouseClicked
        
        SolicitarMatriculaAluno janelaSolicitacao = new SolicitarMatriculaAluno();
        janelaSolicitacao.voltarAoDashBoard(true);
        janelaSolicitacao.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_solicitarMatriculaButtonMouseClicked

    private void solicitarMatriculaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitarMatriculaButtonMouseEntered
        solicitarMatriculaButton.mudarIcone("/_07gestaoacademica/images/grupoB.png");
    }//GEN-LAST:event_solicitarMatriculaButtonMouseEntered

    private void solicitarMatriculaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitarMatriculaButtonMouseExited
        solicitarMatriculaButton.mudarIcone("/_07gestaoacademica/images/grupoP.png");
    }//GEN-LAST:event_solicitarMatriculaButtonMouseExited

    private void turmaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaButtonMouseClicked
        
        ListagemTurmasAluno telaDeListagem = new ListagemTurmasAluno();
        telaDeListagem.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_turmaButtonMouseClicked

    private void turmaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaButtonMouseEntered
        turmaButton.mudarIcone("/_07gestaoacademica/images/turmaB.png");
    }//GEN-LAST:event_turmaButtonMouseEntered

    private void turmaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaButtonMouseExited
        turmaButton.mudarIcone("/_07gestaoacademica/images/turmaP.png");
    }//GEN-LAST:event_turmaButtonMouseExited

    private void suasSolicitacoesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suasSolicitacoesButtonMouseClicked
        
        ListagemDeSolicitacoes telaDeListagem = new ListagemDeSolicitacoes();
        telaDeListagem.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_suasSolicitacoesButtonMouseClicked

    private void suasSolicitacoesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suasSolicitacoesButtonMouseEntered
        suasSolicitacoesButton.mudarIcone("/_07gestaoacademica/images/emailB.png");
    }//GEN-LAST:event_suasSolicitacoesButtonMouseEntered

    private void suasSolicitacoesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suasSolicitacoesButtonMouseExited
        suasSolicitacoesButton.mudarIcone("/_07gestaoacademica/images/emailP.png");
    }//GEN-LAST:event_suasSolicitacoesButtonMouseExited

    private void suasNotasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suasNotasButtonMouseClicked
        
    }//GEN-LAST:event_suasNotasButtonMouseClicked

    private void suasNotasButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suasNotasButtonMouseEntered
        suasNotasButton.mudarIcone("/_07gestaoacademica/images/notasB.png");
    }//GEN-LAST:event_suasNotasButtonMouseEntered

    private void suasNotasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suasNotasButtonMouseExited
        suasNotasButton.mudarIcone("/_07gestaoacademica/images/notasP.png");
    }//GEN-LAST:event_suasNotasButtonMouseExited

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
            java.util.logging.Logger.getLogger(DashboardAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cabecalhoJPanel;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel painelGeral;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton sairPaginaButton;
    private _07gestaoacademica.FormularioButton solicitarMatriculaButton;
    private _07gestaoacademica.FormularioButton suasNotasButton;
    private _07gestaoacademica.FormularioButton suasSolicitacoesButton;
    private javax.swing.JLabel tituloDoCabecalhoLabel;
    private _07gestaoacademica.FormularioButton turmaButton;
    // End of variables declaration//GEN-END:variables
}
