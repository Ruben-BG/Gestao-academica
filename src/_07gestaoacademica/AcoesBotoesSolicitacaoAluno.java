package _07gestaoacademica;

public enum AcoesBotoesSolicitacaoAluno {
    
    CANCELAR("Cancelar"), REENVIAR("Reenviar"), REMOVER("Remover");
    
    String valorOpcoesENum;
    
    private AcoesBotoesSolicitacaoAluno(String associacaoAcao) {
        valorOpcoesENum = associacaoAcao;
    }
    
}
