package _07gestaoacademica;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotoesSolicitacaoAlunoPanel extends JPanel{

    public final List<JButton> buttons = new ArrayList<>();

    public BotoesSolicitacaoAlunoPanel() {
        
        super(new FlowLayout(FlowLayout.LEFT));
        setOpaque(true);
        
        for (AcoesBotoesSolicitacaoAluno a : AcoesBotoesSolicitacaoAluno.values()) {
            
            JButton b = new JButton(a.toString());
            b.setFocusable(false);
            b.setRolloverEnabled(false);
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
            b.setForeground(Color.WHITE);
            
            switch (a) {
                case CANCELAR -> {
                    b.setText(AcoesBotoesSolicitacaoAluno.CANCELAR.valorOpcoesENum);
                    b.setBackground(new Color(212, 67, 81));
                }
                case REENVIAR -> {
                    b.setText(AcoesBotoesSolicitacaoAluno.REENVIAR.valorOpcoesENum);
                    b.setBackground(new Color(76, 95, 99));
                }
                default -> {
                    b.setText(AcoesBotoesSolicitacaoAluno.REMOVER.valorOpcoesENum);
                    b.setBackground(new Color(76, 95, 99));
                }
            }
            
            add(b);
            buttons.add(b);
            
        }
        
    }

    protected void updateButtons(Object value) {
        if (value instanceof EnumSet) {
            EnumSet ea = (EnumSet) value;
            removeAll();
            if (ea.contains(AcoesBotoesSolicitacaoAluno.CANCELAR)) {
                add(buttons.get(0));
            }
            if (ea.contains(AcoesBotoesSolicitacaoAluno.REENVIAR)) {
                add(buttons.get(1));
            }
            if (ea.contains(AcoesBotoesSolicitacaoAluno.REMOVER)) {
                add(buttons.get(2));
            }
        }
    }

    public List<JButton> getButtons() {
        return buttons;
    }
    
}
