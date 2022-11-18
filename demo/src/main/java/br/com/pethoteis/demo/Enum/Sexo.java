package br.com.pethoteis.demo.Enum;

public enum Sexo {
    FEMEA("Fêmea"),
    MACHO("Macho");

    private String sexo;

    private Sexo(String sexo){
        this.sexo = sexo;
    }
}