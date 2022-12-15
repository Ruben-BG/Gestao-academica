package _07gestaoacademica;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class NotasDaTurmaCorRenderer extends DefaultTableCellRenderer {

    public NotasDaTurmaCorRenderer() {
        setHorizontalAlignment(JLabel.CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        JComponent jc = (JComponent) com;

        setBorder(noFocusBorder);

        if (!isSelected) {

            setBackground(Color.white);

            String valor = table.getValueAt(row, column).toString();
            Double valorConvetido = Double.valueOf(table.getValueAt(row, column).toString());

            if (!valor.isEmpty()) {

                if (valorConvetido < 7) {
                    setForeground(Color.RED);
                } else {
                    setForeground(new Color(19, 176, 110));
                }

            } else {
                setForeground(table.getForeground());
                setBackground(table.getBackground());
            }

        }

        return this;
    }

}
