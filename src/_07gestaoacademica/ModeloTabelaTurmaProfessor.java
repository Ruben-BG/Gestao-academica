package _07gestaoacademica;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaTurmaProfessor extends AbstractTableModel{
    
    List<Turma> turmas = ((UsuarioProfessor)BancoDeDados.pegaUsuario()).retornarTurmasDesseProfessor();
    String[] colunas = {"Código", "Disciplina", "Alunos Matric./Máx", "Horário", "Ações"};

    @Override
    public int getRowCount() {
        return turmas.size();
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
        return coluna == 4;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        Turma turma = turmas.get(linha);
        
        switch (coluna) {
            
            case 0: return turma.getCodigo();
            case 1: return turma.getDisciplina();
            case 2: return turma.getAlunosMatriculados().size() + "/" + turma.getQuantidadeMaximaDeAlunos();
            case 3: return turma.getHorario();
            case 4: return null;
            
            default: return null;
            
        }
        
    }
    
    public void pesquisarTurma(ListagemDeTurmasProfessor referenciaListagem, String codigo, String disciplina, String alunosMatriculados, String horario) {
        
        if (codigo.equals("") && disciplina.equals("") && alunosMatriculados.equals("") && horario.equals("")) {
            
            turmas = ((UsuarioProfessor)BancoDeDados.pegaUsuario()).retornarTurmasDesseProfessor();
            referenciaListagem.mensagemCasoDePesquisaNula();
            fireTableDataChanged();
            
        } else {
            
            turmas = BancoDeDados.pesquisarTurmasDoProfessor(codigo, disciplina, alunosMatriculados, horario);
            
            if (turmas.size() < 1)
                referenciaListagem.mensagemCasoPesquisaDeErrado();
            else
                referenciaListagem.mensagemCasoDePesquisaNula();
            
            fireTableDataChanged();
            
        }
        
    }

    public Turma pegarTurmaSelecionada(int turmaSelecionada) {
        
        return turmas.get(turmaSelecionada);
        
    }
    
}
