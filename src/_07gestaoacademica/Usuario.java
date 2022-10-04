package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ravtec
 */
public class Usuario {
    
    private static int matriculaAtual = 0;
    private static List<Object> usuarios = new ArrayList<>();
    
    protected static int getProximaMatricula() {
        return matriculaAtual + 1;
    }

    public void setUsuarios(List<Object> usuarios) {
        this.usuarios.add(usuarios);
    }

    public List<Object> getUsuarios() {
        return usuarios;
    }

}
