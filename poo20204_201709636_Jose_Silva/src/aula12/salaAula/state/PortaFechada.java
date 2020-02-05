package aula12.salaAula.state;

public class PortaFechada implements EstadosPorta {

    public void abrir(Porta p) {
        p.setEstadoAtual(new PortaAberta());
    }

    public void fechar(Porta p) {
        System.out.println("Já estou fechada");
    }

    @Override
    public void trancar(Porta p) {
        p.setEstadoAtual(new PortaTrancada());
    }

    @Override
    public void destrancar(Porta p) {
        System.out.println("Estou fechada, mas não trancada");
    }
}
