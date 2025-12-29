package StringsERegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EstudosRegex {
    // regex - abreviação de expressões regulares
    // caracteres especiais:
    // . - caractere, exceto quebra de linha
    // \d - dígito(0-9)
    // \D - caractere que não é um dígito
    // \w - caractere alfanumérico
    // \W - caractere não alfanumérico
    // \s - espaço em branco
    // \S - não é um espaço em branco
    // ^ - início da string
    // $ - fim da string

    // classe de caracteres:
    // [abc] - quanquer caractere dentro dos colchetes ('a', 'b' ou 'c')
    // [^abc] - qualquer caractere exceto os que não estejam dentro dos colchetes
    // [a-z] - caracteres minúsculos
    // [A-Z] - caracteres maiúsculos
    // [0-9] - qualquer dígito
    // [a-zA-Z] - letra minúscula ou maiúscula

    // quantificadores:
    // * - 0 ou mais ocorrências do padrão anterior
    // + - 1 ou mais ocorrências do padrão anterior
    // ? - 0 ou 1 ocorrências do padrão anterior
    // {n} - exatamente n ocorrências do padrão anterior
    // {n,} - n ou mais ocorrências do padrão anterior
    // {n,m} - entre n ou m ocorrências do padrão anterior
    public static void main(String[] args) {
        String texto = "Meu email é algumacoisa@gmail.com";
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+"); // padrão para descobrir um email
        Matcher matcher = pattern.matcher(texto);

        // métodos da classe matcher:
        // find - procura por um padrão em qualquer parte da string. Retorna o primeiro resultado encontrado
        // matches - verifica se a string inteira corresponde ao padrão
        // lookingAt - verifica se a string corresponde parcialmente ao padrão
        // replaceAll - substitui ocorrências do padrão por uma string
        // group - agrupa a ocorrência

        if (matcher.find()) { // condição: se encontrou, traga para mim
            System.out.println(matcher.group()); // group() sintetisa e entrega o resultado
        }
        System.out.println(formatarTelefone("2199887744"));
    }

    public static String formatarTelefone(String telefone) {
        String regex = "([0-9]{2})([0-9]{4,5})([0-9]{4})"; // o uso do () serve para quebrar em grupos
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if (matcher.matches()) {
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Número de telefone inválido!";
    }
}
