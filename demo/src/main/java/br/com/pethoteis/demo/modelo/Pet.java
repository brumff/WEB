package br.com.pethoteis.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import br.com.pethoteis.demo.Enum.Sexo;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @ManyToOne(targetEntity=DonoPet.class)
    @JoinColumn(name="donopet_id", referencedColumnName = "codigo") 
    private DonoPet donoPet;
    @Column(length=200)
    private String nomePet;
    @Column(length=2)
    private int idade;
    @Column(length=5)
    private float peso;
    @Column(length=200)
    private String raca;
    @Column(length=100)
    private String cor;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Column(length=300)
    private String obs;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /*public DonoPet getDonoPet() {
        return donoPet;
    }
    public void setDonoPet(DonoPet donoPet) {
        this.donoPet = donoPet;
    }*/
    public String getNomePet() {
        return nomePet;
    }
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public String getObs() {
        return obs;
    }
    public void setObs(String obs) {
        this.obs = obs;
    }

}
