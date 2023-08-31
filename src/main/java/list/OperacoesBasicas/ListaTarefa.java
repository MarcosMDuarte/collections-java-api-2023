package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List <Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descicao){
        List <Tarefa> tarefaspararemover = new ArrayList<>();

        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descicao)){
                tarefaspararemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaspararemover);
    }

    public  int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas (){
        System.out.println(tarefaList.toString());
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elemento na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

        listaTarefa.adicionarTarefa("Lavar a louça");
        listaTarefa.adicionarTarefa("Lavar a roupa");
        listaTarefa.adicionarTarefa("Lavar a roupa");


        System.out.println("O número total de elemento na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Lavar a roupa");

        System.out.println("O número total de elemento na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }


}
