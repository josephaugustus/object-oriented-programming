package aula12.as10b.exercicio01;

public class Principal {

    public static void main(String[] args) {

        Adaptador adaptador = new Adaptador();

        Cliente cliente = new Cliente(adaptador);

        cliente.executar();
    }
}
