package OrientacaoObjeto.Encapsulamento.Pratica;

public class ContaBancaria {
    private String titular;
    private double saldoInicial;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldoInicial = 0;
    }

    public void exibirSaldo() {
        System.out.println("Nome do titular: " + titular);
        System.out.printf("Saldo atual da conta: %.2f\n", saldoInicial);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoInicial += valor;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldoInicial) {
            this.saldoInicial -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana");
        conta.depositar(1000.00);
        conta.sacar(200.00);
        conta.exibirSaldo();
    }
}
