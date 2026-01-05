package OrientacaoObjeto.Abstracao.PraticaAbstracao;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    String descricao;
    boolean concluida;

     void exibeTarefa() {
        if (concluida) {
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }

    public static void main(String[] args) {
        Tarefas t1 = new Tarefas();
        t1.descricao = "Estudar Java";
        t1.concluida = false;

        Tarefas t2 = new Tarefas();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;

        List<Tarefas> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (Tarefas t : lista) {
            t.exibeTarefa();
        }
    }
}
