package com.digitalinovation;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("Primeiro nó"));
        minhaFila.enqueue(new No("Segundo nó"));
        minhaFila.enqueue(new No("Terceiro nó"));
        minhaFila.enqueue(new No("Quarto nó"));
        minhaFila.enqueue(new No("eretrte nó"));

        System.out.println(minhaFila);
    }
}
