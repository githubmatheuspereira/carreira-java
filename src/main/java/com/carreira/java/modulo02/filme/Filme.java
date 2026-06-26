package com.carreira.java.modulo02.filme;

public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeInformacoes() {
        System.out.printf("Nome do filme: %s\nAno de Lançamento: %d\nIncluído no plano: %b\nDuração: %s\n", nome, anoDeLancamento, incluidoNoPlano, duracao());
        System.out.println("Média de avaliações: " + calculaAvaliacao());
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double calculaAvaliacao() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    String duracao() {
        return duracaoEmMinutos + " minutos";
    }
}
