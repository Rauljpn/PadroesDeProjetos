package org.example.strategy;

public class ImpostoPessoaJuridica implements CalculadorImposto {
    private static final double IRPJ = 0.15;
    private static final double CSLL = 0.09;
    private static final double ICMS = 0.05;
    private static final double LIMITE_IRPJ = 20000.0;
    @Override
    public double calcularImposto(double salarioBruto, double gastosSaude, double gastosEducacao) {
        double lucro = salarioBruto - (salarioBruto * CSLL);
        double impostoIRPJ = lucro * IRPJ;
        if (impostoIRPJ > LIMITE_IRPJ) {
            double excedente = impostoIRPJ - LIMITE_IRPJ;
            impostoIRPJ = LIMITE_IRPJ + (excedente * 0.1);
        }
        return impostoIRPJ + (salarioBruto * ICMS);
    }
}
