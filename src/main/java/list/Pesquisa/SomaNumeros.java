package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List <Integer> listNumeros;

    public SomaNumeros() {
        this.listNumeros = new ArrayList<>();

    }

    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }

    public List<Integer> getListNumeros() {
        return listNumeros;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listNumeros=" + listNumeros +
                '}';
    }

    public int calcularSoma(){
        int soma = 0;
        for (int n: listNumeros) {
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = -99999;
        if (!listNumeros.isEmpty()){
            for (int n: listNumeros) {
                if (n > maior){
                    maior = n;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = 99999;
        if (!listNumeros.isEmpty()){
            for (int n: listNumeros) {
                if (n < menor){
                    menor = n;
                }
            }
        }
        return menor;
    }

    public String exibirNumeros(){
        return toString();
    }


    public static void main(String[] args) {
        SomaNumeros chamada = new SomaNumeros();

        chamada.adicionarNumero(12);
        chamada.adicionarNumero(8);
        chamada.adicionarNumero(5);
        chamada.adicionarNumero(2);
        chamada.adicionarNumero(28);

        System.out.println(chamada.calcularSoma());
        System.out.println(chamada.encontrarMaiorNumero());
        System.out.println(chamada.encontrarMenorNumero());
        System.out.println(chamada.exibirNumeros());

    }

}
