package aula12.salaAula.state;

public class PortaAberta implements EstadosPorta {

    public void abrir(Porta p) {
        System.out.println("Já estou aberta");
    }

    public void fechar(Porta p) {
        p.setEstadoAtual(new PortaFechada());
    }

    @Override
    public void trancar(Porta p) {
        System.out.println("Estou aberta, preciso ser fechada primeiro");
    }

    @Override
    public void destrancar(Porta p) {
        System.out.println("Não é possível, pois estou aberta");
    }

}
