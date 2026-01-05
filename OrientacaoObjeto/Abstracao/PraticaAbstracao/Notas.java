package OrientacaoObjeto.Abstracao.PraticaAbstracao;

public class Notas {
    String nome;
    double nota1;
    double nota2;

    public void informacoesAluno() {
        double media = (nota1 + nota2) / 2;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média: %.1f\n", media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado!");
        } else {
            System.out.println("Situação: Reprovado!");
        }
    }
    public static void main(String[] args) {
        Notas aluno = new Notas();
        aluno.nome = "João";
        aluno.nota1 = 6.5;
        aluno.nota2 = 7.5;

        aluno.informacoesAluno();
    }
}
