package br.com.pethoteis.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.pethoteis.demo.Enum.Servico;


@Entity
@Table(name = "servicos")
public class Servicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @Enumerated
    private Servico servico;

    private String nomeServico;

    private String descricao;

    private float valor;

    private boolean mini;

    private boolean p;

    private boolean m;

    private boolean g;

    private boolean xg;

    private boolean seg;

    private boolean ter;   
    
    private boolean qua;

    private boolean qui;

    private boolean sex;

    private boolean sab;

    private boolean dom;

    @ManyToOne
    private Parceiro parceiro;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isMini() {
        return mini;
    }

    public void setMini(boolean mini) {
        this.mini = mini;
    }

    public boolean isP() {
        return p;
    }

    public void setP(boolean p) {
        this.p = p;
    }

    public boolean isM() {
        return m;
    }

    public void setM(boolean m) {
        this.m = m;
    }

    public boolean isG() {
        return g;
    }

    public void setG(boolean g) {
        this.g = g;
    }

    public boolean isXg() {
        return xg;
    }

    public void setXg(boolean xg) {
        this.xg = xg;
    }

    public boolean isSeg() {
        return seg;
    }

    public void setSeg(boolean seg) {
        this.seg = seg;
    }

    public boolean isTer() {
        return ter;
    }

    public void setTer(boolean ter) {
        this.ter = ter;
    }

    public boolean isQua() {
        return qua;
    }

    public void setQua(boolean qua) {
        this.qua = qua;
    }

    public boolean isQui() {
        return qui;
    }

    public void setQui(boolean qui) {
        this.qui = qui;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isSab() {
        return sab;
    }

    public void setSab(boolean sab) {
        this.sab = sab;
    }

    public boolean isDom() {
        return dom;
    }

    public void setDom(boolean dom) {
        this.dom = dom;
    }

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }

   
}
