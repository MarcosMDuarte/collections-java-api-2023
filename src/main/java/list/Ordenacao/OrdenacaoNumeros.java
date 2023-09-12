package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros{

    private List<Numero> listNumeros;

    public OrdenacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNuemro (Numero numero){
        listNumeros.add(numero);
    }

    public List<Numero> ordenarAscendente() {
        List<Numero> numerosAscendente = new ArrayList<>(listNumeros);
        Collections.sort(numerosAscendente);

        return numerosAscendente;
    }

    public static void main(String[] args) {
        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero(5));
        listaNumeros.add(new Numero(2));
        listaNumeros.add(new Numero(9));
        listaNumeros.add(new Numero(1));
        listaNumeros.add(new Numero(7));

        System.out.println("Ordenação Crescente:");
        for (Numero numero : listaNumeros) {
            System.out.println(numero);
        }

        Collections.sort(listaNumeros);

        System.out.println("Ordenação Crescente:");
        for (Numero numero : listaNumeros) {
            System.out.println(numero);
        }

        Collections.sort(listaNumeros, new Comparator<Numero>() {
            @Override
            public int compare(Numero num1, Numero num2) {
                return Integer.compare(num2.getNumero(), num1.getNumero());
            }
        });

        System.out.println("Ordenação Decrescente:");
        for (Numero numero : listaNumeros) {
            System.out.println(numero);
        }

    }

}




