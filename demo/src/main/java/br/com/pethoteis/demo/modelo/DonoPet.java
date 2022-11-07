package br.com.pethoteis.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.pethoteis.demo.Enum.Genero;

@Entity
public class DonoPet {
    //atributo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private Date dtNasc;
    private String email;
    private Genero gereno;
    private String senha;
    private String confSenha;
    private String idade;
   // @ManyToOne
    //private Pet pet;

    public int getCodigo() {
        return codigo;
    }
  public String getIdade() {
    return idade;
}
public void setIdade(String idade) {
    this.idade = idade;
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
    public Date getDtNasc() {
        return dtNasc;
    }
    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
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
   /*  public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }*/

    
}
