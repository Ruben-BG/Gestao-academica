package _07gestaoacademica;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaSolicitacoesAluno extends AbstractTableModel{

    List<TurmaSolicitacaoDeAluno> solicitacoes = BancoDeDados.retornarSolicitacoesDeUmAluno((UsuarioAluno)BancoDeDados.pegaUsuario());
    String[] colunas = {"Disciplina", "Data", "Status", "Ações"};
    
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
        switch (coluna) {
            case 0: return solicitacoes.get(linha).getTurma().getDisciplina();
            case 1: return solicitacoes.get(linha).getDataDeSolicitacaoFormatada();
            case 2: return solicitacoes.get(linha).getStatusDeAprovacao();
            case 3: return null;
            default: return null;
        }
    }
    
    public void pesquisarSolicitacoes(String disciplina, String dataInicio, String dataFinal, String status) {
        
    }
    
}
