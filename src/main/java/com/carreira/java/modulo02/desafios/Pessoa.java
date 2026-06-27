package com.carreira.java.modulo02.desafios;

public class Pessoa {

    String nome;
    int idade;
    double altura;
    double peso;
    String sexo;
    String nacionalidade;
    boolean trabalhaRegistrado;

    void imprimir() {
        System.out.printf("Olá, mundo!\nEu sou o %s, tenho %d anos e nasci no %s.\nTenho %.2f de altura e peso %.3fkg.\nSou do sexo %s.\nAtualmente eu estou %s", nome, idade, nacionalidade, altura, peso, sexo, trabalhando());
    }

    String trabalhando() {
        if (trabalhaRegistrado) {
            return "trabalhando e progredindo!";
        } else {
            return "desempregado, mas estou à procura de um emprego.";
        }

    }

}
