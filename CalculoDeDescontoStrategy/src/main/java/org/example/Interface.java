package org.example;

import org.example.strategy.*;

import java.util.Scanner;

public class Interface {
    private EstrategistaSystemaDeVendas estrategista;

    public Interface(EstrategistaSystemaDeVendas estrategista) {
        this.estrategista = estrategista;
    }

    public void desconto(){
        Scanner scanner = new Scanner(System.in);
        double valorCompra;
        String aniversarioCliente;

        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a data de aniversário do cliente (ou deixe em branco): ");
        aniversarioCliente = scanner.nextLine();

        System.out.print("Escolha o tipo de desconto (1 - Desconto Fixo, 2 - Desconto Progressivo, 3 - Desconto de Aniversário): ");
        int tipoDesconto = scanner.nextInt();

        CalculadorDesconto calculadorDesconto;

        switch (tipoDesconto) {
            case 1:
                calculadorDesconto = new DescontoPercentualFixo(0.1);
                break;
            case 2:
                calculadorDesconto = new DescontoPercentualProgressivo();
                break;
            case 3:
                calculadorDesconto = new DescontoDeAniversario();
                break;
            default:
                System.out.println("Tipo de desconto inválido. Usando desconto fixo de 10%.");
                calculadorDesconto = new DescontoPercentualFixo(0.1);
                break;
        }

        estrategista.setCalculadorDesconto(calculadorDesconto);

        double desconto = estrategista.calcularDesconto(valorCompra, aniversarioCliente);
        double valorTotal = valorCompra - desconto;

        System.out.printf("Valor da compra: R$%.2f%n", valorCompra);
        System.out.printf("Desconto aplicado: R$%.2f%n", desconto);
        System.out.printf("Valor total: R$%.2f%n", valorTotal);

        scanner.close();
    }
}
