package _07gestaoacademica;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaAluno extends AbstractTableModel {

    List<UsuarioAluno> alunos = BancoDeDados.retornarAlunos();
    private String[] colunas = {"Nome", "Turmas", "Ações"};
    
    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int c) {
        return colunas[c];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna) {
            case 0: return alunos.get(linha).getNome();
            case 1: return alunos.get(linha).getTurmasOndeAlunoEsta().size();
            case 2: break;
        }
        
        return null;
        
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return coluna == 2;
    }
    
    public void removeLinha(int linha) {
        
        BancoDeDados.excluirAlunoDaLista(linha);
        alunos.remove(linha);
        fireTableDataChanged();
        
    }
    
}
