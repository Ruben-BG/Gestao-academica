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

public class BotoesListagemAlunoEditor extends AbstractCellEditor implements TableCellEditor {
    
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
                EventQueue.invokeLater(BotoesListagemAlunoEditor.this::fireEditingStopped);
            }
        }

    public BotoesListagemAlunoEditor(JTablePersonalizada tabela, ListagemDeAluno referenciaForm, ModeloTabelaAluno referenciaModel) {

        super();
        this.tabela = tabela;
        List<JButton> lista =  botoesPanel.getButtons();

        lista.get(0).addActionListener(e -> {
            //Ação do botão editar na tabela
            
            CadastroEdicaoDeAluno telaDeEdicao = new CadastroEdicaoDeAluno(tabela);
            telaDeEdicao.mudarFuncaoDaJanela(false, tabela);
            telaDeEdicao.setVisible(true);
            referenciaForm.dispose();
            
        });

        lista.get(1).addActionListener(e -> {
            //Ação do botão excluir na tabela
            
            ConfirmacaoPopUp popUp = new ConfirmacaoPopUp();
            popUp.setVisible(true);
            UsuarioAluno alunoSelecionado = BancoDeDados.retornarAlunos().get(tabela.getSelectedRow());
            
            if(alunoSelecionado.getTurmasOndeAlunoEsta().size() < 1) {
                popUp.confirmacaoRemoverLinhaTabelaAluno("Você deseja remover o aluno " + alunoSelecionado.getNome() + "?", referenciaModel, tabela.getSelectedRow());
            } else {
                popUp.confirmacaoRemoverLinhaTabelaAluno(alunoSelecionado.getNome() + " está em " + alunoSelecionado.getTurmasOndeAlunoEsta().size() + " turma(s), deseja excluí-lo?", referenciaModel, tabela.getSelectedRow());
            }
            
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
        botoesPanel.setBackground(table.getSelectionBackground());
        botoesPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        return botoesPanel;
    }

    @Override
    public Object getCellEditorValue() {
        return "";
    }
    
}
