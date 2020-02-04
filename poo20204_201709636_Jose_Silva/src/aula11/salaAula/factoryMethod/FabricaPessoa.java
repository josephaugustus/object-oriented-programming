package aula11.salaAula.factoryMethod;

public class FabricaPessoa extends Fabrica {

    public Pessoa criaPessoa(String nome, String sexo) {
        Pessoa p = null;

        if (sexo.equals("M")) {
            p = new Homem(nome);
        } else if (sexo.equals("F")) {
            p = new Mulher(nome);
        } else {
            throw new IllegalArgumentException("Tipo de pessoa inválido!");
        }
        return p;
    }
}
