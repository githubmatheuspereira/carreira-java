package com.carreira.java.modulo02.filme;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    void exibeInformacoesSerie() {
        System.out.printf("Nome da série: %s\nAno de Lançamento: %d\nIncluído no plano: %b\nEpisódio por temporada: %d\nMinutos por episódio: %d\nEstá ativa: %b", nome, anoDeLancamento, incluidoNoPlano, getEpisodiosPorTemporada(), getMinutosPorEpisodio(), isAtiva());

    }

}
