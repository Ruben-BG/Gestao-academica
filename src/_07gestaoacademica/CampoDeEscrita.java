package _07gestaoacademica;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author ravtec
 */
public class CampoDeEscrita extends JTextField{
    
    //Atributos
    JTextField textFieldUsado;

    public CampoDeEscrita() {
        
        setBackground(new Color(234, 234, 234));
        setFont(new java.awt.Font("SansSerif", 0, 14));
        setForeground(new Color(81, 81, 81));
        setText(" ");
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 234, 234), 5, true));
        
    }
    
    public void setTextFieldUsado(JTextField textFieldUsado) {
        this.textFieldUsado = textFieldUsado;
    }
    
    public JTextField getJTextFieldUsado() {
        return this.textFieldUsado;
    }
    
}
