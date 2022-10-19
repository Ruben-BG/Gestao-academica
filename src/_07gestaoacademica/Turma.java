package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

public class Turma{
    
    private String disciplina, horario;
    private int codigo, quantidadeMaximaDeAlunos;
    private UsuarioProfessor professor;
    private List<UsuarioAluno> alunosMatriculados = new ArrayList<>();
            
    
    //GETTERS
    
    public int getCodigo() {
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
    
    
    //SETTERS

    public void setCodigo(int codigo) {
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
    
}
