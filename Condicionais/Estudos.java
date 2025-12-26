package Condicionais;

public class Estudos {
    // operadores:
    // > - maior que...
    // < - menor que...
    // == - igual a...
    // != - diferente de...
    // >= - maior ou igual a...
    // <= - menor ou igual a...

    // operadores lógicos: 
    // and: 
    // 1 - true + true = true
    // 2 - true + false = false
    // 3 - false + true = false
    // 4 - false + false = false
    // or: 
    // 1 - true + true = true
    // 2 - true + false = true
    // 3 - false + true = true
    // 4 - false + false = false
    public static void main(String[] args) {
        String nome = "Lúcia";
        double salario = 2890.0;
        int dependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 && !isento) {
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor irrf: " + irrf);
        } else if (isento) {
            System.out.println("Contribuinte isento de irrf.");
        } else {
            System.out.println("Não há valores irrf.");
        }
    }
}
