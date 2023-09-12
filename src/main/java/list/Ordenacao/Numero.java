package main.java.list.Ordenacao;

import java.util.Comparator;

public class Numero implements Comparable<Numero>{

    private int numero;

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(numero,n.getNumero());
    }

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return " "+ numero;
    }
}

class ComparatorDescendente implements Comparable<Numero> {
    @Override
    public int compareTo(Numero numero) {
        return Integer.compare(numero.getNumero(), numero.getNumero());
    }
}
