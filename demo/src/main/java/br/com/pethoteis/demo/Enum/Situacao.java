package br.com.pethoteis.demo.Enum;

public enum Situacao {
    ATIVO("Ativo"),
    INATIVO("Inativo");

    private String situacao;

    private Situacao(String situacao){
        this.situacao = situacao;
    }
}
