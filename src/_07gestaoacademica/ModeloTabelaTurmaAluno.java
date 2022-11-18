package _07gestaoacademica;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaTurmaAluno extends AbstractTableModel{
    
    List<Turma> turmas = ((UsuarioAluno)BancoDeDados.pegaUsuario()).getTurmasOndeAlunoEsta();
    String[] colunas = {"Código", "Disciplina", "Professor", "Horário", "Ações"};

    @Override
    public int getRowCount() {
        return turmas.size();
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
    public boolean isCellEditable(int linha, int coluna) {
        return coluna == 4;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        Turma selecaoTurma = turmas.get(linha);
        
        switch(coluna) {
            case 0: return selecaoTurma.getCodigo();
            case 1: return selecaoTurma.getDisciplina();
            case 2: return selecaoTurma.getProfessor().getNome();
            case 3: return selecaoTurma.getHorario();
            case 4: return null;
            default: return null;
        }
        
    }
    
    public void pesquisarTurma(String codigo, String disciplina, String professor, String horario, ListagemTurmasAluno referenciaTabela) {

        if(codigo.equals("") && disciplina.equals("") && professor.equals("") && horario.equals("")){
            
            turmas = BancoDeDados.retornarTurmas();
            referenciaTabela.mensagemCasoPesquisaNula();
            fireTableDataChanged();
            
        } else {
            
            turmas = BancoDeDados.pesquisarTurmaAluno(codigo, disciplina, professor, horario);
            
            if (turmas.size() < 1) {
                referenciaTabela.mensagemCasoPesquisaDeErrado();
            } else {
                referenciaTabela.mensagemCasoPesquisaNula();
            }
            
            fireTableDataChanged();
            
        }
        
    }
    
}
