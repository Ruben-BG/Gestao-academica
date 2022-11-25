package _07gestaoacademica;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotaoRemoverSolicitacaoAlunoPanel extends JPanel{
    
    JButton botaoRemover = new JButton();
    
    public BotaoRemoverSolicitacaoAlunoPanel() {
        
        super();
        setOpaque(true);
        botaoRemover = new JButton("Remover");

        botaoRemover.setFocusable(false);
        botaoRemover.setRolloverEnabled(false);

        botaoRemover.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botaoRemover.setForeground(Color.WHITE);

        botaoRemover.setBackground(new Color(76, 95, 99));

        add(botaoRemover);
        
    }

    public JButton getBotao() {
        return botaoRemover;
    }
    
}
