package StringsERegex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pratica {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        // removendo espaços
        System.out.println("Digite o nome: ");
        String nome = leitura.nextLine();

        String nomeFormatado = nome.trim(); // retira os espaços
        System.out.println("Nome sem espaços: " + nomeFormatado);

        // convertendo para maiúsculas e minúsculas
        System.out.println("Digite um texto: ");
        String texto = leitura.nextLine();

        String textoFormatado1 = texto.toLowerCase();
        System.out.println("Texto em minúsculo: " + textoFormatado1);

        String textoFormatado2 = texto.toUpperCase();
        System.out.println("Texto em maiúsculo: " + textoFormatado2);

        // substituindo uma parte da string
        System.out.println("Digite uma frase: ");
        String frase = leitura.nextLine();

        System.out.println("Digite a palavra que deseja substituir: ");
        String palavra = leitura.nextLine();

        System.out.println("Digite a nova palavra: ");
        String novaPalavra = leitura.nextLine();

        String novaFrase = frase.replace(palavra, novaPalavra);
        System.out.println("Frase formatada: " + novaFrase);

        // extraindo parte de uma string
        System.out.println("Digite o nome do arquivo: ");
        String arquivo = leitura.nextLine();

        int posicaoPonto = arquivo.lastIndexOf("."); // procura a última ocorrência deste caractere dentro da string
        if (posicaoPonto != -1) { // Verifica se o ponto existe na string (-1 significa que não foi encontrado).
            String nomeSemExtensao = arquivo.substring(0, posicaoPonto);// Cria uma nova string que vai do início (0) até a posição do ponto (sem incluir o ponto). Remove a extensão do arquivo.
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
        } else {
            System.out.println("O arquivo não possui extensão.");
        }

        // verifica sem contém substring
        System.out.println("Digite o texto: ");
        String textoString = leitura.nextLine();

        System.out.println("Digite a palavra: ");
        String palavraString = leitura.nextLine();

        if (textoString.contains(palavraString)) {
            System.out.println("A palavra \"" + palavraString + "\" está presente no texto.");
        } else {
            System.out.println("A palavra \"" + palavraString + "\" não está presente no texto.");
        }

        // formatando números
        System.out.println("Informe o valor: ");
        double valor = leitura.nextDouble();

        String novoValor = String.format("R$ %.2f ", valor);
        System.out.println("Valor formatado: " + novoValor);

        // validando códigos de referência
        System.out.println("Digite o código de referÊncia: ");
        String codigo = leitura.nextLine();
 
        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(codigo);
 
        if (matcher.matches()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência é inválido.");
        }

        // valida cpf
        System.out.println("Informe o cpf: ");
        String cpf = leitura.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if (cpf.matches(regex)) {
            System.out.println("O CPF " + cpf + " está no formato válido.");
        } else {
            System.out.println("O CPF " + cpf + " não está no formato válido.");
        }

        // extraindo hashtags de um texto
        System.out.println("Digite um texto com hashtag: ");
        String hashtag = leitura.nextLine();

        Pattern pattern2 = Pattern.compile("#\\w+");
        Matcher matcher2 = pattern2.matcher(hashtag);

        ArrayList<String> listaHashtags = new ArrayList<>();
 
        while (matcher2.find()) {
            listaHashtags.add(matcher2.group());
        }
 
        if (listaHashtags.isEmpty()) {
            System.out.println("Nenhuma hashtag encontrada.");
        } else {
            System.out.println("Hashtags encontradas: " + String.join(", ", listaHashtags));
        }

        // valdando senha
        System.out.println("Digite uma senha: ");
        String senha = leitura.nextLine();

        String regex2 = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (senha.matches(regex2)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");
        }
    }
}
