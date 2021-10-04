package com.digitalinovationone;

public class Pilha {

    private No refNoDentroDaPilha;

    public Pilha() {

        this.refNoDentroDaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoDentroDaPilha;
        refNoDentroDaPilha = novoNo;
        refNoDentroDaPilha.setReNo(refAuxiliar);

    }

    public No pop() {
        if (this.isEmpty()) {
            No noPopped = refNoDentroDaPilha;
            refNoDentroDaPilha = refNoDentroDaPilha.getReNo();
        }
        return null;
    }

    public No top() {
        return refNoDentroDaPilha;
    }

    public boolean isEmpty() {
        return refNoDentroDaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "-----------------------\n";
        stringRetorno += "  Pilha\n";
        stringRetorno += "  ----------------------------\n";

        No noAuxiliar = refNoDentroDaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            } else {
                break;
            }

        }
        stringRetorno += "============\n";
        return stringRetorno;
    }
}