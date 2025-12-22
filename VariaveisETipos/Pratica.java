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
        System.out.println("É estudante: " + estuda);

        // convertendo
        double valor = 19.5;
        int novoValor = (int) valor;
        System.out.println(novoValor);

        // média de alunos
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);

        // convertendo celsius em fahrenheit
        int celsius = 20;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(fahrenheit);


    }
}
