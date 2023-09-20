package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> contatoSet;

    public AgendaContatos() {this.contatoSet = new HashSet<>();}

    public void adicionarContato(String nome, int numero){

        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int nomoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(nomoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }





    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Marcos", 99985);
        agendaContatos.adicionarContato("Marcos Duarte", 99985);
        agendaContatos.adicionarContato("Marcos", 99985);
        agendaContatos.adicionarContato("Duarte", 99984);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisaPorNome("Marcos"));

        System.out.println("Telefone novo do Marcos Duarte" + agendaContatos.atualizarNumeroContato("Marcos Duarte", 99835680));

    }

}
