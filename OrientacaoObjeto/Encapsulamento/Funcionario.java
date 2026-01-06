package OrientacaoObjeto.Encapsulamento;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int controleReajuste = 0;

    public void exibeInformacoes() {
        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nCargo: %s", cargo);
        System.out.printf("\nSalário: %.2f\n", salario);
    }

    public void reajusteSalarial(double percentual) {
        if (controleReajuste >= 1) {
            System.out.println("Não pode fazer reajustes!");
        } else {
            controleReajuste++;
            salario += salario * (percentual / 100);
            System.out.printf("Novo salário de %s: %.2f \n", nome, salario);
        }
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
