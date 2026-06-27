package com.carreira.java.modulo02.desafios;

public class Musica {

    private String nomeMusica;
    private String nomeArtista;
    private int anoLancamento;
    private double duracao;
    private String participacao;
    private String produtorMusical;

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getParticipacao() {
        return participacao;
    }

    public void setParticipacao(String participacao) {
        this.participacao = participacao;
    }

    public String getProdutorMusical() {
        return produtorMusical;
    }

    public void setProdutorMusical(String produtorMusical) {
        this.produtorMusical = produtorMusical;
    }

    public void exibirInformacao() {
        System.out.printf("\nNome da música: %s\nNome do Artista: %s\nLançamento: %d\nDuração: %.2f\n%s%s",getNomeMusica(), getNomeArtista(), getAnoLancamento(), getDuracao(), adicionarParticipacao(participacao), adicionarProdutorMusical(produtorMusical));
    }

    private String adicionarParticipacao(String participacao) {
        if (participacao != null) {
            return "Participação: " + participacao + "\n";
        }
        return "";
    }

    private String adicionarProdutorMusical(String produtorMusical) {
        if (produtorMusical != null) {
            return "Produtor/DJ: " + produtorMusical + "\n";
        }
        return "";
    }



}
