package aula03.as3b.exercicio03;

public class Principal {

    public static void main(String[] args) {
        Elevador predio = new Elevador(2, 5);

        System.out.println(predio.getAndarAtual());
        predio.sobe();
        predio.desce();
        predio.sobe();
        predio.sobe();
        predio.sobe();
//        predio.desce();
//        predio.desce();
        System.out.println(predio.getAndarAtual());

    }
}
