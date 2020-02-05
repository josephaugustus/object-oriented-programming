/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.salaAula.state;

/**
 *
 * @author Alunoinf_2
 */
public class PortaTeste {
    public static void main(String[] args) {
        Porta p = new Porta();
        
        System.out.println(p.getEstadoAtual().getClass().getSimpleName());
        p.destrancar();
        System.out.println(p.getEstadoAtual().getClass().getSimpleName());
        p.trancar();
        System.out.println(p.getEstadoAtual().getClass().getSimpleName());
        p.abrir();
        System.out.println(p.getEstadoAtual().getClass().getSimpleName());
        p.fechar();
        System.out.println(p.getEstadoAtual().getClass().getSimpleName());
        p.abrir();
        System.out.println(p.getEstadoAtual().getClass().getSimpleName());
        
    }
}
