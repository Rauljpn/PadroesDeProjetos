package org.example;

import org.example.strategy.DescontoPercentualFixo;
import org.example.strategy.EstrategistaSystemaDeVendas;

public class Main {
    public static void main(String[] args) {
        EstrategistaSystemaDeVendas estrategista = new EstrategistaSystemaDeVendas(new DescontoPercentualFixo(0.1));
        Interface inter = new Interface(estrategista);
        inter.desconto();
    }
}