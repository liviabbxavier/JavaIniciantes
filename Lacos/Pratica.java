package Lacos;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        // o while funciona enquanto o bloco for true
        // do-while tem um limite. Ex.: do{condições} while(funciona enquanto o argumento for diferente do valor da saída);
        Scanner leitura = new Scanner(System.in);

        // conta degraus
        int degraus;
        System.out.println("Digite a quantidade de degraus");
        degraus = leitura.nextInt();
        leitura.nextLine();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("Você chegou ao topo!\n");

        // soma de números
        int[] valores = { 10, 20, 30, 40, 50 };
        int soma = 0;

        for (int valor : valores) {
            soma += valor;
        }

        System.out.println("Som total da receita: " + soma + "\n");

        // soma números pares
        int soma2 = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma2 += i;
            }
        }

        System.out.println("A soma dos números pares de 1 até 100 é: " + soma2 + "\n");

        // calculadora de fatorial
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        leitura.nextLine();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        // maior número
        System.out.println("Digite alguns números(separando por espaços): ");
        String[] espaco = leitura.nextLine().split(" "); // .split(" ") - divide a linha em várias partes, cada uma
                                                         // representando um número
        int maior = Integer.MIN_VALUE;

        for (String numStr : espaco) {
            int num = Integer.parseInt(numStr);
            if (num > maior) {
                maior = num;
            }
        } // percorre cada parte da linha e converte para um inteiro com
          // Integer.parseInt()

        System.out.println("O maior número é: " + maior);

        // tentativas login
        String senha = "123";

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.println("Digite a senha para acessar:");
            String tentativa = leitura.nextLine();

            if (tentativa.equals(senha)) {
                System.out.println("Senha correta! Seja bem-vindo(a).");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você ainda tem " + (tentativas - 1) + " tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente");
            }
        }

        // nome válido
        String nome;

        do {
            System.out.println("Digite seu nome: ");
            nome = leitura.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome inválido, tente novamente.");
            }
        } while (nome.length() < 3);
        System.out.println("Nome '" + nome + "' cadastrado com sucesso.");

        // números positivos e negativos
        String entrada;
        int positivos = 0;
        int negativos = 0;

        do {
            System.out.println("Digite um número (ou 'sair' para encerrar):");
            entrada = leitura.nextLine();

            if (entrada.equals("sair")) {
                break;
            }

            int numero1 = Integer.parseInt(entrada);

            if (numero1 > 0) {
                positivos++;
            } else if (numero1 < 0) {
                negativos++;
            }
        } while (entrada != "sair");
        System.out.println("Quantidade de números positivos digitados: " + positivos);
        System.out.println("Quantidade de números negativos digitados: " + negativos);
        System.out.println("Programa encerrado!");

        // pula número 5
        System.out.println("Digite um número: ");
        int limite = leitura.nextInt();
        leitura.nextLine();

        for (int i = 1; i < limite; i++) {
            if (i % 10 == 5) {
                continue;
            }

            System.out.println(i + " ");
        }

        // lista de convidados
        ArrayList<String> convidados = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do convidado(ou 'ver' para visualizar a lista, ou 'sair' para encerrar.)");
            String nomeConvidado = leitura.nextLine();

            if (nomeConvidado.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado!");
                break;
            }

            if (nomeConvidado.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada: " + convidados);
                continue;
            }

            boolean existe = false;
            for (String convidado : convidados) {
                if (convidado.toLowerCase().equals(convidado.toLowerCase())) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                System.out.println("O nome " + nomeConvidado + " já foi adicionado na lista.");
            } else {
                convidados.add(nomeConvidado);
                System.out.println(nomeConvidado + " adicionado(a) à lista com sucesso.");
            }
        }
    }
}
