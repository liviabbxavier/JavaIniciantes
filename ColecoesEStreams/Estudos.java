package ColecoesEStreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Estudos {
    // List:
    // ordenação, duplicidade permitida
    // implementações: ArrayList e LinkedList
    // Operações comund: add, remove, contains, get, size
    // ArrayList: buscas rápidas
    // LinkedList: muitas inserções e remoções

    // set:
    // não se preocupa com ordenação
    // não permite duplicidade
    // implementações: HashSet(não se preocupa com ordenação e não permite
    // duplicados, mais rápido),
    // LinkedHashSet (mantém a ordem de inserção),
    // TreeSet (Permite ordenação, mais lento)

    // map:
    // chave-valor, sem valores duplicados
    // implementações: HashMap, LinkedHashMap, TreeMap (semelhante às operações da
    // coleção set)
    // operações comuns: put, get, remove, containsKey, keySet

    // Streams API:
    // operações intermediárias
    // operações terminais
    // operações comuns: filter() - filtra,
    // map() - faz transformações,
    // reduce() - reduzir e finalizar algum cálculo,
    // collect() - transforma em outra lista
    public static void main(String[] args) {
        // COLEÇÕES
        List<String> funcionarios = new ArrayList<>();
        // a numeração sempre começa a partir do 0 (zero)
        funcionarios.add("Roberta"); // número 0
        funcionarios.add("Alice"); // número 1
        funcionarios.add("Pedro"); // número 2

        System.out.println(funcionarios + "\n");
        System.out.println(funcionarios.get(1) + "\n");

        Set<String> produtos = new HashSet<>();
        produtos.add("Caldo-de-Cana");
        produtos.add("Pastel");
        produtos.add("Onigiri");
        produtos.add("Pastel"); // produtos repetidos não serão exibidos
        produtos.add("Água");

        System.out.println(produtos + "\n");

        // não usa o tipo primitivo
        // chave - valor
        Map<Integer, String> clientes = new HashMap<>();
        // numeração começa a partir do número 1
        clientes.put(1, "Mark");
        clientes.put(2, "Daniel");
        clientes.put(3, "Rose");

        System.out.println(clientes + "\n");

        // STREAMS
        List<String> funcionarios2 = List.of("Ana", "Alex", "Carla", "João");

        List<String> funcionariosA = funcionarios2.stream()
                .filter(f -> f.startsWith("A")) // predicado
                .collect(Collectors.toList());

        System.out.println(funcionarios2 + "\n");
        System.out.println(funcionariosA + "\n");

        List<Double> valoresVendas = List.of(500.0, 1800.0, 6200.0);
        List<Double> comissao = valoresVendas.stream()
                .map(v -> v * 0.05)
                .collect(Collectors.toList());

        System.out.println(valoresVendas + "\n");
        System.out.println(comissao + "\n");

        double totalVendas = valoresVendas.stream()
        .reduce(0.0, Double::sum);

        System.out.println("Total de vendas: " + totalVendas + "\n");
    }
}
