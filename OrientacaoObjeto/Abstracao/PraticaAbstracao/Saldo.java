package OrientacaoObjeto.Abstracao.PraticaAbstracao;

public class Saldo {
    double saldo;

    public void zerarSaldo() {
        saldo = 0.0;
    }

    public void exibeSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public static void main(String[] args) {
        Saldo conta = new Saldo();
        conta.saldo = 1579.42;

        conta.exibeSaldo();
        conta.zerarSaldo();
        conta.exibeSaldo();
    }
}
