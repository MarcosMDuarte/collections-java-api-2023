package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private long codigo;
    private String nome;
    private double preço;
    private int quantidade;

    public Produto(long codigo, String nome, double preço, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }



    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{" +
                "id: " + codigo +
                ", nome: '" + nome + '\'' +
                ", preço: " + preço +
                ", quantidade: " + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreço(), p2.getPreço());
    }
}