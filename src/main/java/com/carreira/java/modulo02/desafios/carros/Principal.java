package com.carreira.java.modulo02.desafios.carros;

import com.carreira.java.modulo02.desafios.carros.calculos.CalcularPreco;

public class Principal {

    public static void main(String[] args) {
        ModeloCarro skylineR34 = new ModeloCarro();
        CalcularPreco calculadora = new CalcularPreco();

        skylineR34.setMontadora("Nissan");
        skylineR34.setCor("Azul Perolizado");
        skylineR34.setAnoFabricacao(1999);
        skylineR34.setNomeModelo("Skyline GT-R - R34");
        skylineR34.setTipoCombustivel("Gasolina");
        skylineR34.setQuantidadePortas(2);
        skylineR34.setPotencia(2600);
        skylineR34.setPrecoAno1(45000);
        skylineR34.setPrecoAno2(49000);
        skylineR34.setPrecoAno3(85000);

        ModeloCarro porsche911 = new ModeloCarro();
        porsche911.setMontadora("Porsche");
        porsche911.setCor("Verde Python");
        porsche911.setAnoFabricacao(2023);
        porsche911.setNomeModelo("911 GT3 RS");
        porsche911.setTipoCombustivel("Gasolina");
        porsche911.setQuantidadePortas(2);
        porsche911.setPotencia(4000);
        porsche911.setPrecoAno1(1950000);
        porsche911.setPrecoAno2(2230000);
        porsche911.setPrecoAno3(2750000);

        skylineR34.espec();
        porsche911.espec();
        calculadora.exibirInfo(porsche911);


    }

}

