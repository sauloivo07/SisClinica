/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Saulo
 */

@Entity
@Table(name="Usuarios")
public class Usuarios {
    
    @Id
    @Column(name = "usu_cod")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "usu_login")
    private String login;
    @Column(name = "usu_nome")
    private String nome;
    @Column(name = "usu_senha")
    private String senha;
    @Column(name = "usu_tipo")
    private String tipo;

    public Usuarios() {
    }

    public Usuarios(String login, String nome, String senha, String tipo) {
        this.login = login;
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
