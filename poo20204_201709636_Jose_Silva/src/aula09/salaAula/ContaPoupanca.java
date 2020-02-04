package aula09.salaAula;

public class ContaPoupanca extends Conta {

	private double juros;
	
	@Override
	public boolean validaConta() {
		if(numero > 100000) {
			return false;
		}else {
			return true;
		}
	}

}
