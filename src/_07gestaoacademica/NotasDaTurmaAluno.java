package _07gestaoacademica;

import java.awt.Color;
import javax.swing.JLabel;

public class NotasDaTurmaAluno extends javax.swing.JFrame {

    //Atributos
    private int mouseX, mouseY;
    private GestaoContaUsuario novaGestaoContaUsuario;
    private ModeloTabelaTurmaAluno tableModelParaCampos = new ModeloTabelaTurmaAluno();
    private ModeloTabelaNotaAluno tableModel;

    public NotasDaTurmaAluno(int linhaSelecionada) {

        initComponents();
        setLocationRelativeTo(null);

        //campos
        Turma turmaSelecionada = tableModelParaCampos.getTurmaSelecionada(linhaSelecionada);
        campoDeCodigo.setText(turmaSelecionada.getCodigo());
        campoDisciplinaDaTurma.setText(turmaSelecionada.getDisciplina());
        campoHorarioDaTurma.setText(turmaSelecionada.getHorario());
        campoNomeProfessor.setText(turmaSelecionada.getProfessor().getNome());

        //tabela
        tableModel = new ModeloTabelaNotaAluno(tableModelParaCampos, linhaSelecionada);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        tableModel = new ModeloTabelaNotaAluno(tableModelParaCampos, linhaSelecionada);
        tabelaNota.setModel(tableModel);
        NotasDaTurmaCorRenderer colunaNotasRenderer = new NotasDaTurmaCorRenderer();
        tabelaNota.getColumnModel().getColumn(1).setCellRenderer(colunaNotasRenderer);
        
        //Média
        String mediaString = tableModel.getMediaDoAluno();
        Double media = mediaString == null ? null : Double.valueOf(mediaString);
        notaLabel.setText(mediaString);
        
        if (media == null) {
            mediaLabel.setText("⠀⠀");
            situacaoLabel.setText("⠀⠀");
            aprovacaoLabel.setVisible(false);
            
            JLabel mensagemErro = new JLabel("Você ainda não tem notas nesta turma.");
            mensagemErro.setFont(new java.awt.Font("Verdana", 0, 13));
            mensagemErro.setVerticalAlignment(JLabel.TOP);
            jScrollPane1.setViewportView(mensagemErro);
            
        } else if (media < 7) {
            aprovacaoLabel.setText("Reprovado(a)");
            aprovacaoLabel.setForeground(Color.red);
            notaLabel.setForeground(Color.red);
        } else {
            aprovacaoLabel.setText("Aprovado(a)");
            aprovacaoLabel.setForeground(new Color(19, 176, 110));
            notaLabel.setForeground(new Color(19, 176, 110));
        }

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
        separador = new javax.swing.JSeparator();
        codigoTurmaLabel = new javax.swing.JLabel();
        campoDeCodigo = new _07gestaoacademica.CampoDeEscrita();
        disciplinaTurmaLabel = new javax.swing.JLabel();
        campoDisciplinaDaTurma = new _07gestaoacademica.CampoDeEscrita();
        professorTurmaLabel = new javax.swing.JLabel();
        campoNomeProfessor = new _07gestaoacademica.CampoDeEscrita();
        horarioTurmaLabel = new javax.swing.JLabel();
        campoHorarioDaTurma = new _07gestaoacademica.CampoDeEscrita();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaNota = new _07gestaoacademica.JTablePersonalizada();
        mediaLabel = new javax.swing.JLabel();
        notaLabel = new javax.swing.JLabel();
        situacaoLabel = new javax.swing.JLabel();
        aprovacaoLabel = new javax.swing.JLabel();

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
        tituloDaPaginaLabel.setText("Notas da Turma");

        separador.setForeground(new java.awt.Color(234, 234, 234));

        codigoTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        codigoTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        codigoTurmaLabel.setText("Código");

        campoDeCodigo.setEditable(false);
        campoDeCodigo.setForeground(new java.awt.Color(127, 127, 127));
        campoDeCodigo.setText("");

        disciplinaTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        disciplinaTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        disciplinaTurmaLabel.setText("Disciplina");

        campoDisciplinaDaTurma.setEditable(false);
        campoDisciplinaDaTurma.setForeground(new java.awt.Color(127, 127, 127));
        campoDisciplinaDaTurma.setText("");

        professorTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        professorTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        professorTurmaLabel.setText("Professor");

        campoNomeProfessor.setEditable(false);
        campoNomeProfessor.setForeground(new java.awt.Color(127, 127, 127));
        campoNomeProfessor.setText("");

        horarioTurmaLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        horarioTurmaLabel.setForeground(new java.awt.Color(0, 0, 0));
        horarioTurmaLabel.setText("Horário");

        campoHorarioDaTurma.setEditable(false);
        campoHorarioDaTurma.setForeground(new java.awt.Color(127, 127, 127));
        campoHorarioDaTurma.setText("");

        jScrollPane1.setBorder(null);

        tabelaNota.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaNota.setSelectionBackground(new java.awt.Color(19, 176, 110));
        tabelaNota.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabelaNota);

        mediaLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mediaLabel.setForeground(new java.awt.Color(0, 0, 0));
        mediaLabel.setText("Média: ");

        notaLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        notaLabel.setForeground(new java.awt.Color(0, 0, 0));
        notaLabel.setText("nota");

        situacaoLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        situacaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        situacaoLabel.setText("Situação:");

        aprovacaoLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        aprovacaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        aprovacaoLabel.setText("nota");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigoTurmaLabel)
                                    .addComponent(campoDeCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(disciplinaTurmaLabel)
                                    .addComponent(campoDisciplinaDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(professorTurmaLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horarioTurmaLabel)
                                    .addComponent(campoHorarioDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(situacaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mediaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aprovacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cabecalhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloDaPaginaLabel))
                .addGap(6, 6, 6)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoTurmaLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(professorTurmaLabel)
                                .addComponent(horarioTurmaLabel)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDeCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoHorarioDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(disciplinaTurmaLabel)
                        .addGap(12, 12, 12)
                        .addComponent(campoDisciplinaDaTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaLabel)
                    .addComponent(notaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(situacaoLabel)
                    .addComponent(aprovacaoLabel))
                .addGap(11, 11, 11))
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

        ListagemTurmasAluno voltarParaListagem = new ListagemTurmasAluno();
        voltarParaListagem.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botaoVoltarLabelMouseClicked

    private void botaoVoltarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseEntered
        botaoVoltarLabel.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_botaoVoltarLabelMouseEntered

    private void botaoVoltarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarLabelMouseExited
        botaoVoltarLabel.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_botaoVoltarLabelMouseExited

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
            java.util.logging.Logger.getLogger(NotasDaTurmaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotasDaTurmaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotasDaTurmaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotasDaTurmaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotasDaTurmaAluno(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aprovacaoLabel;
    private javax.swing.JLabel botaoVoltarLabel;
    private javax.swing.JPanel cabecalhoPanel;
    private _07gestaoacademica.CampoDeEscrita campoDeCodigo;
    private _07gestaoacademica.CampoDeEscrita campoDisciplinaDaTurma;
    private _07gestaoacademica.CampoDeEscrita campoHorarioDaTurma;
    private _07gestaoacademica.CampoDeEscrita campoNomeProfessor;
    private javax.swing.JLabel codigoTurmaLabel;
    private javax.swing.JLabel disciplinaTurmaLabel;
    private javax.swing.JLabel horarioTurmaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mediaLabel;
    private javax.swing.JLabel notaLabel;
    private javax.swing.JLabel professorTurmaLabel;
    private javax.swing.JButton sairPaginaButton;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel situacaoLabel;
    private _07gestaoacademica.JTablePersonalizada tabelaNota;
    private javax.swing.JLabel tituloDaPaginaLabel;
    // End of variables declaration//GEN-END:variables
}
