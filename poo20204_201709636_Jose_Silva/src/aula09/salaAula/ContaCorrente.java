package aula09.salaaula;

public class ContaCorrente extends Conta implements Tributavel{

	private double limite;
	
	@Override
	public boolean validaConta() {
		if(numero <= 100000) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public double calculaTributos() {
		return saldo * taxa;//0.01;
	}
	
	
}
