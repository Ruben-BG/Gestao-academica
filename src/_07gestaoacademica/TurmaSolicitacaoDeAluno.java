package _07gestaoacademica;

public class TurmaSolicitacaoDeAluno {
    
    //pegar aluno, passar nome, disciplina da turma, data de requerimento usando Time
    
    private UsuarioAluno aluno;
    private Turma turma;

    //SETTERS
    public void setAluno(UsuarioAluno aluno) {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public void setDataRequerimento() {
        
    }

    //GETTERS
    public UsuarioAluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }
    
    public String getNomeAluno() {
        return aluno.getNome();
    }
    
    public String getDisciplinaDaTurma() {
        return turma.getDisciplina();
    }
    
}
