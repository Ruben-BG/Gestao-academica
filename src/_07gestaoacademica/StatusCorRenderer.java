package _07gestaoacademica;

import java.awt.Color;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class StatusCorRenderer extends DefaultTableCellRenderer {
    
    private int colunaN = 0;
    
    public StatusCorRenderer(int coluna) {
        colunaN = coluna;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        JComponent jc = (JComponent) com;
        
        setBorder(noFocusBorder);
        
        if (!isSelected) {
            
            if (table.getValueAt(row, colunaN) != null) {
                
                String valor = table.getValueAt(row, colunaN).toString();
                
                if (!valor.isEmpty()) {
                    
                    if ((Pattern.compile(Status.PENDENTE.valorDoStatus).matcher(valor).find())) {
                        setForeground(new Color(237, 165, 60));
                    } else if ((Pattern.compile(Status.APROVADA.valorDoStatus).matcher(valor).find())) {
                        setForeground(new Color(19, 176, 110));
                    } else {
                        setForeground(Color.red);
                    }
                    
                } else {
                    setBackground(table.getBackground());
                    setForeground(table.getForeground());
                }
                
            }
            
        }
        
        return this;
    }
    
}
