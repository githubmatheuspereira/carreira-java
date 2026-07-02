package com.carreira.java.modulo02.filme;

public class Principal {

    public static void main(String[] args) {
//        Filme interstellar = new Filme();
//        interstellar.nome = "Interstellar";
//        interstellar.anoDeLancamento = 2000;
//        interstellar.incluidoNoPlano = true;
//        interstellar.duracaoEmMinutos = 180;
//        interstellar.setDiretor("Christopher Edward Nolan");
//
//        interstellar.avalia(10);
//        interstellar.avalia(8);
//        interstellar.avalia(10);
//        interstellar.avalia(8);
//
//
//        interstellar.exibeInformacoes();

        Serie friends = new Serie();
        friends.nome = "Friends";
        friends.anoDeLancamento = 1994;
        friends.incluidoNoPlano = true;
        friends.setEpisodiosPorTemporada(23);
        friends.setMinutosPorEpisodio(25);
        friends.setAtiva(true);

        friends.exibeInformacoesSerie();

    }

}
