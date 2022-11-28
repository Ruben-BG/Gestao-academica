package _07gestaoacademica;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaSolicitacoesCoordenador extends AbstractTableModel {

    List<TurmaSolicitacaoDeAluno> solicitacoes = BancoDeDados.retornarSolicitacoesPendentesDeAlunos();
    String[] colunas = {"Disciplina", "Data", "Aluno", "Ações"};
    
    @Override
    public int getRowCount() {
        return solicitacoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return coluna == 3;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        TurmaSolicitacaoDeAluno solicitacao = solicitacoes.get(linha);
        
        switch(coluna) {
            case 0: return solicitacao.getDisciplinaDaTurma();
            case 1: return solicitacao.getDataDeSolicitacaoFormatada();
            case 2: return solicitacao.getNomeAluno();
            case 3: return null;
            default: return null;
        }
        
    }
    
    public void rejeitarSolicitacao(int solicitacaoSelecionada) {
        
        solicitacoes.remove(solicitacaoSelecionada);
        BancoDeDados.retornarSolicitacoesPendentesDeAlunos().get(solicitacaoSelecionada).adicionarStatus(Status.REJEITADA);
        fireTableDataChanged();
        
    }
    
}
