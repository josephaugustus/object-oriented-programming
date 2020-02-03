package aula09.salaaula;

public abstract class Conta {
	protected int numero;
	protected double saldo;
	protected Cliente titular;
	
	public void sacar(double valor) {
		if(this.saldo > valor) {
			this.saldo = saldo - valor;
		}else {
			System.out.println("Saldo Insuficiente!");
		}
		
	}
	
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}
	
	public void transferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
		}else {
			System.out.println("Saldo Insuficiente!");
		}
		
	}
	
	public abstract boolean validaConta();
}
