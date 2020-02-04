package aula09.salaAula;

public class Exemplo extends ContaCorrente implements IExemplo, IExemplo2 {

	@Override
	public void metodo1() {
		System.out.println("Implementando o metodo1");

	}

	@Override
	public String metodo2() {
		
		return "Implementando o método2";
	}
	
	@Override
	public void metodo3() {
		System.out.println("Implementando o metodo3");
	}
	
	public static void main(String[] args) {
		IExemplo ie = new Exemplo();
		ie.metodo1();
		System.out.println(ie.metodo2());
		IExemplo2 ie2 = new Exemplo();
		ie2.metodo3();
	}

	
	
	

}
