package org.example.model;

import org.example.strategy.CalculadorImposto;
import org.example.strategy.ImpostoPessoaFisica;

public class PessoaFisica extends Pessoa{
    public PessoaFisica(double salarioBruto, double gastosSaude, double gastosEducacao) {
        super(salarioBruto, gastosSaude, gastosEducacao);
    }

    @Override
    protected CalculadorImposto criarImpostoStrategy() {
        return new ImpostoPessoaFisica();
    }
}
