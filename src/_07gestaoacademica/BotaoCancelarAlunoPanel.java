package _07gestaoacademica;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotaoCancelarAlunoPanel extends JPanel {
    
    JButton botaoCancelar;
    
    public BotaoCancelarAlunoPanel() {
        
        super();
        setOpaque(true);
        botaoCancelar = new JButton("Cancelar");

        botaoCancelar.setFocusable(false);
        botaoCancelar.setRolloverEnabled(false);

        botaoCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botaoCancelar.setForeground(Color.WHITE);

        botaoCancelar.setBackground(new Color(212, 67, 81));

        add(botaoCancelar);
        
    }

    public JButton getBotao() {
        return botaoCancelar;
    }
    
}
