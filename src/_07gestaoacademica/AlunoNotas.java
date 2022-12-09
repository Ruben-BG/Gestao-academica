package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

public class AlunoNotas {
    
    UsuarioAluno aluno;
    List<NotaPeriodo> notas = new ArrayList<>();

    public void setAluno(UsuarioAluno aluno) {
        this.aluno = aluno;
    }

    public void setNotas(List<NotaPeriodo> notas) {
        this.notas = notas;
    }

    public UsuarioAluno getAluno() {
        return aluno;
    }

    public List<NotaPeriodo> getNotas() {
        return notas;
    }
    
    public Double getMedia() {
        
        Double media = 0.0;
        Double somaDeNota = 0.0;
        
        for (NotaPeriodo nota : notas) {
            
            somaDeNota += nota.nota;
            
        }
        
        return somaDeNota/notas.size();
        
    }
    
}
