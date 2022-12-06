package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaNotasListagemProfessor extends AbstractTableModel {

    private List<UsuarioAluno> alunos = new ArrayList<>();
    private String[] colunas = {"Matrícula", "Nome", "1º P", "2º P", "3º P", "4º P", "Média"};
    
    
    public ModeloTabelaNotasListagemProfessor(Turma turmaDosAlunos) {
        
        alunos = turmaDosAlunos.getAlunosMatriculados();
        
    }
    
    @Override
    public int getRowCount() {
        return alunos.size();
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
        
        switch (coluna) {
            
            case 0: return false;
            case 1: return false;
            case 2: return true;
            case 3: return true;
            case 4: return true;
            case 5: return true;
            case 6: return false;
            
            default: return false;
            
        }
        
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        UsuarioAluno aluno = alunos.get(linha);
        
        switch (coluna) {
            
            case 0: return aluno.getMatricula();
            case 1: return aluno.getNome();
            case 2: return null;
            case 3: return null;
            case 4: return null;
            case 5: return null;
            case 6: return null;
            
            default: return null;
            
        }
        
    }
    
}
