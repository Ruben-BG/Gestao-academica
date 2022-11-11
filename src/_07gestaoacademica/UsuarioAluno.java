package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

public class UsuarioAluno extends Usuario{
    
    private int matricula;
    private List<Turma> turmasOndeAlunoEsta = new ArrayList<>();

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void atribuirATurma(Turma turma) {
        turmasOndeAlunoEsta.add(turma);
    }

    public List<Turma> getTurmasOndeAlunoEsta() {
        return turmasOndeAlunoEsta;
    }
    
}
