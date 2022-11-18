package br.com.pethoteis.demo.modelo;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.util.List;


import br.com.pethoteis.demo.Enum.Genero;

@Entity
public class DonoPet {
    //atributo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(length=200)
    @NotBlank(message = "O nome não pode ser vazio")
    private String nome;
    @Column(length=14)
    private String cpf;
    @Column(length=15)
    private String telefone;
    @Column(length=200)
    private String email;
    @Enumerated(EnumType.STRING)
    private Genero gereno;
    @Column(length=50)
    private String senha;
    @Column(length=50)
    private String confSenha;
    //@OneToMany(targetEntity=Pet.class, mappedBy ="codigo")
    //private Pet pet; 
    public int getCodigo() {
        return codigo;
    }
  public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Genero getGereno() {
        return gereno;
    }
    public void setGereno(Genero gereno) {
        this.gereno = gereno;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getConfSenha() {
        return confSenha;
    }
    public void setConfSenha(String confSenha) {
        this.confSenha = confSenha;
    }
    
}
