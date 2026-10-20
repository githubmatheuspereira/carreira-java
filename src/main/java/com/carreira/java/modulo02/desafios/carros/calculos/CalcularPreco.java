package com.carreira.java.modulo02.desafios.carros.calculos;

import com.carreira.java.modulo02.desafios.carros.Carro;

public class CalcularPreco {

    public void exibirInfo(Carro carro) {

        System.out.println("Menor Preço: " + calcularMenorPreco(carro));
        System.out.println("Maior Preço: " + calcularMaiorPreco(carro));
    }

    public double calcularMenorPreco(Carro carro) {
        double menorPreco = carro.getPrecoAno1();

        if (carro.getPrecoAno2() < menorPreco) {
            menorPreco = carro.getPrecoAno2();
        }

        if (carro.getPrecoAno3() < menorPreco) {
            menorPreco = carro.getPrecoAno3();
        }

        return menorPreco;
    }

    public double calcularMaiorPreco(Carro carro) {
        double maiorPreco = carro.getPrecoAno1();

        if (carro.getPrecoAno2() > maiorPreco) {
            maiorPreco = carro.getPrecoAno2();
        }

        if (carro.getPrecoAno3() > maiorPreco) {
            maiorPreco = carro.getPrecoAno3();
        }

        return maiorPreco;
    }

}
