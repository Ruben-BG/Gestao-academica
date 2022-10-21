package _07gestaoacademica;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author ravtec
 */
public class PopUp extends javax.swing.JFrame {
    
    private int mouseX, mouseY;
    GestaoContaUsuario novaGestaoContaUsuario;

    /**
     * Creates new form PopUp
     */
    public PopUp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipalPanel = new javax.swing.JPanel();
        cabecalhoPanel = new javax.swing.JPanel();
        sairPaginaButton = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        mensagemCentralLabel = new javax.swing.JLabel();
        botaoFinalButton = new _07gestaoacademica.CustomizacaoBotao();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelPrincipalPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        tituloLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(0, 0, 0));
        tituloLabel.setText("ERRO");

        javax.swing.GroupLayout cabecalhoPanelLayout = new javax.swing.GroupLayout(cabecalhoPanel);
        cabecalhoPanel.setLayout(cabecalhoPanelLayout);
        cabecalhoPanelLayout.setHorizontalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairPaginaButton)
                .addContainerGap())
        );
        cabecalhoPanelLayout.setVerticalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(cabecalhoPanelLayout.createSequentialGroup()
                        .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(sairPaginaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mensagemCentralLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mensagemCentralLabel.setForeground(new java.awt.Color(0, 0, 0));
        mensagemCentralLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensagemCentralLabel.setText("Local principal do aviso");

        botaoFinalButton.setForeground(new java.awt.Color(255, 255, 255));
        botaoFinalButton.setText("OK");
        botaoFinalButton.setCor(new java.awt.Color(36, 53, 61));
        botaoFinalButton.setCorBorda(new java.awt.Color(255, 255, 255));
        botaoFinalButton.setCorEntrou(new java.awt.Color(19, 176, 110));
        botaoFinalButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        botaoFinalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalPanelLayout = new javax.swing.GroupLayout(painelPrincipalPanel);
        painelPrincipalPanel.setLayout(painelPrincipalPanelLayout);
        painelPrincipalPanelLayout.setHorizontalGroup(
            painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabecalhoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalPanelLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(botaoFinalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensagemCentralLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPrincipalPanelLayout.setVerticalGroup(
            painelPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalPanelLayout.createSequentialGroup()
                .addComponent(cabecalhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(mensagemCentralLabel)
                .addGap(27, 27, 27)
                .addComponent(botaoFinalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.dispose();
    }//GEN-LAST:event_sairPaginaButtonActionPerformed

    private void cabecalhoPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_cabecalhoPanelMousePressed

    private void cabecalhoPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoPanelMouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_cabecalhoPanelMouseDragged

    private void botaoFinalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoFinalButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public PopUp(String args[]) {
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
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUp().setVisible(true);
            }
        });
    }
    
    //Opções de frases
    private void finalizacaoFrame() {
        setVisible(true);
        pack();
    }
    
    public void semNome(JTextField textField) {
        mensagemCentralLabel.setText("Nome não definido, ou inválido, por favor tente novamente.");
        finalizacaoFrame();
        botaoFinalButton.addActionListener((e) -> {
           
            this.dispose();
            textField.requestFocus();
            
        });
    }
    
    public void emailErrado(JTextField textField) {
        mensagemCentralLabel.setText("Campo de email inválido, por favor tente novamente.");
        finalizacaoFrame();
        botaoFinalButton.addActionListener((e) -> {
           
            this.dispose();
            textField.requestFocus();
            
        });
    }
    
    public void campoNaoPreenchido(String campo, JTextField textField) {
        mensagemCentralLabel.setText("Campo de " + campo + " não foi preenchido.");
        finalizacaoFrame();
        botaoFinalButton.addActionListener((e) -> {
           
            this.dispose();
            textField.requestFocus();
            
        });
    }
    
    public void naoNumerico(String campo, JTextField textField) {
        mensagemCentralLabel.setText("O valor do " + campo + " tem que conter apenas números.");
        finalizacaoFrame();
        botaoFinalButton.addActionListener((e) -> {
           
            this.dispose();
            textField.requestFocus();
            
        });
    }
    
    public void limiteNumero(String campo, int quantidade, JTextField textField) {
        mensagemCentralLabel.setText("O valor de " + campo + " tem que conter no mínimo " + quantidade + " digitos.");
        finalizacaoFrame();
        botaoFinalButton.addActionListener((e) -> {
           
            this.dispose();
            textField.requestFocus();
            
        });
    }
    
    public void nomeUsuario(JTextField textField) {
        mensagemCentralLabel.setText("Nome de usuário inválido, ou não preenchido.");
        finalizacaoFrame();
        botaoFinalButton.addActionListener((e) -> {
           
            this.dispose();
            textField.requestFocus();
            
        });
    }
    
    public void mensagemFinal(String textoCadastro, FormularioContaUsuario referenciaFormulario) {
        tituloLabel.setText("SUCESSO");
        mensagemCentralLabel.setText(textoCadastro);
        botaoFinalButton.setText("ENTRAR NO SISTEMA");
        finalizacaoFrame();
        botaoFinalButton.addActionListener((e) -> {
           
            this.dispose();
            referenciaFormulario.dispose();
            novaGestaoContaUsuario = new GestaoContaUsuario();
            novaGestaoContaUsuario.setVisible(true);
            
        });
    }
    
    public void entradaConta(String erro, String textoValidacao) {
        tituloLabel.setText(erro);
        mensagemCentralLabel.setText(textoValidacao);
        finalizacaoFrame();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private _07gestaoacademica.CustomizacaoBotao botaoFinalButton;
    private javax.swing.JPanel cabecalhoPanel;
    private javax.swing.JLabel mensagemCentralLabel;
    private javax.swing.JPanel painelPrincipalPanel;
    private javax.swing.JButton sairPaginaButton;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
