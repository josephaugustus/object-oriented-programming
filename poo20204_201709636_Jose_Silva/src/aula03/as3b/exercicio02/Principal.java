package aula03.as3b.exercicio02;

public class Principal {

    public static void main(String[] args) {

        Agenda pessoa = new Agenda();
        pessoa.armazenaPessoa("Carlos", 25, 1.90);
        pessoa.armazenaPessoa("Francisco", 17, 1.62);
        pessoa.armazenaPessoa("Maria", 34, 1.54);
//        assertTrue(agenda.getListaPessoas().size() == 3)
        pessoa.removePessoa("Carlos");
        pessoa.imprimeAgenda();
//      pessoa.imprimePessoa();

    }
}
