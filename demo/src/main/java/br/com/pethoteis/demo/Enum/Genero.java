package br.com.pethoteis.demo.Enum;

public enum Genero {
    FEMININO("Feminino"),
    MASCULINO("Masculino");

    private String genero;

    private Genero(String genero){
        this.genero = genero;
    }
}
