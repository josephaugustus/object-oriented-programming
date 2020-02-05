package aula12.salaAula.state;

public class PortaTrancada implements EstadosPorta {

    public void abrir(Porta p) {
        System.out.println("Estou trancada, preciso ser destrancada primeiro");
    }

    public void fechar(Porta p) {
        System.out.println("Já estou fechada e trancada");
    }

    public void trancar(Porta p) {
        System.out.println("Já estou trancada");
    }

    public void destrancar(Porta p) {
        p.estadoAtual = new PortaDestrancada();
    }
}
