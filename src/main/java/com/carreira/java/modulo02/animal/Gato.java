package com.carreira.java.modulo02.animal;

public class Gato extends Animal {

    @Override
    public void emitirSom(String somAnimal) {
        System.out.println("O gato faz " + somAnimal);
    }

}
