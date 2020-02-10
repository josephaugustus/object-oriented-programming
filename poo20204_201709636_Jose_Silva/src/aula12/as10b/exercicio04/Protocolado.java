package aula12.as10b.exercicio04;

public class Protocolado implements Status {

    public void arquivado(Processo proc) {
        proc.setStatus(new Arquivado());
    }

    public void deferido(Processo proc) {
        proc.setStatus(new Deferido());
    }

    public void indeferido(Processo proc) {
        proc.setStatus(new Indeferido());
    }

    public void cancelado(Processo proc) {
        proc.setStatus(new Cancelado());
    }

    @Override
    public void protocolado(Processo processo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
