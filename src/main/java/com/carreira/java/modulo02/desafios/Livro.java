package com.carreira.java.modulo02.desafios;

public class Livro {

    String nome;
    String autor;
    String editora;
    int paginas;
    int lancamento;
    String edicao;
    boolean temDigital;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public boolean isTemDigital() {
        return temDigital;
    }

    public void setTemDigital(boolean temDigital) {
        this.temDigital = temDigital;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirLivro(){
        System.out.printf("Nome do livro: %s\nAutor: %s\nEditora: %s\nPáginas: %d\nLançamento: %d\nEdição: %s\nEpub: %b", nome, autor, editora, paginas, lancamento, edicao, temDigital);
    }
}


