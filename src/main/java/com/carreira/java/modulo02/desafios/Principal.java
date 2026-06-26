package com.carreira.java.modulo02.desafios;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoaJoao = new Pessoa();

        pessoaJoao.nome = "João Machado";
        pessoaJoao.idade = 27;
        pessoaJoao.nacionalidade = "Brasil";
        pessoaJoao.altura = 1.76;
        pessoaJoao.peso = 80.5;
        pessoaJoao.sexo = "masculino";
        pessoaJoao.trabalhaRegistrado = false;

        pessoaJoao.imprimir();
    }
}
