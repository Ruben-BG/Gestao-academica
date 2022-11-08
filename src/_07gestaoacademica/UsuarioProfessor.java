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
    
    public List<Turma> retornarTurmasDesseProfessor() {
        return turmasDoProfessor;
    }
    
    public void removeTurma(Turma turmaEscolhida) {
        turmasDoProfessor.remove(turmaEscolhida);
    }
    
    public Boolean validaDisciplina(String conteudoDaTurma) {
        
        for(Turma turma: turmasDoProfessor) {
            
            Boolean turmaContemDisciplina = turma.getDisciplina().toUpperCase().contains(conteudoDaTurma);
            
            if(turma.getDisciplina() != null && !conteudoDaTurma.equals("") && turmaContemDisciplina)
                return true;
            
        }
        
        return false;
        
    }
    
    public Boolean validaCodigoDaTurma(String codigoTurma) {
        
        //Boolean codigoIsnumeric = codigoTurma.chars().allMatch(Character::isDigit);
        //int codigo = codigoTurma.equals("") ? 0 : Integer.parseInt(codigoTurma);
        
        for(Turma turma: turmasDoProfessor) {
            
            if(!codigoTurma.equals("") && turma.getCodigo().equals(codigoTurma))
                return true;
            
        }
        
        return false;
        
    }
    
}
