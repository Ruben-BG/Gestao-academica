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
    
    public static void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public static void cadastrarTurma(Turma turma) {
        turmas.add(turma);
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
    
    public static int quantidadeTurma() {
        int quantidade = turmas.size();
        return quantidade;
    }
    
    public static int quantidadeTurmaAluno() {
        
        int quantidade = 0;
        
        if (usuarioLogado instanceof UsuarioAluno usuarioAluno) {
            quantidade = usuarioAluno.getTurmasOndeAlunoEsta().size();
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
    
    public static List<Turma> retornarTurmas() {
        return turmas;
    }
    
    public static List<UsuarioAluno> retornarAlunos() {
        
        List<UsuarioAluno> alunos = new ArrayList<>();
        
        for(Usuario usuario: usuarios) {
            
            Boolean usuarioAluno = usuario instanceof UsuarioAluno;
            
            if(usuarioAluno) {
                alunos.add((UsuarioAluno) usuario);
            }
            
        }
        
        return alunos;
        
    }
    
    public static void excluirProfessorDaLista(int linhaSelecionada) {
        
        List<UsuarioProfessor> professores = new ArrayList<>();
        
        for(Usuario usuario: usuarios) {
            
            Boolean usuarioProfessor = usuario instanceof UsuarioProfessor;
            
            if(usuarioProfessor){
                professores.add((UsuarioProfessor)usuario);
            }
            
        }
        
        turmas.removeAll(professores.get(linhaSelecionada).retornarTurmasDesseProfessor());//usado para remover da lista todos os seus elementos contidos na coleção especificada.
        usuarios.remove(professores.get(linhaSelecionada));
        
    }
    
    public static void excluirTurmaDaLista(int linhaSelecionada) {
        
        List<UsuarioProfessor> professores = retornarProfessores();
        
        for(UsuarioProfessor professor: professores) {
            
            if(turmas.get(linhaSelecionada).getProfessor().equals(professor)) {
                professor.removeTurma(turmas.get(linhaSelecionada));
            }
            
        }
        
        turmas.remove(linhaSelecionada);
        
    }
    
    public static void excluirAlunoDaLista(int linhaSelecionada) {
        
        List<UsuarioAluno> alunos = retornarAlunos();
        
        usuarios.remove(alunos.get(linhaSelecionada));
        
    }
    
    public static Usuario pegaUsuario() {
        
        return usuarioLogado;
        
    }
    
    public static List<UsuarioProfessor> pesquisarProfessor(String nome, String codigoTurma, String disciplinaTurma) {
        
        List<UsuarioProfessor> professores = new ArrayList<>();
        
        for(Usuario usuario :usuarios) {
            
            Boolean usuarioProfessor = usuario instanceof UsuarioProfessor;
            Boolean validaNome = nome != null && !nome.equals("") && usuario.getNome().toUpperCase().contains(nome);
            Boolean validaCodigoTurma = usuarioProfessor && ((UsuarioProfessor)usuario).validaCodigoDaTurma(codigoTurma);
            Boolean validaDisciplinaDaTurma = usuarioProfessor && ((UsuarioProfessor)usuario).validaDisciplina(disciplinaTurma);
            
            if(usuarioProfessor && (validaNome || validaCodigoTurma || validaDisciplinaDaTurma)) {
                professores.add((UsuarioProfessor)usuario);
            }
            
        }
        
        return professores;
        
    }
    
    public static List<Turma> pesquisaTurma(String codigo, String disciplina, String nomeDoProfessor) {
        
        List<Turma> turmasEscolhidas = new ArrayList<>();
        
        for(Turma turma: turmas) {
            
            Boolean validaCodigo = !codigo.equals("") && turma.getCodigo().contains(codigo);
            Boolean validaDisciplina = !disciplina.equals("") && turma.getDisciplina().toUpperCase().contains(disciplina);
            Boolean validaProfessor = !nomeDoProfessor.equals("") && turma.getProfessor().getNome().toUpperCase().contains(nomeDoProfessor);
            
            if(validaCodigo || validaDisciplina || validaProfessor) {
                turmasEscolhidas.add(turma);
            }
            
        }
        
        return turmasEscolhidas;
        
    }
    
    public static List<UsuarioAluno> pesquisarAluno(String nomeDoAluno, String codidoDaTurma, String disciplinaTurma) {
        
        List<UsuarioAluno> alunos = new ArrayList<>();
        
        for(UsuarioAluno aluno: retornarAlunos()) {
            
            Boolean validaNome = nomeDoAluno != null && !nomeDoAluno.equals("") && aluno.getNome().toUpperCase().contains(nomeDoAluno);
            Boolean validaCodigoDaTurma = aluno.validaCodigoDaTurma(codidoDaTurma);
            Boolean validaDisciplina = aluno.validaDisciplinaDaTurma(disciplinaTurma);
            
            if (validaNome || validaCodigoDaTurma || validaDisciplina) {
                alunos.add(aluno);
            }
            
        }
        
        return alunos;
        
    }
    
    public static void editarProfessor(int professorSelecionado, UsuarioProfessor usuarioProfessor) {
        
        UsuarioProfessor professorEscolhido = retornarProfessores().get(professorSelecionado);
        
        professorEscolhido.setNome(usuarioProfessor.getNome());
        professorEscolhido.setCpf(usuarioProfessor.getCpf());
        professorEscolhido.setTelefone(usuarioProfessor.getTelefone());
        professorEscolhido.setEndereco(usuarioProfessor.getEndereco());
        professorEscolhido.setEmail(usuarioProfessor.getEmail());
        professorEscolhido.setSenha(usuarioProfessor.getSenha());
        
    }
    
    public static void editarTurma(int turmaSelecionada, Turma turmaParaEdicao) {
        
        Turma turma = turmas.get(turmaSelecionada);
        
        turma.setCodigo(turmaParaEdicao.getCodigo());
        turma.setDisciplina(turmaParaEdicao.getDisciplina());
        turma.setHorario(turmaParaEdicao.getHorario());
        turma.setQuantidadeMaximaDeAlunos(turmaParaEdicao.getQuantidadeMaximaDeAlunos());
        turma.setProfessor(turmaParaEdicao.getProfessor());
        
    }
    
    public static void editarAluno(int alunoSelecionado, UsuarioAluno alunoParaEdicao) {
        
        UsuarioAluno aluno = retornarAlunos().get(alunoSelecionado);
        
        aluno.setNome(alunoParaEdicao.getNome());
        aluno.setCpf(alunoParaEdicao.getCpf());
        aluno.setTelefone(alunoParaEdicao.getTelefone());
        aluno.setEndereco(alunoParaEdicao.getEndereco());
        aluno.setEmail(alunoParaEdicao.getEmail());
        aluno.setSenha(alunoParaEdicao.getSenha());
        
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
        Turma turma3;
        
        
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
        
        professor2 = new UsuarioProfessor();
        professor2.setMatricula(5);
        professor2.setNome("Paulo Mendes");
        professor2.setSenha("321");
        professor2.setCpf("61158269340");
        professor2.setEmail("pauloM@gmail.com");
        usuarios.add(professor2);
        
        
        turma1 = new Turma();
        turma1.setProfessor(professor1);
        turma1.setDisciplina("geografia");
        turma1.setCodigo("GEO123");
        turma1.setHorario("Seg.: 08:00");
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno3);
        professor1.adicionaTurma(turma1);
        turmas.add(turma1);
        
        turma2 = new Turma();
        turma2.setProfessor(professor2);
        turma2.setDisciplina("ciências");
        turma2.setCodigo("CIE14S");
        turma2.setHorario("Seg.: 07:10");
        turma2.setQuantidadeMaximaDeAlunos(5);
        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        professor2.adicionaTurma(turma2);
        turmas.add(turma2);
        
        turma3 = new Turma();
        turma3.setProfessor(professor2);
        turma3.setDisciplina("biologia");
        turma3.setCodigo("BIO469");
        turma3.setHorario("Qua.: 09:00");
        turma3.setQuantidadeMaximaDeAlunos(12);
        turma3.adicionarAluno(aluno1);
        professor2.adicionaTurma(turma3);
        turmas.add(turma3);
        
    }
    
}
