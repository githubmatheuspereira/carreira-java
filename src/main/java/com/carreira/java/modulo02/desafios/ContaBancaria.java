package com.carreira.java.modulo02.desafios;

public class ContaBancaria {
    public int agencia;
    public int conta;

    private String nome;
    private double saldo;
    private String cartao;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }


    void entrarNaConta() {
        if (agencia == 1001 && conta == 101010) {

            nome = "Albert Einstein";
            saldo = 31415.92;
            cartao = "SpaceCard M2C";

            System.out.println("Bem vindo, " + nome + "!");
            System.out.printf("Agência e Conta: %d - %d", agencia, conta);
            System.out.printf("\nSaldo: %.2f\nCartão: %s", saldo, cartao);

        } else {

            nome = getNome();
            saldo = getSaldo();
            cartao = getCartao();

            System.out.println("Bem vindo, " + nome + "!");
            System.out.printf("Agência e Conta: %d - %d", agencia, conta);
            System.out.printf("\nSaldo: %.2f\nCartão: %s", saldo, cartao);

        }
    }
}
