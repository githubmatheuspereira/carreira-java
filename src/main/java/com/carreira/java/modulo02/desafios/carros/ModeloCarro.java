package com.carreira.java.modulo02.desafios.carros;

import com.carreira.java.modulo02.desafios.carros.calculos.CalcularPreco;

public class ModeloCarro extends Carro {

    private String nomeModelo;
    private String tipoCombustivel;
    private int quantidadePortas;
    private int potencia;


    public void espec() {
        System.out.printf("\n--- %s (%d) ---\nMontadora: %s\nCor: %s\nCombustível: %s\nPortas: %d\nPotência: %dcc\n"
                ,getNomeModelo()
                ,getAnoFabricacao()
                ,getMontadora()
                ,getCor()
                ,getTipoCombustivel()
                ,getQuantidadePortas()
                ,getPotencia());
    }


    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
