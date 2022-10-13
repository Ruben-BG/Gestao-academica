package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ravtec
 */
public class BancoDeDados {
    
    private static List<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public static boolean loguinProfessorAluno(int matricula, String senha) {
        
        for(Usuario usuario: usuarios) {
            
            Boolean usuarioAluno = usuario instanceof UsuarioAluno;
            Boolean usuarioProfessor = usuario instanceof UsuarioProfessor;
            
            if (usuarioAluno) {
                int matriculaAluno = ((UsuarioAluno)usuario).getMatricula();
                if (matriculaAluno == matricula && usuario.getSenha().equals(senha)) 
                    return true;
                
            }else if(usuarioProfessor) {
                int matriculaProfessor = ((UsuarioProfessor)usuario).getMatricula();
                if(matriculaProfessor == matricula && usuario.getSenha().equals(senha))
                    return true;
                
            }
            
        }
        
        return false;
        
    }
    
    public static boolean loginCoordenador(String nomeUsuario, String senha) {
        
        for(Usuario usuario: usuarios) {
            Boolean usuarioCoordenador = usuario instanceof UsuarioCoordenador;
            
            if(usuarioCoordenador) {
                String nomeUsuarioAtual = ((UsuarioCoordenador)usuario).getNomeUsuario();
                return nomeUsuarioAtual.equals(nomeUsuario) && usuario.getSenha().equals(senha);
            }
            
        }
        
        return false;
        
    }
    
}
