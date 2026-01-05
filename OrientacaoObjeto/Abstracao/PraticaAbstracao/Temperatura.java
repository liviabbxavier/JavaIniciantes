package OrientacaoObjeto.Abstracao.PraticaAbstracao;

public class Temperatura {
    String local;
    double temperaturaAtual;

    public void informacoes() {
        System.out.println("Local do sensor: " + local);
        System.out.printf("Temperatura: %.1f °C", temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("\nAlerta: Temperatura acima do limite!\n");
        } else {
            System.out.println("\nTemperatura dentro so limite.\n");
        }
    }

    public static void main(String[] args) {
        Temperatura sensor = new Temperatura();
        sensor.local = "Setor A";
        sensor.temperaturaAtual = 39.2;

        sensor.informacoes();
    }
}
