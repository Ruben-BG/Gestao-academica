package _07gestaoacademica;

/**
 *
 * @author ravtec
 */
public class Usuario{
    
    private String nome, telefone, email, cpf, endereco, senha;
    private static int matriculaAtual = 0;
    private Boolean isProfessor, isAluno;
    
    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void isAluno() {
        this.isAluno = true;
        this.isProfessor = false;
    }

    public void isProfessor() {
        this.isProfessor = true;
        this.isAluno = false;
    }
    
    //GETTERS

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }
    
    protected static int getProximaMatricula() {
        return ++matriculaAtual;
    }

    public Boolean getIsAluno() {
        return isAluno;
    }

    public Boolean getIsProfessor() {
        return isProfessor;
    }
    
}
