package com.carreira.java.modulo02.filme;

public class Filme extends Titulo {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    void exibeInformacoes() {
        System.out.printf("Nome do filme: %s\nDiretor: %s\nAno de Lançamento: %d\nIncluído no plano: %b\nDuração: %s\n", nome, getDiretor(), anoDeLancamento, incluidoNoPlano, duracao());
        System.out.println("Média de avaliações: " + calculaAvaliacao());
    }

}
