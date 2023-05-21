package org.example.strategy;

public class DescontoDeAniversario implements CalculadorDesconto {
    @Override
    public double calcularDesconto(double valorCompra, String aniversarioCliente) {
        if(aniversarioCliente != null){
            return valorCompra * 0.15;
        }
        return 0;
    }
}
