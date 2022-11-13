package br.com.pethoteis.demo.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.pethoteis.demo.Enum.Servicos;
import br.com.pethoteis.demo.Enum.Situacao;

public class Parceiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(length=200)
    private String nomeParceiro;
    @Column(length=14)
    private String cnpj;
    @Column(length=15)
    private String telefone;
    @Column(length=200)
    private String email;
    private Servicos servicos;
    @Column(length=200)
    private String nomeProprietario;
    @Column(length=14)
    private String cpf;
    private Situacao situacao;
    @Column(length=50)
    private String senha;
    @Column(length=50)
    private String confSenha;
    // @OneToMany para contratação de serviços
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNomeParceiro() {
        return nomeParceiro;
    }
    public void setNomeParceiro(String nomeParceiro) {
        this.nomeParceiro = nomeParceiro;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
    public Servicos getServicos() {
        return servicos;
    }
    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Situacao getSituacao() {
        return situacao;
    }
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
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
