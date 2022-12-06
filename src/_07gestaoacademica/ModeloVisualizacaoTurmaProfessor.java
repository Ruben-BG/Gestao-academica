package _07gestaoacademica;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloVisualizacaoTurmaProfessor extends AbstractTableModel {
    
    List<UsuarioAluno> alunosNaTurma;
    String[] colunas = {"Matrícula", "Nome", "Telefone", "Email", "Média"};
    
    public ModeloVisualizacaoTurmaProfessor(Turma turmaSelecionada) {
        
        alunosNaTurma = BancoDeDados.retornarAlunosDaTurma(turmaSelecionada);
        
    }

    @Override
    public int getRowCount() {
        return alunosNaTurma.size();
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
    public Object getValueAt(int linha, int coluna) {
        
        UsuarioAluno aluno = alunosNaTurma.get(linha);
        
        switch (coluna) {
            
            case 0: return aluno.getMatricula();
            case 1: return aluno.getNome();
            case 2: return aluno.getTelefone();
            case 3: return aluno.getEmail();
            case 4: return null;
            default: return null;
            
        }
        
    }
    
}
