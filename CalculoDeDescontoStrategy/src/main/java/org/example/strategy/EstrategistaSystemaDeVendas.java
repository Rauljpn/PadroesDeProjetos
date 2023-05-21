package org.example.strategy;

public class EstrategistaSystemaDeVendas {
    private CalculadorDesconto calculadorDesconto;
    public EstrategistaSystemaDeVendas(CalculadorDesconto calculadorDesconto) {
        this.calculadorDesconto = calculadorDesconto;
    }

    public void setCalculadorDesconto(CalculadorDesconto calculadorDesconto) {
        this.calculadorDesconto = calculadorDesconto;
    }

    public double calcularDesconto(double valorCompra, String aniversarioCliente){
        return calculadorDesconto.calcularDesconto(valorCompra, aniversarioCliente);
    }
}
