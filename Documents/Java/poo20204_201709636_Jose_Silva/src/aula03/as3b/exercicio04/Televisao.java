package aula03.as3b.exercicio04;

public class Televisao {

    private int canal;
    private int volume;

    public Televisao() {
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (this.volume >= 10) {
            return;
        } else {
            this.volume = volume;
        }
    }

    public void Consulta() {
        System.out.println("Você está assistindo o canal: " + this.getCanal());
        System.out.println("O volume atual é: " + this.getVolume());
    }
}
