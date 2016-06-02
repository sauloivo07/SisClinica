/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Saulo
 */
@Entity
@Table (name = "Pacientes")
public class Pacientes implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column (name = "pac_nome", length = 100)
    private String nome;
    @Column (name = "pac_dataNasc", length = 10)
    private Date dataNasc;
    @Column (name = "pac_rg", length = 15)
    private String rg;
    @Column (name = "pac_tel", length = 15)
    private String tel;
    @Column (name = "pac_rua", length = 45)
    private String rua;
    @Column (name = "pac_complemento", length = 35)
    private String complemento;
    @Column (name = "pac_cep", length = 20)
    private String cep;
    @Column (name = "pac_num", length = 20)
    private String num;
    
    @ManyToOne
    @JoinColumn(name = "pac_bairro")
    private Bairro bairro;

    public Pacientes() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    
    
}
