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
    private static List<Turma> turmas = new ArrayList<>();
    
    public static List<Turma> getTurmas() {
        return turmas;
    }
    
    public static void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    
    public static boolean loginProfessorAluno(int matricula, String senha) {
        
        for(Usuario usuario: usuarios) {
            
            Boolean usuarioAluno = usuario instanceof UsuarioAluno;
            Boolean usuarioProfessor = usuario instanceof UsuarioProfessor;
            
            if (usuarioAluno) {
                int matriculaAluno = ((UsuarioAluno)usuario).getMatricula(); //tivemos cast aqui, cast é quando convertemos um valor de um tipo para outro tipo
                if (matriculaAluno == matricula && usuario.getSenha().equals(senha)){
                    usuarioLogado = usuario;
                    return true;
                }
                
            }else if(usuarioProfessor) {
                int matriculaProfessor = ((UsuarioProfessor)usuario).getMatricula();
                if(matriculaProfessor == matricula && usuario.getSenha().equals(senha)){
                    usuarioLogado = usuario;
                    return true;
                }
                
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
            
            if(usuarioProfessor)
                quantidade++;
        
        }
    
        return quantidade;
    }
    
    public static int quantidadeAluno() {
        
        int quantidade = 0;
        
        for(Usuario usuario: usuarios) {
            
            Boolean usuarioAluno = usuario instanceof UsuarioAluno;
            
            if(usuarioAluno)
                quantidade++;
            
        }
        
        return quantidade;
        
    }
    
    public static List<UsuarioProfessor> retornarProfessores() {
        
        List<UsuarioProfessor> professores = new ArrayList<>();
        
        for(Usuario usuario: usuarios) {
            
            Boolean usuarioProfessor = usuario instanceof UsuarioProfessor;
            
            if(usuarioProfessor){
                professores.add((UsuarioProfessor) usuario);
            }
            
        }
        
        return professores;
    }
    
    public static void excluirProfessorDaLista(int linhaSelecionada) {
        
        List<UsuarioProfessor> professores = new ArrayList<>();
        int linhaProfessor;
        
        for(Usuario usuario: usuarios) {
            
            Boolean usuarioProfessor = usuario instanceof UsuarioProfessor;
            
            if(usuarioProfessor){
                professores.add((UsuarioProfessor)usuario);
            }
            
        }
        
        linhaProfessor = professores.get(linhaSelecionada).getMatricula();
        usuarios.remove(linhaProfessor);
        
    }
    
    public static Usuario pegaUsuario() {
        
        return usuarioLogado;
        
    }
    
    
    public final static void criaUsuariosFakes() {
        
        UsuarioCoordenador coordenador;
        UsuarioAluno aluno1;
        UsuarioAluno aluno2;
        UsuarioAluno aluno3;
        UsuarioProfessor professor1;
        UsuarioProfessor professor2;
        Turma turma1;
        Turma turma2;
        
        coordenador = new UsuarioCoordenador();
        coordenador.setNome("Alan Santos");
        coordenador.setCpf("54345423478");
        coordenador.setEmail("alansantos3@gmail.com");
        coordenador.setEndereco("Rua Jangurussu, 555 - Casa");
        coordenador.setNomeUsuario("alan");
        coordenador.setSenha("123");
        coordenador.setTelefone("123321");
        usuarios.add(coordenador);
        
        aluno1 = new UsuarioAluno();
        aluno1.setMatricula(1);
        aluno1.setNome("Mário Gentili");
        aluno1.setSenha("123");
        usuarios.add(aluno1);
        
        aluno2 = new UsuarioAluno();
        aluno2.setMatricula(2);
        aluno2.setNome("Andréa Silva");
        aluno2.setSenha("321");
        usuarios.add(aluno2);
        
        aluno3 = new UsuarioAluno();
        aluno3.setMatricula(3);
        aluno3.setNome("Rodrigo Baltar");
        aluno3.setSenha("123");
        usuarios.add(aluno3);
        
        professor1 = new UsuarioProfessor();
        professor1.setMatricula(4);
        professor1.setNome("Silvio Pontes");
        professor1.setSenha("123");
        usuarios.add(professor1);
        turma1 = new Turma();
        turma1.setProfessor(professor1);
        turma1.setCodigo(1221);
        professor1.adicionaTurma(turma1);
        turmas.add(turma1);
        
        professor2 = new UsuarioProfessor();
        professor2.setMatricula(5);
        professor2.setNome("Paulo Mendes");
        professor2.setSenha("321");
        usuarios.add(professor2);
        turma2 = new Turma();
        turma2.setProfessor(professor2);
        turma2.setCodigo(2112);
        professor2.adicionaTurma(turma2);
        turmas.add(turma2);
        
    }
    
}
