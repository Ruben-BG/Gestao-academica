package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class ModeloCBTurmaAluno<E> extends AbstractListModel<String> implements ComboBoxModel<String>{

    private List<Turma> turmas = new ArrayList<>();
    private Object turma;
    
    public ModeloCBTurmaAluno(UsuarioAluno alunoLogado) {
        turmas = BancoDeDados.TurmasOndeAlunoNaoEsta(alunoLogado);
    }

    @Override
    public int getSize() {
        return turmas.size();
    }

    @Override
    public String getElementAt(int index) {
        return turmas.get(index).getDisciplina();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        turma = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return turma;
    }
    
    public int quantidadeMaximaDeAlunosSuportados(int linha) {
        int quantidade = turmas.get(linha).getQuantidadeMaximaDeAlunos();
        return quantidade;
    }
    
    public int quantidadeAlunosMatriculados(int linha) {
        int quantidade = turmas.get(linha).getAlunosMatriculados().size();
        return quantidade;
    }
    
    public int quantidadesDeTurmasDisponiveis() {
        return turmas.size();
    }
    
}
