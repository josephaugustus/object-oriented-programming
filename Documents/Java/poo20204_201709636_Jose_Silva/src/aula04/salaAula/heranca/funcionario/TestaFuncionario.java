package aula04.herancaFuncionario;

import aula04.herancaFuncionario.Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario f = new Funcionario("Carlos", "191", 1000.0d);

        Funcionario g = new Funcionario("Antonio Carlos", "123", 2000.0d);

        System.out.println("Valor do Salário do Funcionário Sem Bonificação: " + f.getSalario());
        System.out.println("Valor do Salário do Funcionário Sem Bonificação: " + f.calcularBonificacao());
        System.out.println("Valor do Salário do Gerente Sem Bonificação: " + g.getSalario());
        System.out.println("Valor do Salário do Gerente Sem Bonificação: " + g.calcularBonificacao());
    }
}
