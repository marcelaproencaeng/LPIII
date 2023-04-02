package model;

import Enuns.FormaPagamento;
import Enuns.StatusPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private Usuario usuario;
    private List<Produto> produtos;
    private LocalDateTime dataPedido;
    private StatusPedido status;
    private FormaPagamento formaPagamento;

    public Pedido(long id, Usuario usuario, List<Produto> produtos, LocalDateTime dataPedido, StatusPedido status, FormaPagamento formaPagamento) {
        this.id = id;
        this.usuario = usuario;
        this.produtos = produtos;
        this.dataPedido = LocalDateTime.now();
        this.status = StatusPedido.CRIADO;
        this.formaPagamento = FormaPagamento.CARTAO;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setLocalDateTime(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;

    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal calcularValorTotal() {
// TODO Percorrer a Lista de Produtos e somar todos os valores
        // A soma desses valores deve ser retornado, representando o valor total do Pedido
        BigDecimal valorTotalPedido = BigDecimal.ZERO;
        for (Produto produto : produtos) {
            // valorTotalPedido = (valorTotalPedido + produto.getValor());
            System.out.println(produto.getNome());
            // Somar todos os produtos
            valorTotalPedido = valorTotalPedido.add(produto.getValor());


        }

        return valorTotalPedido;
    }
}

//BigDecimal big1 = new BigDecimal("0.1");
//BigDecimal big2 = new BigDecimal("0.2");
//BigDecimal bigResult = big1.add(big2);
//System.out.println(bigResult.toString());



