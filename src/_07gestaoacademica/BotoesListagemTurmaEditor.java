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

public class BotoesListagemTurmaEditor extends AbstractCellEditor implements TableCellEditor {
    
    protected final BotoesPanel botoesPanel = new BotoesPanel();
    protected JTable tabela;

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
                EventQueue.invokeLater(BotoesListagemTurmaEditor.this::fireEditingStopped);
            }
        }

    public BotoesListagemTurmaEditor(JTablePersonalizada tabela, ListagemDeTurma referenciaForm, ModeloTabelaTurma referenciaModel) {

        super();
        this.tabela = tabela;
        List<JButton> lista =  botoesPanel.getButtons();

        lista.get(0).addActionListener(e -> {
            //Ação do botão editar na tabela
            
            CadastroNovaTurma cadastroNovaTurma = new CadastroNovaTurma(tabela);
            cadastroNovaTurma.mudarTituloDaPagina(false, tabela);
            cadastroNovaTurma.setVisible(true);
            referenciaForm.dispose();
            
        });

        lista.get(1).addActionListener(e -> {
            //Ação do botão excluir na tabela
            
            ConfirmacaoPopUp popUp = new ConfirmacaoPopUp();
            popUp.setVisible(true);
            popUp.confirmacaoParaRemoverLinhaDaTabelaTurma("Remover a turma " + BancoDeDados.retornarTurmas().get(tabela.getSelectedRow()).getCodigo() + "?", referenciaModel, tabela.getSelectedRow());
            
        });

        EditandoManipuladorDeParada manipulador = new EditandoManipuladorDeParada();
        for(JButton b : lista) {
            b.addMouseListener(manipulador);
            b.addActionListener(manipulador);
        }

        botoesPanel.addMouseListener(manipulador);

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        botoesPanel.setBackground(table.getBackground());
        return botoesPanel;
    }

    @Override
    public Object getCellEditorValue() {
        return "";
    }
    
}
