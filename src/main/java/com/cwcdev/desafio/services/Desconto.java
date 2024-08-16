package com.cwcdev.desafio.services;

import org.springframework.stereotype.Component;

@Component
public class Desconto {

    public double calcularDescontoPercentual(double valorCompra) {
        if (valorCompra >= 800) {
            return 0.10; // 10% de desconto para valores iguais ou maiores que R$ 800
        } else if (valorCompra >= 100 && valorCompra < 200) {
            return 0.20; // 20% de desconto para valores entre R$ 100 e R$ 199.99
        }
        return 0.0; // Nenhum desconto para valores menores que R$ 100 ou entre R$ 200 e R$ 799.99
    }
}
