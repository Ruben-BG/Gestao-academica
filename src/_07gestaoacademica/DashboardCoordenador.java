package _07gestaoacademica;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ravtec
 */
public class DashboardCoordenador extends javax.swing.JFrame {

    //Atributos
    private int mouseX, mouseY;
    GestaoContaUsuario novaGestaoContaUsuario;
    ListagemProfessor novaListagemProfessor;
    ListagemDeTurma novaListagemDeTurma;
    ListagemDeAluno novaListagemDeAluno;
    
    public DashboardCoordenador() {
        initComponents();
        setLocationRelativeTo(null);
        
        nomeLabel.setText(BancoDeDados.pegaUsuario().getNome() + " | Coordenador");
        dataHora();
        
        professorButton.mudarIcone("/_07gestaoacademica/images/professorP.png");
        professorButton.mudarNumero(String.valueOf(BancoDeDados.quantidadeProfessor()));
        professorButton.mudarTexto("Professores");
        turmaButton.mudarIcone("/_07gestaoacademica/images/turmaP.png");
        turmaButton.mudarNumero(String.valueOf(BancoDeDados.quantidadeTurma()));
        turmaButton.mudarTexto("Turmas");
        alunoButton.mudarNumero(String.valueOf(BancoDeDados.quantidadeAluno()));
        alunoButton.mudarTexto("Alunos");
        solicitacaoButton.mudarIcone("/_07gestaoacademica/images/emailP.png");
        solicitacaoButton.mudarNumero(String.valueOf(BancoDeDados.retornarSolicitacoesPendentesDeAlunos().size()));
        solicitacaoButton.mudarTexto("Solicitações");
        
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
        cabecalhoPanel = new javax.swing.JPanel();
        tituloCabecalhoLabel = new javax.swing.JLabel();
        sairPaginaButton2 = new javax.swing.JButton();
        nomeLabel = new javax.swing.JLabel();
        dataLabel = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        professorButton = new _07gestaoacademica.FormularioButton();
        turmaButton = new _07gestaoacademica.FormularioButton();
        alunoButton = new _07gestaoacademica.FormularioButton();
        solicitacaoButton = new _07gestaoacademica.FormularioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        painelGeral.setBackground(new java.awt.Color(255, 255, 255));

        cabecalhoPanel.setBackground(new java.awt.Color(242, 242, 242));
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

        tituloCabecalhoLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tituloCabecalhoLabel.setForeground(new java.awt.Color(102, 102, 102));
        tituloCabecalhoLabel.setText("DASHBOARD COORDENADOR");

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

        javax.swing.GroupLayout cabecalhoPanelLayout = new javax.swing.GroupLayout(cabecalhoPanel);
        cabecalhoPanel.setLayout(cabecalhoPanelLayout);
        cabecalhoPanelLayout.setHorizontalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCabecalhoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(sairPaginaButton2)
                .addGap(14, 14, 14))
        );
        cabecalhoPanelLayout.setVerticalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sairPaginaButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addGroup(cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCabecalhoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        professorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                professorButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                professorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                professorButtonMouseExited(evt);
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

        alunoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunoButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alunoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alunoButtonMouseExited(evt);
            }
        });

        solicitacaoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solicitacaoButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                solicitacaoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                solicitacaoButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout painelGeralLayout = new javax.swing.GroupLayout(painelGeral);
        painelGeral.setLayout(painelGeralLayout);
        painelGeralLayout.setHorizontalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabecalhoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGeralLayout.createSequentialGroup()
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGeralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelGeralLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(professorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alunoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(turmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelGeralLayout.createSequentialGroup()
                        .addComponent(dataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(solicitacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelGeralLayout.setVerticalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGeralLayout.createSequentialGroup()
                .addComponent(cabecalhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairButton)
                    .addComponent(nomeLabel)
                    .addComponent(dataLabel))
                .addGap(26, 26, 26)
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(turmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(professorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alunoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solicitacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Métodos de simplificação
    
    private void mudarIcone(FormularioButton button, String local) {
        
        button.mudarIcone(local);
        
    }
    
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

    private void sairButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairButtonMouseEntered
        sairButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_sairButtonMouseEntered

    private void sairButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairButtonMouseExited
        sairButton.setForeground(new Color(76, 95, 99));
    }//GEN-LAST:event_sairButtonMouseExited

    private void cabecalhoPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_cabecalhoPanelMousePressed

    private void cabecalhoPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY); //evento de mover a janela
    }//GEN-LAST:event_cabecalhoPanelMouseDragged

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        novaGestaoContaUsuario = new GestaoContaUsuario();
        novaGestaoContaUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void dataLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataLabelMouseEntered
        dataLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_dataLabelMouseEntered

    private void dataLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataLabelMouseExited
        dataLabel.setForeground(new Color(117, 117, 117));
    }//GEN-LAST:event_dataLabelMouseExited

    private void professorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_professorButtonMouseEntered
        mudarIcone(professorButton, "/_07gestaoacademica/images/professorB.png");
    }//GEN-LAST:event_professorButtonMouseEntered

    private void professorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_professorButtonMouseExited
        mudarIcone(professorButton, "/_07gestaoacademica/images/professorP.png");
    }//GEN-LAST:event_professorButtonMouseExited

    private void turmaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaButtonMouseEntered
        mudarIcone(turmaButton, "/_07gestaoacademica/images/turmaB.png");
    }//GEN-LAST:event_turmaButtonMouseEntered

    private void turmaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaButtonMouseExited
        mudarIcone(turmaButton, "/_07gestaoacademica/images/turmaP.png");
    }//GEN-LAST:event_turmaButtonMouseExited

    private void alunoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunoButtonMouseEntered
        mudarIcone(alunoButton, "/_07gestaoacademica/images/alunosB.png");
    }//GEN-LAST:event_alunoButtonMouseEntered

    private void alunoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunoButtonMouseExited
        mudarIcone(alunoButton, "/_07gestaoacademica/images/alunosP.png");
    }//GEN-LAST:event_alunoButtonMouseExited

    private void solicitacaoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitacaoButtonMouseEntered
        mudarIcone(solicitacaoButton, "/_07gestaoacademica/images/emailB.png");
    }//GEN-LAST:event_solicitacaoButtonMouseEntered

    private void solicitacaoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitacaoButtonMouseExited
        mudarIcone(solicitacaoButton, "/_07gestaoacademica/images/emailP.png");
    }//GEN-LAST:event_solicitacaoButtonMouseExited

    private void professorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_professorButtonMouseClicked
        novaListagemProfessor = new ListagemProfessor();
        novaListagemProfessor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_professorButtonMouseClicked

    private void turmaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaButtonMouseClicked
        novaListagemDeTurma = new ListagemDeTurma();
        novaListagemDeTurma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_turmaButtonMouseClicked

    private void alunoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunoButtonMouseClicked
        novaListagemDeAluno = new ListagemDeAluno();
        novaListagemDeAluno.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_alunoButtonMouseClicked

    private void solicitacaoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solicitacaoButtonMouseClicked
        ListagemDeSolicitacoesCoordenador novaListagem = new ListagemDeSolicitacoesCoordenador();
        novaListagem.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_solicitacaoButtonMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardCoordenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private _07gestaoacademica.FormularioButton alunoButton;
    private javax.swing.JPanel cabecalhoPanel;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel painelGeral;
    private _07gestaoacademica.FormularioButton professorButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton sairPaginaButton2;
    private _07gestaoacademica.FormularioButton solicitacaoButton;
    private javax.swing.JLabel tituloCabecalhoLabel;
    private _07gestaoacademica.FormularioButton turmaButton;
    // End of variables declaration//GEN-END:variables
}
