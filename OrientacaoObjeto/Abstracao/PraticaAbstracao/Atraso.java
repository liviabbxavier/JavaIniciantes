package OrientacaoObjeto.Abstracao.PraticaAbstracao;

public class Atraso {
    String titulo;
    int diasAtraso;

    double cobraAtraso() {
        return diasAtraso * 2.50;
    }

    void exibeDetalhes() {
        double multa = cobraAtraso();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n",
                titulo, diasAtraso, multa);
    }

    public static void main(String[] args) {
        Atraso livro = new Atraso();
        livro.titulo = "Dom Casmurro";
        livro.diasAtraso = 3;

        livro.exibeDetalhes();
    }
}
