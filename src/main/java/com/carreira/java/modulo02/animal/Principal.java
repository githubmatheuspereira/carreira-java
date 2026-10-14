package com.carreira.java.modulo02.animal;

public class Principal {

    public static void main(String[] args) {

        Gato gato = new Gato();

        gato.setEspecieAnimal("Gato selvagem");
        gato.setCorAnimal("Amarelo e Branco");
        gato.setHabitoAlimentar("Carnívoro");
        gato.setSomAnimal("miau, miau!");

        Cachorro cachorro = new Cachorro();

        cachorro.setEspecieAnimal("Cachorro do mato");
        cachorro.setCorAnimal("Caramelo Queimado");
        cachorro.setHabitoAlimentar("Herbívoro");
        cachorro.setSomAnimal("ruff, ruff, auuuuuu!");

        cachorro.apresentacao();

    }

}
