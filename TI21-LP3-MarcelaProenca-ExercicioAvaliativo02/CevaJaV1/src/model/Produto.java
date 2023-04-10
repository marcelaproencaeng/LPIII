package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Produto {


    private String nome;
    private BigDecimal valor;

    private LocalDate dataFabricacao;

    private LocalDate dataVencimento;

    private String origem;


    public Produto(String nome, BigDecimal valor, LocalDate dataFabricacao, LocalDate dataVencimento, String origem) {
        this.nome = nome;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
        this.origem = origem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", dataFabricacao=" + dataFabricacao +
                ", dataVencimento=" + dataVencimento +
                ", origem='" + origem + '\'' +
                '}';
    }
}
