package _07gestaoacademica;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.table.TableColumn;


public class ListagemProfessor extends javax.swing.JFrame {

    //Atributos
    private int mouseX, mouseY;
    GestaoContaUsuario novaGestaoContaUsuario;
    DashboardCoordenador voltarDashboardCoordenador;
    private final ModeloTabelaProfessor tableModel = new ModeloTabelaProfessor();
    final ListagemProfessor essaJanela = this;
    
    public ListagemProfessor() {
        initComponents();
        setLocationRelativeTo(null);
        
        campoDeNome.requestFocus();
        
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        tabelaProfessor.setModel(tableModel);
        TableColumn colunaDosBotoes = tabelaProfessor.getColumnModel().getColumn(2);
        colunaDosBotoes.setCellRenderer(new BotoesRenderer());
        colunaDosBotoes.setCellEditor(new BotoesListagemProfessorEditor(tabelaProfessor, essaJanela, tableModel));
        limparCampoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pesquisarUsuarioButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        tabelaProfessor.getColumnModel().getColumn(0).setPreferredWidth(200);
        
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
        sairPaginaButton2 = new javax.swing.JButton();
        botaoVoltarLabel = new javax.swing.JLabel();
        tituloDaPaginaLabel = new javax.swing.JLabel();
        criarNovoProfessorButton = new _07gestaoacademica.CustomizacaoBotao();
        separador = new javax.swing.JSeparator();
        nomeLabel = new javax.swing.JLabel();
        campoDeNome = new _07gestaoacademica.CampoDeEscrita();
        codigoDaTurmaLabel = new javax.swing.JLabel();
        campoCodigoDaTurma = new _07gestaoacademica.CampoDeEscrita();
        disciplinaTurmaLabel = new javax.swing.JLabel();
        campoDisciplinaTurma = new _07gestaoacademica.CampoDeEscrita();
        limparCampoButton = new _07gestaoacademica.CustomizacaoBotao();
        pesquisarUsuarioButton = new _07gestaoacademica.CustomizacaoBotao();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProfessor = new _07gestaoacademica.JTablePersonalizada();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairPaginaButton2)
                .addGap(18, 18, 18))
        );
        cabecalhoPanelLayout.setVerticalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sairPaginaButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        tituloDaPaginaLabel.setText("Listagem de Professores");

        criarNovoProfessorButton.setForeground(new java.awt.Color(255, 255, 255));
        criarNovoProfessorButton.setText("Novo Professor");
        criarNovoProfessorButton.setCor(new java.awt.Color(36, 53, 61));
        criarNovoProfessorButton.setCorBorda(new java.awt.Color(255, 255, 255));
        criarNovoProfessorButton.setCorEntrou(new java.awt.Color(19, 176, 110));
        criarNovoProfessorButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        criarNovoProfessorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarNovoProfessorButtonActionPerformed(evt);
            }
        });

        separador.setForeground(new java.awt.Color(234, 234, 234));

        nomeLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeLabel.setText("Nome");

        campoDeNome.setText("");
        campoDeNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDeNomeKeyPressed(evt);
            }
        });

        codigoDaTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        codigoDaTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        codigoDaTurmaLabel.setText("Código da Turma");

        campoCodigoDaTurma.setText("");
        campoCodigoDaTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoCodigoDaTurmaKeyPressed(evt);
            }
        });

        disciplinaTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        disciplinaTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        disciplinaTurmaLabel.setText("Disciplina");

        campoDisciplinaTurma.setText("");
        campoDisciplinaTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDisciplinaTurmaKeyPressed(evt);
            }
        });

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

        pesquisarUsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
        pesquisarUsuarioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_07gestaoacademica/images/lupaB.png"))); // NOI18N
        pesquisarUsuarioButton.setCor(new java.awt.Color(76, 95, 99));
        pesquisarUsuarioButton.setCorBorda(new java.awt.Color(255, 255, 255));
        pesquisarUsuarioButton.setCorClicou(new java.awt.Color(117, 146, 153));
        pesquisarUsuarioButton.setCorEntrou(new java.awt.Color(87, 123, 132));
        pesquisarUsuarioButton.setCorSaiu(new java.awt.Color(76, 95, 99));
        pesquisarUsuarioButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pesquisarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarUsuarioButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportView(tabelaProfessor);

        tabelaProfessor.setBackground(new java.awt.Color(255, 255, 255));
        tabelaProfessor.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaProfessor.setSelectionBackground(new java.awt.Color(19, 176, 110));
        tabelaProfessor.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaProfessor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(botaoVoltarLabel)
                        .addGap(22, 22, 22)
                        .addComponent(tituloDaPaginaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)
                        .addComponent(criarNovoProfessorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nomeLabel)
                        .addGap(199, 199, 199)
                        .addComponent(codigoDaTurmaLabel)
                        .addGap(29, 29, 29)
                        .addComponent(disciplinaTurmaLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoDeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoCodigoDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(campoDisciplinaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(limparCampoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(pesquisarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(16, 18, Short.MAX_VALUE))
            .addComponent(cabecalhoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cabecalhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloDaPaginaLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(criarNovoProfessorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeLabel)
                    .addComponent(codigoDaTurmaLabel)
                    .addComponent(disciplinaTurmaLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCodigoDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDisciplinaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limparCampoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pesquisarUsuarioButton.getAccessibleContext().setAccessibleName("n");

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

    
    //Métodos de simplificação
    
    public void mensagemCasoPesquisaDeErrado() {
        JLabel mensagem = new JLabel("Pesquisa inválida.");
        mensagem.setFont(new java.awt.Font("Verdana", 0, 13));
        mensagem.setVerticalAlignment(JLabel.TOP);
        jScrollPane2.setViewportView(mensagem);
    }
    
    public void mensagemDePesquisaBemSucedida() {
        jScrollPane2.setViewportView(tabelaProfessor);
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

    private void cabecalhoPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_cabecalhoPanelMousePressed

    private void cabecalhoPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_cabecalhoPanelMouseDragged

    private void botaoVoltarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseEntered
        botaoVoltarLabel.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_botaoVoltarLabelMouseEntered

    private void botaoVoltarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseExited
        botaoVoltarLabel.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_botaoVoltarLabelMouseExited

    private void botaoVoltarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseClicked
        voltarDashboardCoordenador = new DashboardCoordenador();
        voltarDashboardCoordenador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarLabelMouseClicked

    private void criarNovoProfessorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarNovoProfessorButtonActionPerformed

        CadastroNovoProfessor criarNovoProfessor = new CadastroNovoProfessor();
        criarNovoProfessor.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_criarNovoProfessorButtonActionPerformed

    private void pesquisarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarUsuarioButtonActionPerformed
        
        String nome = campoDeNome.getText().trim().toUpperCase();
        String codigo = campoCodigoDaTurma.getText().trim().toUpperCase();
        String disciplina = campoDisciplinaTurma.getText().trim().toUpperCase();
        
        tableModel.pesquisarProfessor(nome, codigo, disciplina, tabelaProfessor, this);
        
    }//GEN-LAST:event_pesquisarUsuarioButtonActionPerformed

    private void limparCampoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampoButtonActionPerformed
        
        campoDeNome.setText("");
        campoCodigoDaTurma.setText("");
        campoDisciplinaTurma.setText("");
        pesquisarUsuarioButton.doClick();
        campoDeNome.requestFocus();
        
    }//GEN-LAST:event_limparCampoButtonActionPerformed

    private void campoDeNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDeNomeKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            pesquisarUsuarioButtonActionPerformed(null);
        
    }//GEN-LAST:event_campoDeNomeKeyPressed

    private void campoCodigoDaTurmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCodigoDaTurmaKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            pesquisarUsuarioButtonActionPerformed(null);
        
    }//GEN-LAST:event_campoCodigoDaTurmaKeyPressed

    private void campoDisciplinaTurmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDisciplinaTurmaKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            pesquisarUsuarioButtonActionPerformed(null);
        
    }//GEN-LAST:event_campoDisciplinaTurmaKeyPressed

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
    private javax.swing.JLabel botaoVoltarLabel;
    private javax.swing.JPanel cabecalhoPanel;
    private _07gestaoacademica.CampoDeEscrita campoCodigoDaTurma;
    private _07gestaoacademica.CampoDeEscrita campoDeNome;
    private _07gestaoacademica.CampoDeEscrita campoDisciplinaTurma;
    private javax.swing.JLabel codigoDaTurmaLabel;
    private _07gestaoacademica.CustomizacaoBotao criarNovoProfessorButton;
    private javax.swing.JLabel disciplinaTurmaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private _07gestaoacademica.CustomizacaoBotao limparCampoButton;
    private javax.swing.JLabel nomeLabel;
    private _07gestaoacademica.CustomizacaoBotao pesquisarUsuarioButton;
    private javax.swing.JButton sairPaginaButton2;
    private javax.swing.JSeparator separador;
    private _07gestaoacademica.JTablePersonalizada tabelaProfessor;
    private javax.swing.JLabel tituloDaPaginaLabel;
    // End of variables declaration//GEN-END:variables
}
