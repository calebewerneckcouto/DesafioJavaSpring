package com.cwcdev.desafio;

import com.cwcdev.desafio.entities.Pedido;
import com.cwcdev.desafio.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private PedidoService pedidoService;

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Pedido pedido1 = new Pedido("1034", 150.0); // 20% desconto
        Pedido pedido2 = new Pedido("2282", 800.0); // 10% desconto
        Pedido pedido3 = new Pedido("1309", 95.90); // 0% desconto

        pedidoService.processarPedido(pedido1);
        pedidoService.processarPedido(pedido2);
        pedidoService.processarPedido(pedido3);
    }
}
