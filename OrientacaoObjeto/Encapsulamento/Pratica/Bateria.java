package OrientacaoObjeto.Encapsulamento.Pratica;

public class Bateria {
    private int nivelBateria;

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;   
        }
    }

    public String statusBateria() {
        if (nivelBateria <= 20) {
            return "Bateria fraca.";
        } else if (nivelBateria <= 80) {
            return "Bateria ok.";
        } else {
            return "Bateria cheia.";
        }
    }

    public static void main(String[] args) {
        Bateria b = new Bateria();
        b.setNivelBateria(85);
        System.out.println("Status: " + b.statusBateria());
    }
}