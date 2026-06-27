package com.carreira.java.modulo02.desafios;

public class Musica {

    String nomeMusica;
    String nomeArtista;
    int anoLancamento;
    double duracao;
    String participacao;
    String produtorMusical;

    void exibirInformacao() {
        System.out.printf("\nNome da música: %s\nNome do Artista: %s\nLançamento: %d\nDuração: %.2f\n%s%s",nomeMusica, nomeArtista, anoLancamento, duracao, adicionarParticipacao(participacao), adicionarProdutorMusical(produtorMusical));
    }

    String adicionarParticipacao(String participacao) {
        if (participacao != null) {
            String part = participacao;
            return "Participação: " + participacao + "\n";
        }
        return "";
    }

    String adicionarProdutorMusical(String produtorMusical) {
        if (produtorMusical != null) {
            String produtor = produtorMusical;
            return "Produtor/DJ: " + produtorMusical + "\n";
        }
        return "";
    }

}
