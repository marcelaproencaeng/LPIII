import Enuns.FormaPagamento;
import Enuns.StatusPedido;
import Enuns.TipoCerveja;
import model.*;
import service.PedidoService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Aplication {
    public static void main(String[] args) {
        //criar usuario
        //criar produto
        //criar pedido

        //Criando usuário

        Endereco enderecoLucas = new Endereco("Rua Getúlio Vargas", 1000, "apto 302", "90850120");
        Endereco enderecoMarcela = new Endereco("Rua Barão do Amazonas", 1000, "apto 205", "90040-000");
        Endereco enderecoJoao = new Endereco("Rua Barão do Guaíba", 430, "apto 406", "90040-130");
        Endereco enderecoMaria = new Endereco("José de Alencar", 400, "708", "90550110");


        Usuario usuario = new Usuario("Lucas", LocalDate.of(1987, 7, 27),
                enderecoLucas, "11111111", "lucas.nunes", "123456");

        Usuario usuario2 = new Usuario("Marcela", LocalDate.of(1988, 10, 12),
                enderecoMarcela, "98870216", "marcela.proenca", "223787");
        Usuario usuario3 = new Usuario("João", LocalDate.of(1999, 5, 18),
                enderecoJoao, "10284736", "joao.matos", "90840150");
        Usuario usuario4 = new Usuario("Maria", LocalDate.of(2000, 10, 02),
                enderecoMaria, "98990216", "maria.machado", "223387");

        //Criando lista de produtos

        List<Produto> produtos = new LinkedList<>();

        Produto produto1 = new Cerveja("Cerveja Polar", new BigDecimal(8),
                LocalDate.of(2020, 1, 1), LocalDate.of(2023, 1, 1),
                "Brasil", TipoCerveja.PILSEN, 5, 600);

        Produto produto2 = new Cerveja("Cerveja Stella-Artois", new BigDecimal(9), LocalDate.of(1987, 01, 10),
                LocalDate.of(2022, 05, 10), "Bélgica",
                TipoCerveja.IPA, 6, 350);

        Produto produto3 = new Cerveja("BudWeiser", new BigDecimal(6),
                LocalDate.of(2022, 02, 4), LocalDate.of(2023, 10, 12),
                "República Tcheca", TipoCerveja.PILSEN, 5, 350);

        Produto produto4 = new Cerveja("Amstel", new BigDecimal(8),
                LocalDate.of(2022, 6, 12), LocalDate.of(2023, 10, 12), "Holanda",
                TipoCerveja.PILSEN, 6,
                350);

        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto1);
        produtos.add(produto2);
        System.out.println(produtos);

        //Criando pedidos

        Pedido pedido2 = new Pedido(15783, usuario2, Arrays.asList(produto1, produto2),
                LocalDateTime.of(LocalDate.of(2023, 02, 11), LocalTime.of(10, 30, 15)),
                StatusPedido.DISPONIVEL_RETIRADA, FormaPagamento.PIX);
        Pedido pedido1 = new Pedido(12673, usuario, Arrays.asList(produto1, produto2),
                LocalDateTime.of(LocalDate.of(2023, 02, 1), LocalTime.of(14, 15, 15)),
                StatusPedido.ENTREGUE, FormaPagamento.DINHEIRO);
        Pedido pedido3 = new Pedido(12345, usuario, Arrays.asList(produto3, produto4),
                LocalDateTime.of(LocalDate.of(2023, 03, 10), LocalTime.of(15, 30, 15)),
                StatusPedido.EM_PREPARO, FormaPagamento.CARTAO);
        Pedido pedido4 = new Pedido(17253, usuario, Arrays.asList(produto1, produto4),
                LocalDateTime.of(LocalDate.of(2023, 03, 10), LocalTime.of(15, 30, 15)),
                StatusPedido.EM_PREPARO, FormaPagamento.CARTAO);

        PedidoService service = new PedidoService();
        service.efetuarPedido(pedido1);
        service.efetuarPedido(pedido2);

        //Calculo Bigdecimal

        BigDecimal big1 = new BigDecimal("0.1");
        BigDecimal big2 = new BigDecimal("0.2");
        BigDecimal bigResult = big1.add(big2);

        System.out.println(bigResult.toString());


        //BigDecimal bd =Bigdecimal.valueOf(1.555d);
        // System.out.println("bd="+bd);
        //bd = bd.setScale(2, RoundingMode, HALF_UP);
        //System.out.println("after rouding bd=" + bd);

        //double d = bd.doubleValue();
        //System.out.println("after rounding d=" + d);

    }
}



