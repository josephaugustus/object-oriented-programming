package aula09.salaAula;

public class TV extends Eletrodomestico {

    private int tamanho;
    private int canal;
    private int volume;

    public TV(int tamanho, int canal, int volume, boolean ligado, int voltagem) {
        super(ligado, voltagem);
        this.tamanho = tamanho;
        canal = 0;
        volume = 0;
    }

    protected void ligar() {
        super.setLigado(true);
        setCanal(0);
        setVolume(0);
    }

    protected void desligar() {
        super.setLigado(false);
        setCanal(13);
        setVolume(25);
    }

    public TV() {
        super(false, 0);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
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
        this.volume = volume;
    }

}
