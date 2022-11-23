package _07gestaoacademica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TurmaSolicitacaoDeAluno {
    
    //pegar aluno, passar nome, disciplina da turma, data de requerimento usando Time
    
    private UsuarioAluno aluno;
    private Turma turma;
    private LocalDateTime dataAtual;
    private int status; //0 = pendente, 1 = aprovado, 2 = rejeitado

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
    
    public void adicionarStatus(int statusPedido) {
        
        if (statusPedido < 0 && statusPedido > 2) {
            status = -1;
        } else {
            status = statusPedido;
        }
        
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
    
    public String getStatusDeAprovacao() {
        
        return switch (status) {
            case 0 -> "Pendente";
            case 1 -> "Aprovada";
            case 2 -> "Rejeitada";
            default -> null;
        };
        
    }
    
}
