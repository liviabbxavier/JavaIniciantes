package OrientacaoObjeto.Abstracao.PraticaAbstracao;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public void informacoes() {
        System.out.printf("Título: %s \nAutor: %s \nPáginas: %d ", titulo, autor, paginas);
    }
    public static void main(String[] args) {
        Livro resumo1 = new Livro();
        resumo1.titulo = "O Guia do Mochileiro das Galáxias";
        resumo1.autor = "Douglas Adams";
        resumo1.paginas = 208;
        resumo1.informacoes();
    }
}
