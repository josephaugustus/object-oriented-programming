/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.heranca;

/**
 *
 * @author Alunoinf_2
 */
public class HerancaTeste {

    public static void main(String[] args) {

        Pessoa pessoa = new Cliente("Carlos", "Goiânia", "3521-1181", "191",
                "Solteiro", "Masculino", 5000.00, "Professor");

        System.out.println("Dados do Cliente: " + pessoa.toString());

        if (pessoa instanceof Cliente) {
            Cliente c = (Cliente) pessoa;
            c.adicionaInteresse("Futebol");;
            c.adicionaInteresse("Literatura");
            c.adicionaInteresse("Política");
            String algumInteresse = c.consultaInteresse("Futebol");
            
            if (algumInteresse != null) {
                System.out.println("algumInteresse");
            } else {
                System.out.println("Nenhum interesse encontrado!");
            }
            
            c.removeInteresse("Futebol");
            System.out.println(c.getInteresses().toString());
        }
    }
}
