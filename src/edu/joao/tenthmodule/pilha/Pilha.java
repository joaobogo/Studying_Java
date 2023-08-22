package edu.joao.tenthmodule.pilha;

public class Pilha {

    private No refNoEntradraPilha;

    public Pilha() {
        this.refNoEntradraPilha = null;
    }

    public boolean isEmpty() {
        if (refNoEntradraPilha == null) {
            return true;
        }
        return false;
    }

    public No top() {
        return refNoEntradraPilha;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradraPilha;
        refNoEntradraPilha = novoNo;
        refNoEntradraPilha.setReNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradraPilha;
            refNoEntradraPilha = refNoEntradraPilha.getReNo();
            return noPoped;
        }
        return null;
    }

    public String toString() {
        String stringRetorno = "--------\n";

        No noAuxiliar = refNoEntradraPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            } else {
                break;
            }
        }
        stringRetorno += "========\n";
        return stringRetorno;
    }

}
