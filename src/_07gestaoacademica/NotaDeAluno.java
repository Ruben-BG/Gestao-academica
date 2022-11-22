package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

public class NotaDeAluno {
    
    //Atributos
    private UsuarioAluno aluno;
    private Turma turma;
    private List<Double> notas = new ArrayList<>();//Não terá double por conta dos periodos

    //Métodos
    public void adicionarNota(UsuarioAluno alunoSelecionado, Turma turmaDoAluno, double novaNota) {
        aluno = alunoSelecionado;
        turma = turmaDoAluno;
        turmaDoAluno.adicionarNotaAoAluno(this);
        notas.add(novaNota);
    }

    public UsuarioAluno getAluno() {
        return aluno;
    }
    
    public List<Double> getNotas() {
        return notas;
    }
    
    public Double getMedia() {
        
        Double notaFinal = 0.0;
        int periodos = 0;
        
        for (int l = 0; l < notas.size(); l++) {
            
            notaFinal = notaFinal + notas.get(l);
            periodos = l;
            
        }
        
        notaFinal = notaFinal / (periodos + 1);
        
        return notaFinal;
        
    }
    
    public Double getNota(int notaEspecifica) {
        return notas.get(notaEspecifica);
    }

    public Turma getTurma() {
        return turma;
    }
    
}
