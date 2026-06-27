package com.carreira.java.modulo02.desafios;

public class Calculadora {

    void somar(double num1, double num2) {
        double total = num1 + num2;
        System.out.printf("\nA soma de %.2f + %.2f é %.2f", num1, num2, total);
    }

    void subtrair(double num1, double num2) {
        double total = num1 - num2;
        System.out.printf("\nA subtração de %.2f - %.2f é %.2f", num1, num2, total);
    }

}
