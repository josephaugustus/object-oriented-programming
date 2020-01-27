package aula04.as4b.exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class TesteFuncionario {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        int matricula;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de matrícula:");
        matricula = sc.nextInt();

        String rua, quadra, lote, complemento, bairro, cidade, estado,
                cpf, nome, cargo, departamento;

        int numero;
        double salario;

        while (matricula != 0) {
            sc.nextLine();
            System.out.println("Informe a Rua: ");
            rua = sc.nextLine();

            System.out.println("Informe o Número: ");
            numero = sc.nextInt();

            System.out.println("Informe a Quadra: ");
            quadra = sc.nextLine();

            System.out.println("Informe o Lote: ");
            lote = sc.nextLine();

            System.out.println("Informe o Complemento: ");
            complemento = sc.nextLine();

            System.out.println("Informe o Bairro: ");
            bairro = sc.nextLine();

            System.out.println("Informe a Cidade: ");
            cidade = sc.nextLine();

            System.out.println("Informe o Estado: ");
            estado = sc.nextLine();

            Endereco endereco = new Endereco(rua, numero, quadra, lote,
                    complemento, bairro, cidade, estado);

            System.out.println("Informe o CPF: ");
            cpf = sc.nextLine();

            System.out.println("Informe o Nome: ");
            nome = sc.nextLine();

            System.out.println("Informe o Cargo: ");
            cargo = sc.nextLine();

            System.out.println("Informe o Salário: ");
            salario = sc.nextDouble();

            System.out.println("Informe o Departamento: ");
            departamento = sc.nextLine();

            Funcionario funcionario = new Funcionario(nome, cpf, matricula, cargo,
                    salario, departamento, endereco);

            funcionarios.add(funcionario);

            System.out.println("Informe a Matrícula: ");
            matricula = sc.nextInt();
        }

        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).bonificacao(30);
            System.out.println(funcionarios.get(i).toString());
        }
    }
}
