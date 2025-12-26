package StringsERegex;

public class Estudos {
    // String é uma CLASSE
    // %s - string
    // %d - int
    // %f - float ou double com todos os números depois da vírgula
    // %n - nova linha
    // %.2f - formata até duas casas depois da vírgula (pode ser editado)
    // trim() - elimina os espaços deixados
    public static void main(String[] args) {
        System.out.println("""
                Isso se chama textblocks e precisa necessariamente de três aspas
                Ajuda na formatação do texto no terminal
                """);
        
        System.out.println(String.format(null, args));
        System.out.printf("Usa argumentos com % + alguma coisa, semelhante ao String.format. Uma forma mais limpa.");
        System.out.println("Usando %n substitui o uso de '\n' no printf acima.");
    }
}
