package _07gestaoacademica;

import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotoesTurmaProfessorPanel extends JPanel{
    
    public final List<JButton> botoes = new ArrayList<>();
    
    public BotoesTurmaProfessorPanel() {
        
        super();
        setOpaque(true);
        botoes.add(new JButton("Notas"));
        botoes.add(new JButton("Vizualizar"));
        for(JButton b: botoes) {
            b.setFocusable(false);
            b.setRolloverEnabled(false);
            
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
            b.setForeground(Color.WHITE);
            
            if("Notas".equals(b.getText())){
                b.setBackground(new Color(57,71,75));
            } else {
                b.setBackground(new Color(10,121,121));
            }
            
            add(b);
        }
        
    }

    public List<JButton> getBotoes() {
        return botoes;
    }
    
}
