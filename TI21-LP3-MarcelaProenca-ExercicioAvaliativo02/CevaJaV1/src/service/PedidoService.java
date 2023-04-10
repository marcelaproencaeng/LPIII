package service;

import Enuns.StatusPedido;
import model.Pedido;
import model.Pessoa;


public class PedidoService {


    public void efetuarPedido(Pedido pedido) {

        System.out.println("Pedido #:" + pedido.getId() + "efetuado com sucesso!");
        System.out.println("Valor total:" + pedido.calcularValorTotal());
    }
}
