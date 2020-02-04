package aula11.salaAula.factoryMethod;

public class TesteApp {

    public static void main(String args[]) {

        FabricaPessoa factory = new FabricaPessoa();

        factory.criaPessoa("Carlos", "M");
        factory.criaPessoa("Maria", "F");
        try {
            factory.criaPessoa("Erro", "Z");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        String nome = "Carlos";
//        String sexo = "M";
//        Pessoa pessoa = factory.criaPessoa(nome, sexo);
//
//        String nome1 = "Maria";
//        String sexo1 = "F";
//        pessoa = factory.criaPessoa(nome1, sexo1);
//
//        try {
//            String nome2 = "Erro";
//            String sexo2 = "Z";
//            pessoa = factory.criaPessoa(nome2, sexo2);
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }

}
