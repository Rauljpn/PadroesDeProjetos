package org.example.strategy;

public class DescontoPercentualProgressivo implements CalculadorDesconto {
    @Override
    public double calcularDesconto(double valorCompra, String aniversarioCliente) {
        double descontoPercentualMaximo = Math.min(valorCompra/25, 0.2);
        return valorCompra * descontoPercentualMaximo;
    }
}
