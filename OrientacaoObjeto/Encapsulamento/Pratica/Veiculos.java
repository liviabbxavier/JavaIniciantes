package OrientacaoObjeto.Encapsulamento.Pratica;

public class Veiculos {
    private String modelo;
    private String placa;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public Veiculos(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void fichaCarro() {
        System.out.println("Modelo do carro: " + getModelo());
        System.out.println("Placa do carro: " + getPlaca());
        System.out.println("Ano do carro: " + getAno() + "\n");
    }

    public static void main(String[] args) {
        Veiculos carro1 = new Veiculos("Gol", "ABCD-1234", 2000);
        System.out.println("Veículos cadastrados: ");
        carro1.fichaCarro();
    }
}
