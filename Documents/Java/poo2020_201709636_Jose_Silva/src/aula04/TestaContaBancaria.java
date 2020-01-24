/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.herancaContaBancaria;
import aula04.herancaContaBancaria.ContaBancaria;
import aula04.herancaContaBancaria.Cliente;
import java.util.List;
import java.util.ArrayList;

public class TestaContaBancaria {

    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumero(324566);
        contaBancaria.setSaldo(15000.0d);
        contaBancaria.setLimite(500.0d);
        contaBancaria.setTipo("Corrente");

        List<Cliente> clientes = new ArrayList<Cliente>();
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João Carlos dos Santos");
        cliente1.setEndereco("Rua Sucupira n. 35, Parque Amazonas, Goiânia/GO");
        cliente1.setCpf("191");
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria Aparecida de Oliveira");
        cliente2.setEndereco("Rua Sucupira n. 35, Parque Amazonas, Goiânia/GO");
        cliente2.setCpf("234.324.656-78");
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        
        contaBancaria.setTitulares(clientes);
        
        System.out.println("Nome dos titulares da conta: ");
        
        for (Cliente c : contaBancaria.getTitulares()){
            System.out.println(c.getNome());
        }
        
//      Scanner sc = new Scanner(System.in);
    }
}
