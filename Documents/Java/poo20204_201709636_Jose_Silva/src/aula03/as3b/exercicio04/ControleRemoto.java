package aula03.as3b.exercicio04;

public class ControleRemoto extends Televisao {

    private static int volume;
    private static int canal;

    public void setAumentarSom() {
        volume++;
        super.setVolume(volume);
    }

    public void setDiminuirSom() {
        volume--;
        super.setVolume(volume);
    }

    public void setTrocarCanal() {
        canal++;
        if (canal > 10) {
            canal = 0;
        } else {
            super.setCanal(canal);
        }
    }

    public void setBuscarCanal(int ir) {
        if (ir <= 10) {
            super.setCanal(ir);
        } else {
            System.out.println("Nenhum canal encontrado!");
        }
    }
}
