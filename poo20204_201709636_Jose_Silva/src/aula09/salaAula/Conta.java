package aula09.salaAula;

public abstract class Conta {

    protected int numero;
    protected Cliente titular;
    protected double saldo;

    public void sacar(double valor) {
        if (this.saldo > valor) {
            saldo = saldo - valor;
        } else {
            System.out.print("Saldo insificiente!");
        }
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.print("Saldo insificiente!");
        }

    }

    public abstract boolean validarConta();

}
