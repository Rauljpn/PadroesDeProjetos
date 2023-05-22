package org.example.strategy;

public class ImpostoPessoaFisica implements CalculadorImposto {
    private static final double IRPF = 0.11;
    private static final double INSS = 0.11;
    private static final double DEPENDENTE = 189.59;
    @Override
    public double calcularImposto(double salarioBruto, double gastosSaude, double gastosEducacao) {
        double calculoBase = salarioBruto - DEPENDENTE - (salarioBruto * INSS);
        return (calculoBase * IRPF) - (gastosSaude + gastosEducacao);
    }
}
