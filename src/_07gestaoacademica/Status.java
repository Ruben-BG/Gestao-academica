package _07gestaoacademica;

public enum Status {

    PENDENTE("Pendente"), APROVADA("Aprovada"), REJEITADA("Rejeitada");

    public String valorDoStatus;

    Status(String associacaoStatus) {
        valorDoStatus = associacaoStatus;
    }

}
