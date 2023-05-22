package org.example.model;

import org.example.strategy.CalculadorImposto;

public abstract class Pessoa {
    protected double salarioBruto;
    protected double gastosSaude;
    protected double gastosEducacao;

    public Pessoa(double salarioBruto, double gastosSaude, double gastosEducacao) {
        this.salarioBruto = salarioBruto;
        this.gastosSaude = gastosSaude;
        this.gastosEducacao = gastosEducacao;
    }
    public double calcularImpostos() {
        CalculadorImposto impostoStrategy = criarImpostoStrategy();
        return impostoStrategy.calcularImposto(salarioBruto, gastosSaude, gastosEducacao);
    }

    protected abstract CalculadorImposto criarImpostoStrategy();
}
