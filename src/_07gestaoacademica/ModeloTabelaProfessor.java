package _07gestaoacademica;

import javax.swing.table.AbstractTableModel;

public class ModeloTabelaProfessor extends AbstractTableModel{

    String[] coluna = {"Nome", "Turmas", "Ações"};
    
    @Override
    public int getRowCount() {
        return BancoDeDados.quantidadeProfessor();
    }

    @Override
    public int getColumnCount() {
        return coluna.length;
    }

    @Override
    public String getColumnName(int column) {
        return coluna[column];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna) {
            case 0: return BancoDeDados.retornarProfessores().get(linha).getNome();
            case 1: return BancoDeDados.retornarProfessores().get(linha).retornaQuantidadeDeTurma();
        }
        
        return null;
        
    }
    
}
