/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package _07gestaoacademica;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author ravtec
 */
public class CampoFormularioProfessor extends javax.swing.JPanel {

    /**
     * Creates new form CampoFormularioProfessor
     */
    public CampoFormularioProfessor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeTextField = new javax.swing.JTextField();
        cpfTextField = new javax.swing.JTextField();
        telefoneTextField = new javax.swing.JTextField();
        enderecoTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        senhaTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        nomeTextField.setBackground(new java.awt.Color(234, 234, 234));
        nomeTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nomeTextField.setForeground(new java.awt.Color(81, 81, 81));
        nomeTextField.setText("Digite seu nome");
        nomeTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 234, 234), 5, true));
        nomeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeTextFieldFocusLost(evt);
            }
        });

        cpfTextField.setBackground(new java.awt.Color(234, 234, 234));
        cpfTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cpfTextField.setForeground(new java.awt.Color(81, 81, 81));
        cpfTextField.setText("Digite seu CPF");
        cpfTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 234, 234), 5, true));
        cpfTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfTextFieldFocusLost(evt);
            }
        });

        telefoneTextField.setBackground(new java.awt.Color(234, 234, 234));
        telefoneTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        telefoneTextField.setForeground(new java.awt.Color(81, 81, 81));
        telefoneTextField.setText("Digite seu telefone");
        telefoneTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 234, 234), 5, true));
        telefoneTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefoneTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefoneTextFieldFocusLost(evt);
            }
        });

        enderecoTextField.setBackground(new java.awt.Color(234, 234, 234));
        enderecoTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        enderecoTextField.setForeground(new java.awt.Color(81, 81, 81));
        enderecoTextField.setText("Digite seu endereço");
        enderecoTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 234, 234), 5, true));
        enderecoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enderecoTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enderecoTextFieldFocusLost(evt);
            }
        });

        emailTextField.setBackground(new java.awt.Color(234, 234, 234));
        emailTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(81, 81, 81));
        emailTextField.setText("Digite seu email");
        emailTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 234, 234), 5, true));
        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });

        senhaTextField.setBackground(new java.awt.Color(234, 234, 234));
        senhaTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        senhaTextField.setForeground(new java.awt.Color(81, 81, 81));
        senhaTextField.setText("Digite sua senha");
        senhaTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 234, 234), 5, true));
        senhaTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpfTextField))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enderecoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(senhaTextField)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    protected void campoComFoco(String texto, JTextField textField) {
        if(texto.equals(textField.getText()))
            textField.setText("");
    }
    
    protected void campoSemFoco(String texto, JTextField textField) {
        if("".equals(textField.getText()))
            textField.setText(texto);
        else
            textField.setForeground(Color.BLACK);
    }
    
    /*public void gerarPopUp() {
        
        boolean telefoneNum = telefoneTextField.getText().chars().allMatch(Character::isDigit); //<- vê se o espaço "telefone" é numérico
        boolean cpfNum = cpfTextField.getText().chars().allMatch(Character::isDigit); //<- vê se o espaço "cpf" é numérico
        boolean emailCorreto = emailTextField.getText().contains("@"); //método de verificação se tem ou não @ no campo

        if("".equals(nomeTextField.getText())) {
            popUp = new PopUp();
            popUp.semNome();
        } else if("".equals(cpfTextField.getText())) {
            popUp = new PopUp();
            popUp.campoNaoPreenchido("CPF");
        } else if("".equals(emailTextField.getText())) {
            popUp = new PopUp();
            popUp.campoNaoPreenchido("Email");
        } else if("".equals(String.valueOf(senhaPasswordField.getPassword()))) {
            popUp = new PopUp();
            popUp.campoNaoPreenchido("Senha");
        } else if(!"".equals(telefoneTextField.getText()) && !telefoneNum) {
            popUp = new PopUp();
            popUp.naoNumerico("telefone");
        } else if(!cpfNum) {
            popUp = new PopUp();
            popUp.naoNumerico("CPF");
        } else if(!emailCorreto) {
            popUp = new PopUp();
            popUp.emailErrado();
        } else if(nomeTextField.getText().chars().count() < 3) {
            popUp = new PopUp();
            popUp.limiteNumero("nome", 2);
        }
        
    }*/
    
    private void nomeTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeTextFieldFocusGained
        campoComFoco("Digite seu nome", nomeTextField);
    }//GEN-LAST:event_nomeTextFieldFocusGained

    private void nomeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeTextFieldFocusLost
        campoSemFoco("Digite seu nome", nomeTextField);
    }//GEN-LAST:event_nomeTextFieldFocusLost

    private void cpfTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfTextFieldFocusGained
        campoComFoco("Digite seu CPF", cpfTextField);
    }//GEN-LAST:event_cpfTextFieldFocusGained

    private void cpfTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfTextFieldFocusLost
        campoSemFoco("Digite seu CPF", cpfTextField);
    }//GEN-LAST:event_cpfTextFieldFocusLost

    private void telefoneTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneTextFieldFocusGained
        campoComFoco("Digite seu telefone", telefoneTextField);
    }//GEN-LAST:event_telefoneTextFieldFocusGained

    private void telefoneTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneTextFieldFocusLost
        campoSemFoco("Digite seu telefone", telefoneTextField);
    }//GEN-LAST:event_telefoneTextFieldFocusLost

    private void enderecoTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enderecoTextFieldFocusGained
        campoComFoco("Digite seu endereço", enderecoTextField);
    }//GEN-LAST:event_enderecoTextFieldFocusGained

    private void enderecoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enderecoTextFieldFocusLost
        campoSemFoco("Digite seu endereço", enderecoTextField);
    }//GEN-LAST:event_enderecoTextFieldFocusLost

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
        campoComFoco("Digite seu email", emailTextField);
    }//GEN-LAST:event_emailTextFieldFocusGained

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
        campoSemFoco("Digite seu email", emailTextField);
    }//GEN-LAST:event_emailTextFieldFocusLost

    private void senhaTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaTextFieldFocusGained
        campoComFoco("Digite sua senha", senhaTextField);
    }//GEN-LAST:event_senhaTextFieldFocusGained

    private void senhaTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaTextFieldFocusLost
        campoSemFoco("Digite sua senha", senhaTextField);
    }//GEN-LAST:event_senhaTextFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField enderecoTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
