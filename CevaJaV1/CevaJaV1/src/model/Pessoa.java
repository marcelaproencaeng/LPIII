package model;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa {

    //instanciar pessoa-instanciar usuario ou pessoa

    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;

    private String documento;

    public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco, String documento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.documento = documento;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return documento.equals(pessoa.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
}

