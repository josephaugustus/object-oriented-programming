package aula14.salaAula.teste;

public class Saude {

    int idade;
    double altura;
    double peso;

    Saude(int idade, double altura, double peso) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public double calculaIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }

    public String condicaoFisica() {
        double imc = calculaIMC();

        if (imc < 18.5) {
            return "Abaixo do peso.";

        } else if (imc <= 24.9) {
            return "Peso normal";

        } else if (imc <= 29.9) {
            return "Sobrepeso";

        } else {
            return "Obsidade";
        }
    }
}
