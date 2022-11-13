package br.com.pethoteis.demo.Enum;

public enum Servicos {
    HOSPEDAGEM("Hospedagem"),
    CRECHE("Creche"),
    PETSITTER("Pet Sitter");

    private String servicos;

    private Servicos(String servicos){
        this.servicos = servicos;
    }
}
