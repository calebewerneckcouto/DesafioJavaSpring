package com.cwcdev.desafio.entities;

public class Pedido {

    private String codigo;
    private double valorTotal;

    public Pedido() {
    }

    public Pedido(String codigo, double valorTotal) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido Código: " + codigo + ", Valor Total: R$ " + valorTotal;
    }
}
