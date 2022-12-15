package _07gestaoacademica;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class JTablePersonalizadaLancarNota extends JTable{
    
    public JTablePersonalizadaLancarNota() {
        
        getTableHeader().setDefaultRenderer(new JTablePersonalizadaHeader());
        getTableHeader().setPreferredSize(new Dimension(0, 40));
        getTableHeader().setResizingAllowed(false);
        getTableHeader().setReorderingAllowed(false);
        setDefaultRenderer(Object.class, new JTablePersonalizadaCell());
        setRowHeight(36);
        setShowHorizontalLines(true);
        
    }
    
    private class JTablePersonalizadaHeader extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            com.setBackground(new Color(255,255,255));
            com.setFont(new java.awt.Font("Verdana", 0, 11));
            setHorizontalAlignment(JLabel.CENTER);
            return com;
        }

        }
        
    private class JTablePersonalizadaCell extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            
            if(getSelectedRow() == row && getSelectedColumn() == column) {
                setBackground(new Color(19,176,110));
                setForeground(Color.white);
            } else {
                setBackground(Color.WHITE);
                setForeground(table.getForeground());
            }
            
            setBorder(noFocusBorder);
            setHorizontalAlignment(JLabel.CENTER);
            return com;
        }
        
    }
    
}
