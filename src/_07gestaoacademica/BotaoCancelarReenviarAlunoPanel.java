package _07gestaoacademica;

import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotaoCancelarReenviarAlunoPanel extends JPanel {

    List<JButton> botoes = new ArrayList<>();

    public BotaoCancelarReenviarAlunoPanel() {

        super();
        setOpaque(true);
        botoes.add(new JButton("Cancelar"));
        botoes.add(new JButton("Reenviar"));

        for (JButton b : botoes) {

            b.setFocusable(false);
            b.setRolloverEnabled(false);

            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
            b.setForeground(Color.WHITE);

            if (b.getText().equals("Cancelar")) {
                b.setBackground(new Color(212, 67, 81));
            } else {
                b.setBackground(new Color(76, 95, 99));
            }

            add(b);

        }

    }

    public List<JButton> getBotoes() {
        return botoes;
    }

}
