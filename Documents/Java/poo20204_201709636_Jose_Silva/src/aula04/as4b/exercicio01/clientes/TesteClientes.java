package aula04.as4b.exercicio01.clientes;

/**
 *
 * @author mac
 */
public class TesteClientes {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Avenida T9", 2322, "Edifício Inove Inteligent Place",
                "74255-220", "Jardim América", "Goiânia", "Goiás");
        Clientes cliente = new Clientes("José Silva", "000.000.000-00", endereco);

        System.out.println(cliente);

    }
}
