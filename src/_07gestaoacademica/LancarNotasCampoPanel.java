package _07gestaoacademica;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LancarNotasCampoPanel extends JPanel{
    
    JTextField campoDeTexto;

    public LancarNotasCampoPanel() {
        
        campoDeTexto = new JTextField(8);
        campoDeTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!"0987654321.".contains(e.getKeyChar() + ""))
                    e.consume();
            }
        });
        
        add(campoDeTexto);
        
    }

    public JTextField getCampoDeTexto() {
        return campoDeTexto;
    }
    
}
