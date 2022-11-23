package _07gestaoacademica;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.AbstractCellEditor;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class BotaoListagemSolicitacaoAlunoEditor extends AbstractCellEditor implements TableCellEditor{
    
    protected final BotaoListagemSolicitacaoAlunoPanel botoesPanel = new BotaoListagemSolicitacaoAlunoPanel(true, true, false);
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
                        botoesPanel.setBackground(tabela.getBackground());
                    }
                }
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(BotaoListagemSolicitacaoAlunoEditor.this::fireEditingStopped);
            }
        }
    
    public BotaoListagemSolicitacaoAlunoEditor(JTablePersonalizada tabela) {
        
        this.tabela = tabela;
        List<JButton> lista = botoesPanel.getBotoes();
        
        lista.get(0).addActionListener((e) -> {
            //Ação do botão cancelar na tabela
            
        });
        
        lista.get(1).addActionListener((e) -> {
            //Ação dos botões azuis da tabela
            
        });
        
        
        BotaoListagemSolicitacaoAlunoEditor.EditandoManipuladorDeParada manipulador = new BotaoListagemSolicitacaoAlunoEditor.EditandoManipuladorDeParada();
        for(JButton b : lista) {
            b.addMouseListener(manipulador);
            b.addActionListener(manipulador);
        }

        botoesPanel.addMouseListener(manipulador);
        
    }

    @Override
    public Object getCellEditorValue() {
        return "";
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        botoesPanel.setBackground(table.getBackground());
        return botoesPanel;
    }
    
}
