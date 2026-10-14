package com.carreira.java.modulo02.animal;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(String somAnimal) {
        System.out.println("O cachorro faz " + somAnimal);
    }

}
