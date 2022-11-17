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
    
    public Boolean validaDisciplinaDaTurma(String disciplina) {
        
        for(Turma turma: turmasOndeAlunoEsta) {
            
            if (!disciplina.equals("") && turma.getDisciplina().toUpperCase().contains(disciplina))
                return true;
            
        }
        
        return false;
        
    }
    
    public Boolean validaCodigoDaTurma(String codigo) {
        
        for(Turma turma: turmasOndeAlunoEsta) {
            
            if (!codigo.equals("") && turma.getCodigo().toUpperCase().equals(codigo))
                return true;
            
        }
        
        return false;
        
    }
    
}
