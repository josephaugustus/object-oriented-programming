package aula04.herancaFuncionario;

import aula04.herancaFuncionario.Funcionario;

public class Gerente extends Funcionario {

    public Gerente(String n, String c, double s) {

        super(n, c, s);

    }
    
    @Override
    public double calcularBonificacao() {
        double salario = this.getSalario();
        return salario *= 1.15;
    }

}
