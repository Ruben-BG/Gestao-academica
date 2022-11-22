package _07gestaoacademica;

import java.time.LocalDateTime;

public class TurmaSolicitacaoDeAluno {
    
    //pegar aluno, passar nome, disciplina da turma, data de requerimento usando Time
    
    private UsuarioAluno aluno;
    private Turma turma;
    LocalDateTime dataAtual;

    //SETTERS
    public void setAluno(UsuarioAluno aluno) {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public void adicionarDataAtual() {
        dataAtual = LocalDateTime.now();
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

    public LocalDateTime getDataAtual() {
        return dataAtual;
    }
    
}
