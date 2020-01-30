package aula09.salaAula;

public class ContaPoupanca extends Conta {

    private double juros;

    public ContaPoupanca(double juros) {
        this.juros = juros;
    }

    @Override
    public boolean validarConta() {
        if (numero > 100000) {
            return false;
        } else {
            return true;
        }
    }

}
