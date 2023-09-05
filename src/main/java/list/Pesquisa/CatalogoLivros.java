package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro (String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && anoFinal >= l.getAnoPublicacao()){
                    livrosPorIntervaloAnos.add(l);
                }
            }

        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPesquisa = null;
        if(!livroList.isEmpty()){
            for (Livro l: livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPesquisa = l;
                    break;
                }
            }
        }
        return livroPesquisa;
    }

    public static void main(String[] args) {
        CatalogoLivros biblioteca = new CatalogoLivros();

        biblioteca.adicionarLivro("livro1", "autor1", 2021 );
        biblioteca.adicionarLivro("livro2", "autor1", 2022 );
        biblioteca.adicionarLivro("livro3", "autor2", 2023 );
        biblioteca.adicionarLivro("livro4", "autor3", 1976 );

        System.out.println(biblioteca.pesquisarPorAutor("autor3"));
        System.out.println(biblioteca.pesquisarPorTitulo("livro2"));
        System.out.println(biblioteca.pesquisarPorIntervaloAnos(1690, 2022));



    }

}
