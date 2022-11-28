package _07gestaoacademica;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TurmaSolicitacaoDeAluno {
    
    //pegar aluno, passar nome, disciplina da turma, data de requerimento usando Time
    
    private UsuarioAluno aluno;
    private Turma turma;
    private Status valorStatus;
    private LocalDateTime dataAtual;

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
    
    public void adicionarStatus(Status statusPedido) {
        valorStatus = statusPedido;
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

    public String getDataDeSolicitacaoFormatada() {
        
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dataAtual.format(dataFormatada);
        
    }
    
    public Date getDataAtualParaData() {
        
        return Date.from(dataAtual.atZone(ZoneId.systemDefault()).toInstant());
        
    }

    public LocalDateTime getDataAtual() {
        return dataAtual;
    }
    
    public String getStatusDeAprovacao() {
        
        if (valorStatus == Status.PENDENTE)
            return Status.PENDENTE.valorDoStatus;
        else if (valorStatus == Status.APROVADA)
            return Status.APROVADA.valorDoStatus;
        else
            return Status.REJEITADA.valorDoStatus;
        
    }
    
}
