package _07gestaoacademica;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BotoesPanel extends JPanel {

    public final List<JButton> buttons = new ArrayList<>();

    public BotoesPanel() {
        super();
        setOpaque(true);
        buttons.add(new JButton("editar"));
        buttons.add(new JButton("excluir"));
        for(JButton b: buttons) {
            b.setFocusable(false);
            b.setRolloverEnabled(false);
            
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
            b.setForeground(Color.WHITE);
            
            if("editar".equals(b.getText())){
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