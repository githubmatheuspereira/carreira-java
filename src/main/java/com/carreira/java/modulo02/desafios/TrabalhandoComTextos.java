package com.carreira.java.modulo02.desafios;

import java.text.MessageFormat;

public class TrabalhandoComTextos {

    static public void main(String args[]) {

        System.out.println("Modos diferentes para \"printar\" um texto:");
        printarComAspasDuplas();
        printarComAspasSimples();
        printarComTextBlocks();
        printarComFormatadores();
        printarComStringFormat();
        printarComMessageFormat();

    }

    static void printarComAspasDuplas() {

        separador();

        System.out.println("Este é um print simples com aspas duplas!");
    }

    static void printarComAspasSimples() {

        separador();

        System.out.println("Abaixo há três prints com aspas simples. Aspas simples são especialmente para um único caractere (CHAR)");
        System.out.println('A');
        System.out.println('B');
        System.out.println('C');
    }

    static void printarComTextBlocks() {

        separador();

        System.out.println("""
                Este é um TextBlock
                Ele preserva
                    a formatação
                        que você definiu na string!
                Muito mais prático!
        """);
    }

    static void printarComFormatadores() {

        separador();

        String var1 = "João";
        String var2 = "Joãozinho";

        System.out.println("Aqui estamos utilizando o printf!");
        System.out.printf("O nome dele é %s, e o apelido é %s%n",  var1, var2);
        System.out.println("Utilizamos %s para String, %d para inteiros, %n para quebra de linha.");
    }

    static void printarComStringFormat() {

        separador();

        String var1 = "João";
        String var2 = "Joãozinho";

        System.out.println("Aqui estamos utilizando o String.format!");
        String msg = String.format("O nome dele é %s, e o apelido é %s",   var1, var2);
        System.out.println(msg);
    }

    static void printarComMessageFormat() {

        separador();

        System.out.println("Os dois ultimos são MessageFormat.\n");
        System.out.println("Aqui temos passagem direta de argumentos!");
        String padrao = "Olá, {0}! Meu nome é {1}, e meu apelido é {2}.";
        String msg = MessageFormat.format(padrao, "Desenvolvedor", "João", "Joãozinho");
        System.out.println(msg);

        System.out.println("\nAqui temos passagem por um Array");
        Object[] padrao2 = {"Desenvolvedor", "FullStack"};
        String msg2 = MessageFormat.format("Eu sou um {0}, e trabalho como {1}.", padrao2);
        System.out.println(msg2);

    }

    static void separador() {
        System.out.println("==================================================");
    }
}
