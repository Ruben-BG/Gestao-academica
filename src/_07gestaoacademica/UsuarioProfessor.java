package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

public class UsuarioProfessor extends Usuario{

    private int matricula;
    private List<Turma> turmasDoProfessor = new ArrayList<>();

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void adicionaTurma(Turma turma) {
        turmasDoProfessor.add(turma);
    }
    
    public int retornaQuantidadeDeTurma() {
        return turmasDoProfessor.size();
    }
    
}
