package OrientacaoObjeto.Encapsulamento.Pratica;

import java.util.ArrayList;

public class Filmes {
    private String titulo;
    private ArrayList<Integer> avaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public Filmes(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
        } else {
            System.out.println("Nota inválida. Por favor, insira uma nota válida!");
        }
    }

    public double calculaMedia() {
        int soma = 0;
        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }

    public static void main(String[] args) {
        Filmes filme1 = new Filmes("Passageiros");
        filme1.adicionarAvaliacao(5);
        filme1.adicionarAvaliacao(4);
        filme1.adicionarAvaliacao(5);
        filme1.adicionarAvaliacao(3);
        filme1.adicionarAvaliacao(4);

        System.out.printf("Media de avaliações para %s: %.2f\n",
                filme1.getTitulo(), filme1.calculaMedia());
    }
}
