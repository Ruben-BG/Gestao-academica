package _07gestaoacademica;

import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotoesSolicitacoesCoordenadorPanel extends JPanel {
    
    public final List<JButton> buttons = new ArrayList<>();

    public BotoesSolicitacoesCoordenadorPanel() {
        super();
        setOpaque(true);
        buttons.add(new JButton("Rejeitar"));
        buttons.add(new JButton("Aprovar"));
        for(JButton b: buttons) {
            b.setFocusable(false);
            b.setRolloverEnabled(false);
            
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
            b.setForeground(Color.WHITE);
            
            if("Aprovar".equals(b.getText())){
                b.setBackground(new Color(76, 95, 99));
            } else {
                b.setBackground(new Color(212, 67, 81));
            }
            
            add(b);
        }
    }

    public List<JButton> getButtons() {
        return buttons;
    }
    
}
