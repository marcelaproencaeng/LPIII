package model;

import java.time.LocalDate;

public class Usuario extends Pessoa {

    private String userName;
    private String senha;

    public Usuario(String nome, LocalDate dataNascimento, Endereco endereco, String documento, String userName, String senha) {
        super(nome, dataNascimento, endereco, documento);
        this.userName = userName;
        this.senha = senha;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
