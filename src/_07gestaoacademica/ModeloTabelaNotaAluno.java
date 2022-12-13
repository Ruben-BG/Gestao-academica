package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaNotaAluno extends AbstractTableModel{
    
    private Turma turma;
    private String[] colunas = {"Período", "Nota"};
    private List<NotaPeriodo> notas = new ArrayList<>();
    
    public ModeloTabelaNotaAluno(ModeloTabelaTurmaAluno referenciaOutroModelo, int linha) {

        turma = referenciaOutroModelo.getTurmaSelecionada(linha);
        notas = BancoDeDados.retornarNotaDeAlunoEspecifico((UsuarioAluno) BancoDeDados.pegaUsuario(), turma);
        
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
    public Object getValueAt(int linha, int coluna) {
        
        UsuarioAluno aluno = (UsuarioAluno) BancoDeDados.pegaUsuario();
        
        return switch (coluna) {
            case 0 -> ++linha + "°";
            case 1 -> notas.get(linha).getNota();
            default -> null;
        };
        
    }
    
    public String getMediaDoAluno() {
        
        if (BancoDeDados.retornarMediaDoAlunoNaTurma((UsuarioAluno) BancoDeDados.pegaUsuario(), turma) != null)
            return BancoDeDados.retornarMediaDoAlunoNaTurma((UsuarioAluno) BancoDeDados.pegaUsuario(), turma);
        else
            return null;
        
    }
    
}
