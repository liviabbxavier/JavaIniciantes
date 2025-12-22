package VariaveisETipos;

// variáveis são espaços na memória do pc que guardam valores, 
// podendo ser alterados em qualquer momentos

// é necessário ter nome, o tipo de dado e o valor

// existem dois tipos de variáveis: primitivos e referenciados
public class Variaveis {
    // tipos primitivos:
    // byte; -128 a 127. até 8 bits. implícita: short, long,
    // float, double. explícito: char

    // short; -32.768 a 32.768. até 16 bits. implícito: int, long, float
    // double. explícito: byte, char

    // int; -2.147.483.648 a 2.147.483.647. até 32 bits. implícito: long, float,
    // double.
    // explícito: byte, short, char

    // long; -9 quintilhões a 9 quintilhões. até 64 bits. implícito: float, double.
    // explícito:
    // byte, short, char, int

    // float; números decimais. até 32 bits. implícito: double.
    // explícito: byte, short, char, int, long

    // double; números decimais de alta precisão. até 64 bits. sem conversões
    // implícitas, pois é o maior.
    // explícito: byte, short, char, int, long, float

    // char; um único carácter ex.: 'J'. até 16 bits. implício: int, long, float,
    // double

    // boolean; true ou false

    // tipos referenciados:
    // String;
    public static void main(String[] args) {
        int quantidadePassos = 500;
        double alturaEmMetros = 1.60;
        String nome = "José";

        // int alturaEmCentimetros = (int) (alturaEmMetros * 100); // maneira certa com multiplicação
        // System.out.println(alturaEmCentimetros);

        int alturaEmCentimetros = 170;
        alturaEmMetros = alturaEmCentimetros;
        System.out.println(alturaEmMetros / 100);

        if (quantidadePassos < 1000) {
            String sugestao = "Sugiro que você aumente a meta!"; // a variável fora do if não funciona, pq foi criada detro da condição 
            System.out.println(sugestao);
        }
    }

}
