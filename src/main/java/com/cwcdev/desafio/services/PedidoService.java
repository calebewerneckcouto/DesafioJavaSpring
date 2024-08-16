package com.cwcdev.desafio.services;

import com.cwcdev.desafio.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private Desconto desconto;

    @Autowired
    private Frete frete;

    public void processarPedido(Pedido pedido) {
        double valorCompra = pedido.getValorTotal();
        double percentualDesconto = desconto.calcularDescontoPercentual(valorCompra);
        double descontoCalculado = valorCompra * percentualDesconto;
        double freteCalculado = frete.calcularFrete(valorCompra);

        double valorFinal = valorCompra - descontoCalculado + freteCalculado;

        System.out.println("Pedido Código: " + pedido.getCodigo() + ", Valor Total: R$ " + valorCompra);
        System.out.println("Desconto aplicado: R$ " + descontoCalculado);
        System.out.println("Frete: R$ " + freteCalculado);
        System.out.println("Valor Final: R$ " + valorFinal);
        System.out.println();
    }
}
