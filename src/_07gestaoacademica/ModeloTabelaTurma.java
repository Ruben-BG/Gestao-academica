package _07gestaoacademica;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModeloTabelaTurma extends AbstractTableModel {

    //Atributos
    List<Turma> turmas = BancoDeDados.retornarTurmas();
    String[] coluna = {"Código", "Disciplina", "Professor", "Ações"};

    @Override
    public int getRowCount() {
        return turmas.size();
    }

    @Override
    public int getColumnCount() {
        return coluna.length;
    }

    @Override
    public String getColumnName(int numeroColuna) {
        return coluna[numeroColuna];
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch (coluna) {
            
            case 0: return turmas.get(linha).getCodigo();
            case 1: return turmas.get(linha).getDisciplina();
            case 2: return turmas.get(linha).getProfessor().getNome();
            case 3: break;
            
        }
        
        return null;
        
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return coluna == 3;
    }
    
    public void removeLinha(int linha) {
        
        BancoDeDados.excluirTurmaDaLista(linha);
        fireTableRowsDeleted(linha, linha);
        
    }
    
    public void pesquisarTurma(String codigoTurma, String disciplinaTurma, String professorDaTurma, JTablePersonalizada tabela, ListagemDeTurma referenciaListagemDeTurma) {
        
        if(codigoTurma.equals("") && disciplinaTurma.equals("") && professorDaTurma.equals("")) {
            turmas = BancoDeDados.retornarTurmas();
            referenciaListagemDeTurma.casoDePesquisaNula();
            tabela.setVisible(true);
            fireTableDataChanged();
        } else {
            
            turmas = BancoDeDados.pesquisaTurma(codigoTurma, disciplinaTurma, professorDaTurma);
            
            if(turmas.size() < 1) {
                tabela.setVisible(false);
                referenciaListagemDeTurma.mensagemCasoPesquisaDeErrado();
            } else {
                tabela.setVisible(true);
                referenciaListagemDeTurma.casoDePesquisaNula();
            }
            
            fireTableDataChanged();
            
        }
        
    }

}
