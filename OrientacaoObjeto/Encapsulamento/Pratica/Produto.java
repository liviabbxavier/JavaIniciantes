package OrientacaoObjeto.Encapsulamento.Pratica;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setPreco(double valor) {
        if (valor >= 0) {
            preco = valor;   
        } else {
            System.out.println("Preço inválido.");
        }
    }


    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Mouse");
        produto1.setPreco(-59.90);

        System.out.println("Produto: " + produto1.getNome() + "\nPreço: " + produto1.getPreco() + "\n");
    }
}
