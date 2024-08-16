package com.cwcdev.desafio.services;

import org.springframework.stereotype.Component;

@Component
public class Frete {

    public double calcularFrete(double valorCompra) {
        if (valorCompra < 100) {
            return 20.0; // Frete para valores menores que R$ 100
        } else if (valorCompra >= 100 && valorCompra < 200) {
            return 12.0; // Frete para valores entre R$ 100 e R$ 199.99
        }
        return 0.0; // Frete grátis para valores maiores ou iguais a R$ 200
    }
}
