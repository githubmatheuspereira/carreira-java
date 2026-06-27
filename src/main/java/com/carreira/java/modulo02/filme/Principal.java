package com.carreira.java.modulo02.filme;

public class Principal {

    public static void main(String[] args) {
        Filme interstellar = new Filme();
        interstellar.nome = "Interstellar";
        interstellar.anoDeLancamento = 2000;
        interstellar.incluidoNoPlano = true;
        interstellar.duracaoEmMinutos = 180;

        interstellar.avalia(10);
        interstellar.avalia(8);
        interstellar.avalia(10);
        interstellar.avalia(8);


        interstellar.exibeInformacoes();

    }

}
