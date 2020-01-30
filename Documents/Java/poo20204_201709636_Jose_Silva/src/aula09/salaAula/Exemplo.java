package aula09.salaAula;

public class Exemplo implements IExemplo {

    public void metodo1() {
        System.out.println("Implementando o metodo1");
    }

    public void metodo2() {
        System.out.println("Implementando o metodo2");
    }

    public static void main(String[] args) {
        Exemplo ex = new Exemplo();
        ex.metodo1();
        ex.metodo2();
//        System.out.println(ex.metodo2);
    }
}
