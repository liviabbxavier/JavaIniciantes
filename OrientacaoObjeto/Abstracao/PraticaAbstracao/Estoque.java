package OrientacaoObjeto.Abstracao.PraticaAbstracao;

public class Estoque {
    String nome;
    int quantidade;

    void vende(int qtdVendida) {
        if (qtdVendida <= quantidade) {
            quantidade -= qtdVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public static void main(String[] args) {
        Estoque item = new Estoque();
        item.nome = "Camiseta";
        item.quantidade = 10;

        item.vende(3);
        item.vende(8);
    }
}
