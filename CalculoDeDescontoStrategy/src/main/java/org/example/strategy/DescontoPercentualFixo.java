package org.example.strategy;

public class DescontoPercentualFixo implements CalculadorDesconto {

    private double descontoPercentual;

    public DescontoPercentualFixo(double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }

    @Override
    public double calcularDesconto(double valorCompra, String aniversarioCliente) {
        return valorCompra * descontoPercentual;
    }
}
