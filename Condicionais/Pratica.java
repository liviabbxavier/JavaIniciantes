package Condicionais;

import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        // par ou ímpar
        System.out.println("Digite um número par ou ímpar...");
        int numero = leitura.nextInt();
        leitura.nextLine();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.\n");
        } else {
            System.out.println("O número " + numero + " é ímpar.\n");
        }

        // média aluno
        System.out.println("Digite a primeira nota do aluno para fazer o cálculo da média...");
        double nota1 = leitura.nextDouble();
        leitura.nextLine();

        System.out.println("Digite a segunda nota...");
        double nota2 = leitura.nextDouble();
        leitura.nextLine();

        System.out.println("Digite a terceira e última nota...");
        double nota3 = leitura.nextDouble();
        leitura.nextLine();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média do aluno: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("O aluno está aprovado.\n");
        } else if (media < 5.0) {
            System.out.println("O aluno está reprovado.\n");
        } else {
            System.out.println("O aluno está em recuperação.\n");
        }

        // validando senha
        int senha = 123456;
        System.out.println("Digite a senha para acessar o sistema: ");
        int tentativa = leitura.nextInt();
        leitura.nextLine();

        if (tentativa == senha) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado, tente novamente...");
        }

        // comparando números
        System.out.println("Digite um número: ");
        int numero1 = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite outro número: ");
        int numero2 = leitura.nextInt();
        leitura.nextLine();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior que o número " + numero2 + ".\n");
        } else if (numero2 > numero1) {
            System.out.println("O número " + numero2 + " é maior que o número " + numero1 + ".\n");
        } else {
            System.out.println("Os números são iguais.\n");
        }

        // desconto em compras
        System.out.println("Digite o valor da compra: ");
        double valorCompra = leitura.nextDouble();
        leitura.nextLine();

        System.out.println("Digite o valor de desconto: ");
        double desconto = leitura.nextDouble();
        leitura.nextLine();

        double percentual = valorCompra * (desconto / 100);
        double novoValor = valorCompra - percentual;

        System.out.println("Desconto aplicado com sucesso!");
        System.out.printf("Novo valor: R$ %.2f\n", novoValor);

        // dia útil
        System.out.println("Digite o dia da semana(em letras minúsculas): ");
        String diaSemana = leitura.nextLine();

        if (diaSemana.equals("segunda") || diaSemana.equals("terça") || diaSemana.equals("quarta")
                || diaSemana.equals("quinta") || diaSemana.equals("sexta")) {
            System.out.println(diaSemana + " é um dia útil.\n");
        } else {
            System.out.println(diaSemana + " não é um dia útil.\n");
        }

        // número em intervalo
        System.out.println("Digite o valor de empréstimo:");
        double emprestimo = leitura.nextDouble();
        leitura.nextLine();

        if (emprestimo > 500) {
            System.out.println("O valor " + emprestimo + ", não esta dentro do intervalo permitido.");
        } else {
            System.out.println("Empréstimo solicitado com sucesso.");
        }

        // verifica triângulo
        System.out.println("Digite o primeiro lado: ");
        int lado1 = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite o segundo lado: ");
        int lado2 = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite o terceiro lado: ");
        int lado3 = leitura.nextInt();
        leitura.nextLine();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }

        // compatibilidade de sangue
        System.out.println("Informe a idade do doador: ");
        int idadeDoador = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Informe o peso do doador: ");
        double pesoDoador = leitura.nextDouble();
        leitura.nextLine();

        if (idadeDoador < 18 && pesoDoador <= 50) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter idade entre 18 e 65 anos e pesar mais de 50kg");
        } else if (idadeDoador >= 18 && pesoDoador <= 50) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve pesar mais de 50kg");
        } else if (idadeDoador < 18 && pesoDoador > 50) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter idade entre 18 e 65 anos.");
        } else {
            System.out.println("O doador é compatível.");
        }

        // código de acesso e nível de permissão 
        int codigoAcesso = 537;
        System.out.println("Digite o código de acesso: ");
        int tentaCod = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite o nível de permissão: ");
        int nivelPermissao = leitura.nextInt();
        leitura.nextLine();

        if (tentaCod == codigoAcesso && nivelPermissao == 1 || nivelPermissao == 2 || nivelPermissao == 3) {
            System.out.println("Acesso liberado, bem-vindo ao sistema!");
        } else if (tentaCod != codigoAcesso) {
            System.out.println("Acesso negado, código incorreto!");
        } else {
            System.out.println("Você não tem permissão para acessar o sitema!");
        }
    }
}
