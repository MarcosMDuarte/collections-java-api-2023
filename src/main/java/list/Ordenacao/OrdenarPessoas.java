package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenarPessoas {

    private List<Pessoa> listPessoa;

    public OrdenarPessoas() {this.listPessoa = new ArrayList<>();}

    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        pessoasPorAltura.sort(new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenarPessoas ordenacaoPessoas = new OrdenarPessoas();
        ordenacaoPessoas.adicionarPessoa("Marcos", 33, 1.70);
        ordenacaoPessoas.adicionarPessoa("Jéssica", 28, 1.67);
        ordenacaoPessoas.adicionarPessoa("Neida", 67, 1.60);
        ordenacaoPessoas.adicionarPessoa("Leonardo", 35, 1.68);

        System.out.println(ordenacaoPessoas.listPessoa);
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());


    }




}
