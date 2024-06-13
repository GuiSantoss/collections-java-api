package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();


    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalist) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return tarefalist.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricaoTarefas();
    }

}
