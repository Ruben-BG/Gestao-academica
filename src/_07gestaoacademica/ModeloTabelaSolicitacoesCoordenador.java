package _07gestaoacademica;

import java.util.Date;
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
    
    public void pesquisarSolicitacoes(String disciplina, Date dataInicial, Date dataFinal, String nomeDoAluno, ListagemDeSolicitacoesCoordenador referenciaListagem) {
        
        if (disciplina.equals("") && dataInicial == null && dataFinal == null && nomeDoAluno.equals("")) {
            
            solicitacoes = BancoDeDados.retornarSolicitacoesPendentesDeAlunos();
            referenciaListagem.mensagemCasoPesquisaDeNulo();
            fireTableDataChanged();
            
        } else {
            
            solicitacoes = BancoDeDados.pesquisarSolicitacaoTelaCoordenador(disciplina, dataInicial, dataFinal, nomeDoAluno);
            
            if (solicitacoes.size() < 1) 
                referenciaListagem.mensagemCasoPesquisaDeErrado();
            else 
                referenciaListagem.mensagemCasoPesquisaDeNulo();
            
            fireTableDataChanged();
            
        }
        
    }
    
    public void rejeitarSolicitacao(int solicitacaoSelecionada) {
        
        BancoDeDados.editarStatusDeSolicitacao(solicitacoes.get(solicitacaoSelecionada), Status.REJEITADA);
        solicitacoes.remove(solicitacaoSelecionada);
        fireTableDataChanged();
        
    }
    
    public void aprovarSolicitacao(int solicitacaoSelecionada) {
        
        BancoDeDados.editarStatusDeSolicitacao(solicitacoes.get(solicitacaoSelecionada), Status.APROVADA);
        solicitacoes.remove(solicitacaoSelecionada);
        fireTableDataChanged();
        
    }
    
    public String pegaNomeAluno(int solicitacaoSelecionada) {
        
        return solicitacoes.get(solicitacaoSelecionada).getNomeAluno();
        
    }
    
}
