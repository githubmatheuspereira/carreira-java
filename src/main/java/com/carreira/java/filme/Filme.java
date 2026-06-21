package com.carreira.java.filme;

public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeInformacoes() {
        System.out.printf("Nome do filme: %s\nAno de Lançamento: %d\nIncluído no plano: %b\nDuração: %d\n", nome, anoDeLancamento, incluidoNoPlano, duracaoEmMinutos);
        System.out.println("Média de avaliações: " + calculaAvaliacao());
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double calculaAvaliacao() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
