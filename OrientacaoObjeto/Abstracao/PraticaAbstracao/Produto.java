package OrientacaoObjeto.Abstracao.PraticaAbstracao;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void informacoes() {
        System.out.println("\nProduto: " + nome);
        System.out.printf("Preço: %.2f\n", preco);
        System.out.println("Quantidade: " + quantidade + "\n");
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Mouse Gamer";
        produto1.preco = 159.9;
        produto1.quantidade = 25;
        produto1.informacoes();
    }
}
