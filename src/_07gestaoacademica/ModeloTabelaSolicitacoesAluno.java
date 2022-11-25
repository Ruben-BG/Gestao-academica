package _07gestaoacademica;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

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
    
    public void pesquisarSolicitacoes(ListagemDeSolicitacoesMatriculaAluno referenciaTelaListagem, String disciplinaDigitada, Date dataInicial, Date dataFinal, String statusSelecionado) {
        
        if (disciplinaDigitada.equals("") && dataInicial == null && dataFinal == null && statusSelecionado.equals("")) {
            
            solicitacoes = BancoDeDados.retornarSolicitacoesDeUmAluno((UsuarioAluno)BancoDeDados.pegaUsuario());
            referenciaTelaListagem.mensagemCasoPesquisaDeNulo();
            fireTableDataChanged();
            
        } else {
            
            solicitacoes = BancoDeDados.pesquisarSolicitacaoAluno(disciplinaDigitada, dataInicial, dataFinal, statusSelecionado);
            
            if (solicitacoes.size() < 1)
                referenciaTelaListagem.mensagemCasoPesquisaDeErrado();
            else
                referenciaTelaListagem.mensagemCasoPesquisaDeNulo();
            
            fireTableDataChanged();
            
        }
        
    }
    
    public void definirBotoesParaCadaStatus(JTablePersonalizada tabelaReferencia) {
        
        TableColumn colunaDosBotoes = tabelaReferencia.getColumnModel().getColumn(3);
        
        for(TurmaSolicitacaoDeAluno solicitacao : solicitacoes) {
            
            if (solicitacao.getStatusDeAprovacao().equals("Pendente")) {
                
                colunaDosBotoes.setCellRenderer(new BotaoCancelarAlunoRenderer());
                colunaDosBotoes.setCellEditor(new BotaoCancelarAlunoEditor());
                
            } else if (solicitacao.getStatusDeAprovacao().equals("Aprovada")) {
                
                colunaDosBotoes.setCellRenderer(new BotaoRemoverSolicitacaoAlunoRenderer());
                colunaDosBotoes.setCellEditor(new BotaoRemoverSolicitacaoAlunoEditor());
                
            } else {
                
                colunaDosBotoes.setCellRenderer(new BotaoCancelarReenviarAlunoRenderer());
                colunaDosBotoes.setCellEditor(new BotaoCancelarReenviarAlunoEditor(tabelaReferencia));
                
            }
            
        }
        
    }
    
}
