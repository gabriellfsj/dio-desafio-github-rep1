package com.digitalinovation;

public class No<T> {

    private T conteudo;
    private No procimoNo;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public No() {
        this.procimoNo = null;


    }
}
