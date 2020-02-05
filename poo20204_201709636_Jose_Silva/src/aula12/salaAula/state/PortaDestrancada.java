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
public class PortaDestrancada implements EstadosPorta {

    public void abrir(Porta p) {
        p.setEstadoAtual(new PortaAberta());
    }

    public void fechar(Porta p) {
        System.out.println("Já estou fechada e destrancada");
    }

    public void trancar(Porta p) {
        p.setEstadoAtual(new PortaTrancada());
    }

    public void destrancar(Porta p) {
        System.out.println("Já estou destrancada");
    }
}
