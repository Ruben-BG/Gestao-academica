package _07gestaoacademica;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class BotoesEditor extends AbstractCellEditor implements TableCellEditor {

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
                EventQueue.invokeLater(BotoesEditor.this::fireEditingStopped);
            }
        }

    public BotoesEditor(JTable tabela, ListagemProfessor referenciaForm, ModeloTabelaProfessor referenciaModel) {

        super();
        this.tabela = tabela;
        List<JButton> lista =  botoesPanel.getButtons();

        lista.get(0).addActionListener(e -> {
            //Ação do botão editar na tabela
        });

        lista.get(1).addActionListener(e -> {
            //Ação do botão excluir na tabela
            
            ConfirmacaoPopUp popUp = new ConfirmacaoPopUp();
            popUp.setVisible(true);
            popUp.confirmacaoParaRemoverLinha("Você deseja remover o professor " + BancoDeDados.retornarProfessores().get(tabela.getSelectedRow()).getNome() + "?", referenciaModel, tabela.getSelectedRow());
        
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