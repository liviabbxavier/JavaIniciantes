package ColecoesEStreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Pratica {
    public static void main(String[] args) {
        // Adicionando elementos
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println("Lista de funcionários: " + funcionarios + "\n");

        // Removendo elementos
        funcionarios.remove("João");

        System.out.println("Lista após a exclusão: " + funcionarios + "\n");

        // Acessando elementos
        System.out.println("A segunda pessoa na lista é: " + funcionarios.get(1) + "\n");
        System.out.println("Total de funcionários: " + funcionarios.size() + "\n");

        // Elementos únicos
        Set<String> eventos = new HashSet<>();
        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        System.out.println("Lista de eventos: " + eventos + "\n");

        // Map de clientes
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Lucas");
        clientes.put(2, "Liam");
        clientes.put(3, "Mason");
        clientes.put(4, "Damon");
        clientes.put(5, "Zayn");

        System.out.println("Lista de clientes: " + clientes + "\n");
        System.out.println("O nome do cliente número 2 é: " + clientes.get(2) + "\n");

        // Verificando se a chave existe
        int idCliente = 6;

        if (clientes.containsKey(idCliente)) {
            String nomeCliente = clientes.get(idCliente);
            System.out.println("O nome do cliente com ID " + idCliente + " é: " + nomeCliente + "\n");
        } else {
            System.out.println("Cliente com ID " + idCliente + " não encontrado.\n");
        }

        // Seleção de funcionários c/ nomes curtos
        List<String> funcionarios2 = List.of("Phainon", "Castorice", "Mydei", "Lynae", "Baizhi");

        List<String> nomesCurtos = funcionarios2.stream()
                .filter(nome -> nome.length() <= 5)
                .collect(Collectors.toList());

        System.out.println("Lista completa de funcionários: " + funcionarios2 + "\n");
        System.out.println("Funcionários com nomes curtos: " + nomesCurtos + "\n");

        // Calculando quadrado de números
        List<Integer> numeros = List.of(2, 3, 5, 7, 9);

        List<Integer> quadrados = numeros.stream()
                .map(d -> d * d)
                .collect(Collectors.toList());

        System.out.println("Números: " + numeros + "\n");
        System.out.println("Quadrados dos números: " + quadrados + "\n");

        // Calculando total com imposto
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        Double gastos = precosProdutos.stream()
        .reduce(0.0, Double::sum);

        double imposto = gastos * 0.08;
        double totalImposto = gastos + imposto;

        System.out.println("Valor antes do imposto: " + String.format("%.2f", gastos) + "\n");
        System.out.println("Valor depois do imposto: " + String.format("%.2f", totalImposto) + "\n");

        // Estatísticas de notas
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double somaNotas = notas.stream()
        .reduce(0.0, Double::sum);

        double media = somaNotas / notas.size();

        double menorNota = notas.stream()
        .min(Double::compare).get();

        double maiorNota = notas.stream()
        .max(Double::compare).get();

        System.out.println("Média: " + media + "\n");
        System.out.println("Menor nota: " + menorNota + "\n");
        System.out.println("Maior nota: " + maiorNota + "\n");
    }
}
