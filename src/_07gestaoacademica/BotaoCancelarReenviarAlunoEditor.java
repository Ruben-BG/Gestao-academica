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

public class BotaoCancelarReenviarAlunoEditor extends AbstractCellEditor implements TableCellEditor {

    protected final BotaoCancelarReenviarAlunoPanel botoesPanel = new BotaoCancelarReenviarAlunoPanel();
    private JTable tabela;

    class EditandoManipuladorDeParada extends MouseAdapter implements ActionListener {

        protected JTable tabela;
        protected BotoesPanel referenciaBotoesPanel = new BotoesPanel();

        @Override
        public void mouseClicked(MouseEvent e) {
            Object o = e.getSource();
            if (o instanceof TableCellEditor) {
                actionPerformed(new ActionEvent(o, ActionEvent.ACTION_PERFORMED, ""));
            } else if (o instanceof JButton) {
                ButtonModel m = ((JButton) e.getComponent()).getModel();
                if (m.isPressed() && e.isControlDown()) {
                    botoesPanel.setBackground(tabela.getBackground());
                }
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            EventQueue.invokeLater(BotaoCancelarReenviarAlunoEditor.this::fireEditingStopped);
        }
    }

    public BotaoCancelarReenviarAlunoEditor(JTablePersonalizada tabela, ModeloTabelaSolicitacoesAluno modeloDaTabela) {

        this.tabela = tabela;
        List<JButton> lista = botoesPanel.getBotoes();

        lista.get(0).addActionListener((e) -> {
            //Ação do botão cancelar na tabela

            modeloDaTabela.cancelarSolicitacao(tabela);

        });

        lista.get(1).addActionListener((e) -> {
            //Ação do botão reenviar da tabela

            TurmaSolicitacaoDeAluno solicitar = new TurmaSolicitacaoDeAluno();
            solicitar.setAluno((UsuarioAluno) BancoDeDados.pegaUsuario());

            //Analisar a turma pega.
            TurmaSolicitacaoDeAluno solicitacaoDoAluno = BancoDeDados.retornarSolicitacoesDeUmAluno((UsuarioAluno) BancoDeDados.pegaUsuario()).get(tabela.getSelectedRow());

            for (Turma turma : BancoDeDados.retornarTurmas()) {

                if (turma.getDisciplina().equals(solicitacaoDoAluno.getTurma().getDisciplina())) {
                    solicitar.setTurma(turma);
                }

            }

            solicitar.adicionarStatus(Status.PENDENTE);
            solicitar.adicionarDataAtual();

            BancoDeDados.enviarSolicitacao(solicitar);
            PopUp p = new PopUp();
            p.mensagemFinalNovoProfessor("Solicitação feita com sucesso!");
            
            modeloDaTabela.fireTableDataChanged();

        });

        BotaoCancelarReenviarAlunoEditor.EditandoManipuladorDeParada manipulador = new BotaoCancelarReenviarAlunoEditor.EditandoManipuladorDeParada();
        for (JButton b : lista) {
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
