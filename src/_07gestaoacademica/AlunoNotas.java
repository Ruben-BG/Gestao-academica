package _07gestaoacademica;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        BigDecimal media;
        
        for (NotaPeriodo nota : notas) {
            
            somaDeNota += nota.getNota();
            
        }
        
        media = new BigDecimal(somaDeNota/notas.size()).setScale(1, RoundingMode.FLOOR);
        
        return Double.valueOf(media.toString());
        
    }
    
}
