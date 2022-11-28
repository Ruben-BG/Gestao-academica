package _07gestaoacademica;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class BotoesSolicitacoesCoordenadorRenderer extends BotoesSolicitacoesCoordenadorPanel implements TableCellRenderer {

    public BotoesSolicitacoesCoordenadorRenderer() {
        super();
        setName("Table.cellRenderer");
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        setBackground(isSelected ? table.getSelectionBackground(): table.getBackground());

        return this;

    }
    
}
