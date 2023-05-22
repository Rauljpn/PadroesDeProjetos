package org.example;

import org.example.model.PessoaFisica;
import org.example.model.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica(5000.0, 500.0, 200.0);
        double impostoPF = pessoaFisica.calcularImpostos();

        System.out.println("Imposto de Pessoa Física: R$ " + impostoPF);

        // Cria uma instância de PessoaJuridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica(10000.0, 1000.0, 500.0);
        double impostoPJ = pessoaJuridica.calcularImpostos();

        System.out.println("Imposto de Pessoa Jurídica: R$ " + impostoPJ);
    }
}