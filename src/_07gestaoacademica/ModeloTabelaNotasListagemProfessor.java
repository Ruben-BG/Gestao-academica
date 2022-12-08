package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaNotasListagemProfessor extends AbstractTableModel {

    private List<UsuarioAluno> alunos = new ArrayList<>();
    private List<NotaDeAluno> notas = new ArrayList<>();
    private String[] colunas = {"Matrícula", "Nome", "1º P", "2º P", "3º P", "4º P", "Média"};
    private Turma turma;

    public ModeloTabelaNotasListagemProfessor(Turma turmaDosAlunos) {

        alunos = turmaDosAlunos.getAlunosMatriculados();
        turma = turmaDosAlunos;

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

            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return false;

            default:
                return false;

        }

    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        UsuarioAluno aluno = alunos.get(linha);
        notas = BancoDeDados.retornarNotasDosAlunos(aluno, turma);

        switch (coluna) {

            case 0:
                return aluno.getMatricula();
            case 1:
                return aluno.getNome();
            case 2:
                return retornarNota(aluno, turma, 1);
            case 3:
                return retornarNota(aluno, turma, 2);
            case 4:
                return retornarNota(aluno, turma, 3);
            case 5:
                return retornarNota(aluno, turma, 4);
            case 6:
                return null;

            default:
                return null;

        }

    }

    public Double retornarNota(UsuarioAluno aluno, Turma turma, int periodo) {

        Double notaPega = null;

        for (NotaDeAluno nota : notas) {

            if (nota.getTurma().equals(turma) && nota.getAluno().equals(aluno) && periodo == nota.getPeriodo()) {
                notaPega = nota.getNota();
            }

        }

        return notaPega;

    }

    public void modificarValorDaNota(int linha, int coluna, Turma turmaEscolhida, String novoValor) {

        NotaDeAluno nota = new NotaDeAluno();
        
        for (NotaDeAluno notaPega : notas) {
            
            Boolean validaAluno = notaPega.getTurma().equals(turma) && notaPega.getAluno().equals(alunos.get(linha));
            
            if (validaAluno && notaPega.getPeriodo() == 1 && coluna == 2)
                notaPega.setNovaNota(Double.valueOf(novoValor));
            else if (validaAluno && notaPega.getPeriodo() == 2 && coluna == 3)
                notaPega.setNovaNota(Double.valueOf(novoValor));
            else if (validaAluno && notaPega.getPeriodo() == 3 && coluna == 4)
                notaPega.setNovaNota(Double.valueOf(novoValor));
            else if (validaAluno && notaPega.getPeriodo() == 4 && coluna == 5)
                notaPega.setNovaNota(Double.valueOf(novoValor));
            
        }
        
        //nota.setNovaNota(Double.valueOf(novoValor));

        fireTableDataChanged();

    }

}
