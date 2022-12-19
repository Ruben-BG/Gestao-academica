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

        return switch (coluna) {
            case 0 ->
                false;
            case 1 ->
                false;
            case 2 ->
                true;
            case 3 ->
                true;
            case 4 ->
                true;
            case 5 ->
                true;
            case 6 ->
                false;
            default ->
                false;
        };

    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        AlunoNotas alunoNota = notas.get(linha);
        UsuarioAluno aluno = alunoNota.getAluno();

        return switch (coluna) {
            case 0 ->
                aluno.getMatricula();
            case 1 ->
                aluno.getNome();
            case 2 ->
                retornarNota(alunoNota, 1);
            case 3 ->
                retornarNota(alunoNota, 2);
            case 4 ->
                retornarNota(alunoNota, 3);
            case 5 ->
                retornarNota(alunoNota, 4);
            case 6 ->
                alunoNota.getMedia();
            default ->
                null;
        };

    }

    public Double retornarNota(AlunoNotas alunoSelecionado, int periodo) {

        Double notaPega = null;

        for (NotaPeriodo nota : alunoSelecionado.getNotas()) {

            if (nota.getPeriodo() == periodo) {
                notaPega = nota.getNota();
            }

        }

        return notaPega;

    }

    public void modificarValorDaNota(int linha, int coluna, Turma turmaEscolhida, String novoValor) {

        AlunoNotas alunoN = notas.get(linha);

        for (NotaPeriodo notaPega : alunoN.getNotas()) {

            if (notaPega.getPeriodo() == coluna - 1 && coluna > 1 && coluna < 6 && verificarSeNotaExiste(alunoN.getAluno(), coluna)) {
                notaPega.setNota(novoValor == null || novoValor.equals("") ? 0.0 : Double.parseDouble(novoValor));
            }

        }

        fireTableDataChanged();

    }

    public void atribuirNotaACampoVazio(int linha, int coluna, String valorDigitado) {

        if (!valorDigitado.equals("")) {

            String valor = valorDigitado;
            AlunoNotas alunoNota = notas.get(linha);
            UsuarioAluno aluno = alunoNota.getAluno();
            int periodo = coluna - 1;
            Boolean notaExiste = verificarSeNotaExiste(aluno, periodo);

            if (Double.parseDouble(valor) != 0.0 || !notaExiste) {

                Double notaAdicionada = valor.equals("") ? null : Double.valueOf(valor);

                if (notaAdicionada != null) {
                    NotaPeriodo novaNota = new NotaPeriodo();
                    novaNota.setNota(notaAdicionada);
                    novaNota.setPeriodo(periodo);

                    alunoNota.adicionarNota(novaNota);
                }

            }

        }

        fireTableDataChanged();

    }
    
    private Boolean verificarSeNotaExiste(UsuarioAluno alunoSelecionado, int periodoEscolhido) {
        
        Boolean notaExiste = false;
        Boolean validaAluno = false;
        Boolean validaPeriodo = false;
        
        for (AlunoNotas alunoNota : notas) {
            
            validaAluno = alunoNota.getAluno() == alunoSelecionado;
            
            for (NotaPeriodo nota : alunoNota.getNotas()) {
                
                validaPeriodo = nota.getPeriodo() == periodoEscolhido;
                
            }
            
            if (validaAluno && validaPeriodo) 
                notaExiste = true;
            
        }
        
        return notaExiste;
        
    }

    public List<AlunoNotas> retornarAlteracoesFeitas() {

        return notas;

    }

}
