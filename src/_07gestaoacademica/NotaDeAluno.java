package _07gestaoacademica;

public class NotaDeAluno {
    
    //Atributos
    private UsuarioAluno aluno;
    private Turma turma;
    private Double nota;
    private int periodo;

    //Métodos
    public void adicionarNota(UsuarioAluno alunoSelecionado, Turma turmaDoAluno, double novaNota, int periodo) {
        aluno = alunoSelecionado;
        turma = turmaDoAluno;
        nota = novaNota;
        this.periodo = periodo;
    }
    
    
    //SETTERS
    public void setNovaNota(Double nota) {
        this.nota = nota;
    }
    
    
    //GETTERS
    public UsuarioAluno getAluno() {
        return aluno;
    }
    
    public Double getNota() {
        return nota;
    }

    public int getPeriodo() {
        return periodo;
    }

    public Turma getTurma() {
        return turma;
    }
    
}
