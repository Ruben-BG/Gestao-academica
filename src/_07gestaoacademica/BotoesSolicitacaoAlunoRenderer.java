package _07gestaoacademica;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class BotoesSolicitacaoAlunoRenderer implements TableCellRenderer {

    private final BotoesSolicitacaoAlunoPanel panel = new BotoesSolicitacaoAlunoPanel();

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        panel.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
        panel.updateButtons(value);
        return panel;
    }

}
