package _07gestaoacademica;

public class NotaDeAluno {
    
    //Atributos
    private UsuarioAluno aluno;
    private Turma turma;
    private Double nota;

    //Métodos
    public void adicionarNota(UsuarioAluno alunoSelecionado, Turma turmaDoAluno, double novaNota) {
        aluno = alunoSelecionado;
        turma = turmaDoAluno;
        nota = novaNota;
        turmaDoAluno.adicionarNotaAoAluno(this);
    }

    public UsuarioAluno getAluno() {
        return aluno;
    }
    
    public Double getNota() {
        return nota;
    }

    public Turma getTurma() {
        return turma;
    }
    
}
