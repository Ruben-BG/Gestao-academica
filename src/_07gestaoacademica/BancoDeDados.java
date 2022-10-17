package _07gestaoacademica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ravtec
 */
public class BancoDeDados {
    
    private static List<Usuario> usuarios = new ArrayList<>();
    private static Usuario usuarioLogado;
    
    public static void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public static boolean loginProfessorAluno(int matricula, String senha) {
        
        for(Usuario usuario: usuarios) {
            
            Boolean usuarioAluno = usuario instanceof UsuarioAluno;
            Boolean usuarioProfessor = usuario instanceof UsuarioProfessor;
            
            if (usuarioAluno) {
                int matriculaAluno = ((UsuarioAluno)usuario).getMatricula();
                if (matriculaAluno == matricula && usuario.getSenha().equals(senha)) 
                    usuarioLogado = usuario;
                    return true;
                
            }else if(usuarioProfessor) {
                int matriculaProfessor = ((UsuarioProfessor)usuario).getMatricula();
                if(matriculaProfessor == matricula && usuario.getSenha().equals(senha))
                    usuarioLogado = usuario;
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
                usuarioLogado = usuario;
                return nomeUsuarioAtual.equals(nomeUsuario) && usuario.getSenha().equals(senha);
            }
            
        }
        
        return false;
        
    }
    
    public static int quantidadeProfessor() {
        
        int quantidade = 0;
        
        for(Usuario usuario: usuarios) {
            
            Boolean usuarioProfessor = usuario instanceof UsuarioProfessor;
            
            if(usuarioProfessor) {
                quantidade++;
            }
        
        }
    
        return quantidade;
    }

    private static void criaUsuariosFakes() {
        
    }
    
    public static Usuario pegaUsuario() {
        
        return usuarioLogado;
        
    }
    
}
