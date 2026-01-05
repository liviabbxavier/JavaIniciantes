package OrientacaoObjeto.Abstracao;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void exibeInformacoes() {
        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nCargo: %s", cargo);
        System.out.printf("\nSalário: %.2f\n", salario);
    }

    public void reajusteSalarial(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("Novo salário de %s: %.2f \n", nome, salario);
    }
}
