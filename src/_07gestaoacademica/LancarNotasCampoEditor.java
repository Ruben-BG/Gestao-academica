package _07gestaoacademica;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class LancarNotasCampoEditor extends AbstractCellEditor implements TableCellEditor{

    LancarNotasCampoPanel panel = new LancarNotasCampoPanel();
    
    
    public LancarNotasCampoEditor(JTablePersonalizada tabela, ModeloTabelaNotasListagemProfessor modeloDaTabela) {
        
        panel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                
                getValorNaCelula();
                tabela.setValueAt(getValorNaCelula(), tabela.getSelectedRow(), tabela.getSelectedColumn());
                modeloDaTabela.fireTableDataChanged();
                
            }
        });
        
    }
    
    
    @Override
    public Object getCellEditorValue() {
        return "";
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        
        panel.setBackground(table.getSelectionBackground());
        panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        panel.getCampoDeTexto().setText(value.toString());
        return panel;
        
    }
    
    public String getValorNaCelula() {
        
        return panel.getCampoDeTexto().getText();
        
    }
    
}
