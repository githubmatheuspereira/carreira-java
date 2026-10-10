package com.carreira.java.modulo02.filme.calculos;

import com.carreira.java.modulo02.filme.Filme;
import com.carreira.java.modulo02.filme.Serie;
import com.carreira.java.modulo02.filme.Titulo;

public class CalculadoraDeTempo {

    int totalMinutos = 0;

    public void inclui(Titulo titulo){
        totalMinutos += titulo.getDuracaoEmMinutos();
    }

    public void tempoParaMaratonar() {

        int horas = totalMinutos / 60;
        int minutosRestantes = totalMinutos % 60;

        System.out.println("\nTotal: " + horas + "h" + minutosRestantes + "m");
    }

}
