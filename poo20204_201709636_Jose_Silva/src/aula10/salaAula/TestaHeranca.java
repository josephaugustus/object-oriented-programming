package aula10.salaAula;

public class TestaHeranca {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSalario(3000);
        System.out.println("A bonificação do gerente é: "
                + g.bonificacao());

        Funcionario f = new Funcionario();
        f.setSalario(3000);
        System.out.println("A bonificação do funcionário é: "
                + f.bonificacao());

        Funcionario ger = new Gerente();
        ger.setSalario(3000);
        System.out.println("O valor da bonificação é: "
                + ger.bonificacao());

    }

}
