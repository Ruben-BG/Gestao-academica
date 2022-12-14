package _07gestaoacademica;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class BotoesSolicitacaoAlunoEditor extends AbstractCellEditor implements TableCellEditor {

    private final BotoesSolicitacaoAlunoPanel botoesPanel = new BotoesSolicitacaoAlunoPanel();
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
                EventQueue.invokeLater(BotoesSolicitacaoAlunoEditor.this::fireEditingStopped);
            }
        }
    
    public BotoesSolicitacaoAlunoEditor(JTablePersonalizada tabela, ModeloTabelaSolicitacoesAluno modeloTabela) {
        
        super();
        this.tabela = tabela;
        List<JButton> lista =  botoesPanel.getButtons();

        lista.get(0).addActionListener(e -> {
            //Ação do botão cancelar na tabela
            
            ConfirmacaoPopUp p = new ConfirmacaoPopUp();
            p.confirmacaoCancelarOuRemoverSolicitacao("Deseja cancelar sua solicitação?", tabela, modeloTabela);
            p.setVisible(true);
            
        });

        lista.get(1).addActionListener(e -> {
            //Ação do botão reenviar na tabela
            
            ConfirmacaoPopUp p = new ConfirmacaoPopUp();
            p.confirmacaoReenviarSolicitacaoAluno(tabela, modeloTabela);
            p.setVisible(true);
            
        });
        
        lista.get(2).addActionListener((e) -> {
            //Ação do botão remover na tabela
            
            ConfirmacaoPopUp p = new ConfirmacaoPopUp();
            p.confirmacaoCancelarOuRemoverSolicitacao("Deseja remover sua solicitação?", tabela, modeloTabela);
            p.setVisible(true);
            
        });

        BotoesSolicitacaoAlunoEditor.EditandoManipuladorDeParada manipulador = new BotoesSolicitacaoAlunoEditor.EditandoManipuladorDeParada();
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
        //Durante edição este método faz alteração da célula quando focada
        
        botoesPanel.setBackground(table.getSelectionBackground());
        botoesPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        botoesPanel.updateButtons(value);
        
        return botoesPanel;
    }
    
}
