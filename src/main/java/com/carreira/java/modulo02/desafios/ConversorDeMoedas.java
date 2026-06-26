package com.carreira.java.modulo02.desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorDeMoedas {

    private static final double VALOR_DOLAR_EM_REAIS = 5.1;
    private static final double VALOR_TAXA = 0.03;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorEmDolar;
        boolean retriver = true;

        System.out.println("Casa de Câmbio");

        while (retriver) {

            try {
                System.out.println("Quanto que você quer em dolar?");
                valorEmDolar = sc.nextDouble();

                double cambio = calcularCambio(valorEmDolar);
                double taxa = calcularTaxa(cambio);
                double valorTotal = valorTotal(cambio, taxa);

                System.out.printf("Valor solicitado: U$ %.2f%n", valorEmDolar);
                System.out.printf("Valor em real: R$ %.2f%n", cambio);
                System.out.printf("Valor da taxa: R$ %.2f%n", taxa);
                System.out.printf("Valor total a pagar em reais: %.2f%n", valorTotal);

                retriver = false;

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas número válidos");
                sc.next();
            }
        }

        sc.close();
    }

    public static double calcularCambio(double valorEmDolar) {
        return valorEmDolar * VALOR_DOLAR_EM_REAIS;
    }

    public static double calcularTaxa(double cambio) {
        return cambio * VALOR_TAXA;
    }

    public static double valorTotal(double cambio, double taxa) {
        return cambio + taxa;
    }

}