package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaNotasListagemProfessor extends AbstractTableModel {

    private Turma turma;
    private List<AlunoNotas> notas = new ArrayList<>();
    
    private String[] colunas = {"Matrícula", "Nome", "1º P", "2º P", "3º P", "4º P", "Média"};

    public ModeloTabelaNotasListagemProfessor(Turma turmaDosAlunos) {

        turma = turmaDosAlunos;
        notas = BancoDeDados.retornarNotas(turmaDosAlunos);

    }

    @Override
    public int getRowCount() {
        return notas.size();
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

        AlunoNotas alunoNota = notas.get(linha);
        UsuarioAluno aluno = alunoNota.aluno;

        switch (coluna) {

            case 0:
                return aluno.getMatricula();
            case 1:
                return aluno.getNome();
            case 2:
                return retornarNota(alunoNota, 1);
            case 3:
                return retornarNota(alunoNota, 2);
            case 4:
                return retornarNota(alunoNota, 3);
            case 5:
                return retornarNota(alunoNota, 4);
            case 6:
                return alunoNota.getMedia();

            default:
                return null;

        }

    }

    public Double retornarNota(AlunoNotas alunoSelecionado, int periodo) {

        Double notaPega = null;

        for (NotaPeriodo nota : alunoSelecionado.notas) {
            
            if (nota.periodo == periodo)
                notaPega = nota.nota;
            
        }

        return notaPega;

    }

    public void modificarValorDaNota(int linha, int coluna, Turma turmaEscolhida, String novoValor) {

        AlunoNotas alunoN = notas.get(linha);
        
        for (NotaPeriodo notaPega : alunoN.notas) {
            
            if (notaPega.periodo == coluna - 1) {
                notaPega.nota = Double.valueOf(novoValor);
            }
            
            /*Boolean validaAluno = notaPega.getTurma().equals(turma) && notaPega.getAluno().equals(alunos.get(linha));
            
            if (validaAluno && notaPega.getPeriodo() == 1 && coluna == 2)
                notaPega.setNovaNota(Double.valueOf(novoValor));
            else if (validaAluno && notaPega.getPeriodo() == 2 && coluna == 3)
                notaPega.setNovaNota(Double.valueOf(novoValor));
            else if (validaAluno && notaPega.getPeriodo() == 3 && coluna == 4)
                notaPega.setNovaNota(Double.valueOf(novoValor));
            else if (validaAluno && notaPega.getPeriodo() == 4 && coluna == 5)
                notaPega.setNovaNota(Double.valueOf(novoValor));*/
            
        }
        
        //nota.setNovaNota(Double.valueOf(novoValor));

        fireTableDataChanged();

    }

}
