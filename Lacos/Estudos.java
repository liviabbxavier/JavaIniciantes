package Lacos;

import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
        // for(ponto de início; condição(número máximo); atualização) {
        //}

        //while (condition) {
        // quando não se sabe a condição de parada
        //}

        //do {
        // executa o bloco de código pelo menos uma vez
        //} while()

        String[] vendedores = {"Maria", "João", "Pedro", "Eduarda"};
        double[] vendas = {4000.00, 8000.00, 12000.00, 5000.00};

        //length - percorre a lista até o final
        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i].equalsIgnoreCase("Pedro")) {
                break;
                // continue; pula o laço e imprime o resto
            } // interrompe o laço no nome referido
            System.out.printf("%s - comissão %.2f\n", vendedores[i],
            calcularComissao(vendas[i]));
        }

        System.out.println("\n Usando o while");
        int j = 0;
        boolean imprimeOutro = true;

        Scanner leitura = new Scanner(System.in);

        // while (imprimeOutro) {
        //     System.out.printf("%s - comissão %.2f\n", vendedores[j],
        //     calcularComissao(vendas[j]));
        //     j++;
        //     System.out.println("Deseja imprimir outro?");
        //     imprimeOutro = leitura.nextBoolean();
        // }

        do {
            System.out.printf("%s - comissão %.2f\n", vendedores[j],
            calcularComissao(vendas[j]));
            j++;
            System.out.println("Deseja imprimir outro?");
            imprimeOutro = leitura.nextBoolean();
        } while(imprimeOutro);
        
        System.out.println("Todos os nomes: ");

        for (String nomeVendedores : vendedores) {
            System.out.println("Nome - " + nomeVendedores);
        }
    }

        public static double calcularComissao(double totalVendas) {
        if (totalVendas <= 5000) {
            return totalVendas * 0.03;
        } else if (totalVendas <= 10000) {
            return totalVendas * 0.05;
        } else {
            return totalVendas * 0.07;
        }
    }
}
