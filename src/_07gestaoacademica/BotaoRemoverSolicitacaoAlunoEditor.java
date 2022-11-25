
package _07gestaoacademica;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractCellEditor;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class BotaoRemoverSolicitacaoAlunoEditor extends AbstractCellEditor implements TableCellEditor {

    private final BotaoRemoverSolicitacaoAlunoPanel botaoPanel = new BotaoRemoverSolicitacaoAlunoPanel();
    private JTable tabela;
    
            class EditandoManipuladorDeParada extends MouseAdapter implements ActionListener {
            protected JTable tabela;
            protected BotoesPanel referenciaBotoesPanel = new BotoesPanel();

            @Override
            public void mouseClicked(MouseEvent e) {
                Object o = e.getSource();
                if(o instanceof TableCellEditor) {
                    actionPerformed(new ActionEvent(o, ActionEvent.ACTION_PERFORMED, ""));
                } else if(o instanceof JButton) {
                    ButtonModel m = ((JButton) e.getComponent()).getModel();
                    if(m.isPressed() && e.isControlDown()){
                        botaoPanel.setBackground(tabela.getBackground());
                    }
                }
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(BotaoRemoverSolicitacaoAlunoEditor.this::fireEditingStopped);
            }
        }
            
    public BotaoRemoverSolicitacaoAlunoEditor() {
        
        super();
        JButton botao = botaoPanel.getBotao();
        
        botao.addActionListener((e) -> {
            //Ação do botão
            
            
        });

        BotaoRemoverSolicitacaoAlunoEditor.EditandoManipuladorDeParada manipulador = new BotaoRemoverSolicitacaoAlunoEditor.EditandoManipuladorDeParada();
        botao.addMouseListener(manipulador);
        botao.addActionListener(manipulador);

        botaoPanel.addMouseListener(manipulador);
        
    }
            
    @Override
    public Object getCellEditorValue() {
        return "";
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        botaoPanel.setBackground(table.getBackground());
        return botaoPanel;
    }
    
}
