package com.carreira.java.modulo02.animal;

public class Animal {

    private String somAnimal;
    private String corAnimal;
    private String habitoAlimentar;
    private String especieAnimal;

    public void apresentacao() {

        System.out.printf("Espécie: %s%nCor: %s%nHabito alimentar: %s%n", especieAnimal, corAnimal,habitoAlimentar);
        emitirSom(somAnimal);

    }

    public void emitirSom(String somAnimal) {

    }

    public String getSomAnimal() {
        return somAnimal;
    }

    public void setSomAnimal(String somAnimal) {
        this.somAnimal = somAnimal;
    }

    public String getCorAnimal() {
        return corAnimal;
    }

    public void setCorAnimal(String corAnimal) {
        this.corAnimal = corAnimal;
    }

    public String getHabitoAlimentar() {
        return habitoAlimentar;
    }

    public void setHabitoAlimentar(String habitoAlimentar) {
        this.habitoAlimentar = habitoAlimentar;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(String especie) {
        this.especieAnimal = especie;
    }
}
