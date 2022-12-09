package _07gestaoacademica;

import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class LancarNotasCampoEditor extends AbstractCellEditor implements TableCellEditor{

    LancarNotasCampoPanel panel = new LancarNotasCampoPanel();
    private int coluna;
    
    @Override
    public Object getCellEditorValue() {
        return "";
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        
        panel.setBackground(table.getSelectionBackground());
        panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        panel.getCampoDeTexto().setText(value == null || value.equals("") ? "" : value.toString());
        coluna = column;
        return panel;
        
    }
    
    public String getValorNaCelula() {
        
        return panel.getCampoDeTexto().getText();
        
    }

    public int getColuna() {
        return coluna;
    }
    
}
