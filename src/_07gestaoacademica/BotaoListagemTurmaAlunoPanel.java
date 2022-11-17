package _07gestaoacademica;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotaoListagemTurmaAlunoPanel extends JPanel {

    JButton botaoNotas;
    
    public BotaoListagemTurmaAlunoPanel() {

        super();
        setOpaque(true);
        botaoNotas = new JButton("Ver notas");

        botaoNotas.setFocusable(false);
        botaoNotas.setRolloverEnabled(false);

        botaoNotas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botaoNotas.setForeground(Color.WHITE);

        botaoNotas.setBackground(new Color(76, 95, 99));

        add(botaoNotas);

    }
    
    public JButton getBotao() {
        return botaoNotas;
    }

}
