package com.carreira.java;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {

    private static final Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        saudacoes();
        jogar();
        ler.close();
    }

    public static int GeradorDeNumeroAleatorio() {
        return new Random().nextInt(100);

    }

    public static void saudacoes() {
        System.out.println("""
                Olá, seja bem vindo!
                Este é um jogo de adivinhação.
                Tente acertar qual número que é!""");
    }

    public static int pegarNumeroDigitado() {
        System.out.print("Digite um número entre 0 e 100: ");
        return ler.nextInt();
    }

    public static void jogar() {
        boolean repeat = true;
        int numRandom = GeradorDeNumeroAleatorio();

        while (repeat) {

            try {
                int num = pegarNumeroDigitado();

                if (num < 0  || num > 100) {
                    throw new Exception();
                }

                if (num < numRandom) {
                    System.out.println("Número secreto é maior!");
                } else if (num > numRandom) {
                    System.out.println("Número secreto é menor!");
                } else {
                    System.out.println("Parabéns, você acertou!");
                    repeat = false;
                }

            } catch (Exception e) {
                System.out.println("Digite um número válido!\n");
                ler.nextLine();
            }

        }

    }



}