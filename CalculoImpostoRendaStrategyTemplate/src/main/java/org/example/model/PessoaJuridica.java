package org.example.model;

import org.example.strategy.CalculadorImposto;
import org.example.strategy.ImpostoPessoaJuridica;

public class PessoaJuridica extends Pessoa {
    public PessoaJuridica(double salarioBruto, double gastosSaude, double gastosEducacao) {
        super(salarioBruto, gastosSaude, gastosEducacao);
    }

    @Override
    protected CalculadorImposto criarImpostoStrategy() {
        return new ImpostoPessoaJuridica();
    }
}
