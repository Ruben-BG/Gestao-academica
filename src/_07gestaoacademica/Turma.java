package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

public class Turma{
    
    private String disciplina, horario, codigo;
    private int quantidadeMaximaDeAlunos;
    private UsuarioProfessor professor;
    private List<UsuarioAluno> alunosMatriculados = new ArrayList<>();
    private List<NotaDeAluno> notas = new ArrayList<>();

    public List<NotaDeAluno> getNotas() {
        return notas;
    }
    
    //GETTERS
    
    public String getCodigo() {
        return codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getHorario() {
        return horario;
    }

    public UsuarioProfessor getProfessor() {
        return professor;
    }

    public int getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public List<UsuarioAluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }
    
    //SETTERS

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setProfessor(UsuarioProfessor professor) {
        this.professor = professor;
    }

    public void setQuantidadeMaximaDeAlunos(int quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public void adicionarAluno(UsuarioAluno aluno) {
        this.alunosMatriculados.add(aluno);
        aluno.atribuirATurma(this);
    }
    
}
