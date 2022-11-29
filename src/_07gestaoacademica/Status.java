package _07gestaoacademica;

public enum Status {

    PENDENTE("Pendente"), APROVADA("Aprovada"), REJEITADA("Rejeitada");

    public String valorDoStatus;

    private Status(String associacaoStatus) {
        valorDoStatus = associacaoStatus;
    }
    
    public Boolean isPendente() {
        return equals(PENDENTE);
    }
    
    public Boolean isAprovada() {
        return equals(APROVADA);
    }
    
    public Boolean isRejeitada() {
        return equals(REJEITADA);
    }

}
