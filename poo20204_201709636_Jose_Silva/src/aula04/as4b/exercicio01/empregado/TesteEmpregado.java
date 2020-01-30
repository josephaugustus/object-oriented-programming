package aula04.as4b.exercicio01.empregado;

/**
 *
 * @author mac
 */
public class TesteEmpregado {

    private static Empresa empresa;

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Avenida T9", 2322, "Edifício Inove Inteligent Place",
                "74255-220", "Jardim América", "Goiânia", "Goiás");
        Empregado empregado = new Empregado("José Silva", 150, empresa);
        Empresa empresa = new Empresa("Cartório", "XX.XXX.XXX/XXXX-XX", endereco);

        System.out.println(empregado);
        System.out.println(empresa);

    }
}
