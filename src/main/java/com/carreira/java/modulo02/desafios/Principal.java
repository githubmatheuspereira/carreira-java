package com.carreira.java.modulo02.desafios;

public class Principal {
    public static void main(String[] args) {
//        Pessoa pessoaJoao = new Pessoa();
//
//        pessoaJoao.nome = "João Machado";
//        pessoaJoao.idade = 27;
//        pessoaJoao.nacionalidade = "Brasil";
//        pessoaJoao.altura = 1.76;
//        pessoaJoao.peso = 80.5;
//        pessoaJoao.sexo = "masculino";
//        pessoaJoao.trabalhaRegistrado = false;
//
//        pessoaJoao.imprimir();
//
//        Calculadora calculadora = new Calculadora();
//
//        calculadora.somar(5,5);
//        calculadora.subtrair(5,5);
//
//        Musica musica1 = new Musica();
//        musica1.setNomeMusica("Oak para Java");
//        musica1.setNomeArtista("James Gosling");
//        musica1.setAnoLancamento(1991);
//        musica1.setDuracao(3.14);
//        musica1.setParticipacao("Patrick Naughton e Mike Sheridan");
//        musica1.setProdutorMusical("Sun Microsystems");
//
//        musica1.exibirInformacao();

        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNome("IntelliJ IDEA");
        conta1.setSaldo(1998.99);
        conta1.setCartao("Conta Privada IDE");
        conta1.setAgencia(1001);
        conta1.setConta(101010);

        conta1.entrarNaConta();
    }
}
