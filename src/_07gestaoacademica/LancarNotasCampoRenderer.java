package _07gestaoacademica;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class LancarNotasCampoRenderer extends LancarNotasCampoPanel implements TableCellRenderer{

    public LancarNotasCampoRenderer() {
    
        super();
        setName("Table.cellRenderer");
        
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        setBackground(isSelected ? table.getSelectionBackground(): table.getBackground());
        getCampoDeTexto().setText(value.toString());
        return this;
        
    }
    
}
