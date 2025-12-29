package StringsERegex;

public class EstudosString {
    // String é uma CLASSE
    // %s - string
    // %d - int
    // %f - float ou double com todos os números depois da vírgula
    // %n - nova linha
    // %.2f - formata até duas casas depois da vírgula (pode ser editado)
    // trim() - elimina os espaços deixados
    // toLowerCase() - coloca as letras em minúsculo
    // toUperCase() - coloca as letras em maiúsculo
    // replace() - troca um argumento por outro
    // charAt() – Retorna o caractere de uma posição específica na string.
    // substring() – Permite extrair um trecho da string, podendo definir tanto a posição inicial quanto a final. Por exemplo, substring(0, 10).
    // contains() – Verifica se existe uma palavra chave dentro do texto
    // startsWith() – Confere se a string começa com um determinado conjunto de caracteres. Por exemplo, professor.startsWith("Jac") retornará true se o nome começar com "Jac".
    // endsWith() – Similar ao startsWith, mas verifica se a string termina com um determinado sufixo.

    public static void main(String[] args) {
        String professor = "Jacqueline Oliveira";

        String disciplina = "Java e Programação Orientada a Objetos";

        String curriculo = ""
                + "Pós-graduada em Engenharia e "
                + "Arquitetura de Software; "
                + "Desenvolvedora backend Java desde 2010; "
                + "";

        String texto = String.format("Disciplina: %s - %s", disciplina.trim(), professor.toUpperCase());
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s", professor.replace("Oliveira", "Magalhães"), disciplina);
        System.out.println(curriculo);
    }
}
