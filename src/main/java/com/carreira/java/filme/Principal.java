package com.carreira.java.filme;

public class Principal {

    public static void main(String[] args) {
        Filme interstellar = new Filme();
        interstellar.nome = "Interstellar";
        interstellar.anoDeLancamento = 2000;
        interstellar.incluidoNoPlano = true;

        interstellar.avalia(10);
        interstellar.avalia(8);
        interstellar.avalia(10);
        interstellar.avalia(8);

        interstellar.exibeInformacoes();

    }

}
