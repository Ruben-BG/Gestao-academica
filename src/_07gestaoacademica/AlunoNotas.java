package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

public class AlunoNotas {
    
    private UsuarioAluno aluno;
    private List<NotaPeriodo> notas = new ArrayList<>();

    public void setAluno(UsuarioAluno aluno) {
        this.aluno = aluno;
    }

    public void setNotas(List<NotaPeriodo> notas) {
        this.notas = notas;
    }
    
    public void adicionarNota(NotaPeriodo novaNota) {
        notas.add(novaNota);
    }

    public UsuarioAluno getAluno() {
        return aluno;
    }

    public List<NotaPeriodo> getNotas() {
        return notas;
    }
    
    public Double getMedia() {
        
        Double somaDeNota = 0.0;
        
        for (NotaPeriodo nota : notas) {
            
            somaDeNota += nota.getNota();
            
        }
        
        return Math.floor(somaDeNota/notas.size());
        
    }
    
}
