package VariaveisETipos;

public class Pratica {
    public static void main(String[] args) {
        // declarando
        String nome = "Beatriz";
        int idade = 20;
        double altura = 1.63;
        boolean estuda = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudante: " + estuda + "\n");

        // convertendo
        double valor = 19.5;
        int novoValor = (int) valor;
        System.out.println("O valor " + valor + " convertido para um número inteiro é: " + novoValor + "\n");

        // média de alunos
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média do aluno: " + media + "\n");

        // convertendo celsius em fahrenheit
        int celsius = 20;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura " + celsius + "° C, equivale a " + fahrenheit + "° F\n");

        // cadastro de livros
        String titulo = "O Príncipe Cruel";
        String autor = "Holly Black";
        int numPaginas = 322;
        char categoria = 'F';

        System.out.println("Nome do livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade de páginas: " + numPaginas + "\n");

        // categoria produto
        double preco1 = 49.90;
        double preco2 = 149.90;
        double preco3 = 299.90;

        System.out.println("O produto no valor de R$ " + preco1 + " faz parte da categoria: Econômica.");
        System.out.println("O produto no valor de R$ " + preco2 + " faz parte da categoria: Intermediária.");
        System.out.println("O produto no valor de R$ " + preco3 + " faz parte da categoria: Premium.\n");

        // par ou ímpar
        int numero1 = 5;
        int numero2 = 10;

        System.out.println("O número " + numero1 + " é ímpar.");
        System.out.println("O número " + numero2 + " é par.\n");

        // conversor de moedas
        double valorReais = 500.00;
        double valorDolares = 5.25;

        double convertido = valorReais / valorDolares;

        System.out.println("O valor R$ " + valorReais + ", equivale a U$ " + convertido + ".\n");

        // verifica idade 
        int idade1 = 20;
        String mensagem;
        if (idade1 >= 18) {
            mensagem = "Você é maior de idade.\n";
        } else {
            mensagem = "Você é menor de idade.\n";
        }

        System.out.println(mensagem);

        // combustível
        double km = 20.0;
        double litros = 100;
        double atualLitros = 75;
        double kmViagem = 260;

        double autonomiaMaxima = km * litros;
        double autonomiaAtual = km * atualLitros;

        System.out.printf("Autonomia máxima do veículo: %.1f km%n.\n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n.\n", autonomiaAtual);

        if (autonomiaAtual >= kmViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar fazer uma parada para abastecer.");
        } else {
            System.out.println("Você precisará parar para abastecer!\n");
        }
    }
}
