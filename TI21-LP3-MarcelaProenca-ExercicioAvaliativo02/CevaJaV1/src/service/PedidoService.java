package service;

import Enuns.StatusPedido;
import model.Pedido;
import model.Pessoa;


public class PedidoService {


    public boolean efetuarPedido(Pedido pedido1, Pedido pedido2, Pedido pedido3, Pedido pedido4) throws RuntimeException {
        PedidoService service = new PedidoService();
        service.efetuarPedido(pedido1, pedido2, pedido3, pedido4);
        if (Pessoa.pedidoAceito()==true) {
            return true;


        } else {
            return false;
        }
    }

}
