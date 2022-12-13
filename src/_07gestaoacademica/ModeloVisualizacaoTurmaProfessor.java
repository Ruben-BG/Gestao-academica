package _07gestaoacademica;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloVisualizacaoTurmaProfessor extends AbstractTableModel {
    
    Turma turma;
    List<UsuarioAluno> alunosNaTurma;
    String[] colunas = {"Matrícula", "Nome", "Telefone", "Email", "Média"};
    
    public ModeloVisualizacaoTurmaProfessor(Turma turmaSelecionada) {
        
        alunosNaTurma = BancoDeDados.retornarAlunosDaTurma(turmaSelecionada);
        turma = turmaSelecionada;
        
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
        
        return switch (coluna) {
            case 0 -> aluno.getMatricula();
            case 1 -> aluno.getNome();
            case 2 -> aluno.getTelefone();
            case 3 -> aluno.getEmail();
            case 4 -> BancoDeDados.retornarMediaDoAlunoNaTurma(aluno, turma);
            default -> null;
        };
        
    }
    
}
