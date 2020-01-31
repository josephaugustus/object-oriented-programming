package aula10.salaAula;

public class TestaHeranca {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSalario(3000);
        System.out.println("A bonificacao do Gerente é: "
                + g.bonificacao());
        
        Funcionario f = new Funcionario();
        f.setSalario(3000);
        System.out.println("A bonificacao do Funcionario é: "
                + f.bonificacao());
        
        Funcionario ger = new Gerente();
        ger.setSalario(3000);
        System.out.println("A bonificacao do Funcionario é: "
                + ger.bonificacao());
    }

}
