package aula12.as10b.exercicio03;

public class Principal {

    public static void main(String[] args) {

        CiaSeguros seguro = new CiaSeguros();
        Delegacia delegacia = new Delegacia();

        Sensor alarme = new Sensor();

        alarme.sensor(true);

        delegacia.update(true);
        seguro.update(true);

    }
}
