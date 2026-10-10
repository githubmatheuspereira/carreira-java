package com.carreira.java.modulo02.filme;

public class Titulo {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double calculaAvaliacao() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    int duracao() {
        return duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
