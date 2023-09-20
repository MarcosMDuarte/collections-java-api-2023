package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados setConvidados = new ConjuntoConvidados();

        setConvidados.adicionarConvidado("Jose", 123546);
        setConvidados.adicionarConvidado("Neida", 321465);
        setConvidados.adicionarConvidado("Marcos", 468977);
        setConvidados.adicionarConvidado("Jessica", 465987);
        setConvidados.adicionarConvidado("Helena", 987654);

        setConvidados.exibirConvidados();
    }



}
