package br.com.pethoteis.demo.Enum;

public enum Servico {
    HOSPEDAGEM("Hospedagem"),
    CRECHE("Creche"),
    PETSITTER("Pet Sitter");

    public String servico;

    private Servico(String servico){
        this.servico = servico;
    }
    public String getServico() {
        return servico;
    }
}
