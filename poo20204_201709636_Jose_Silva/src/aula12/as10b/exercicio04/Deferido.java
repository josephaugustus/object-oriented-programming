package aula12.as10b.exercicio04;

public class Deferido implements Status {

    public void arquivado(Processo proc) {
        proc.setStatus(new Arquivado());
    }

    public void deferido(Processo proc) {
        System.out.println("O processo já foi deferido!");
    }

    public void indeferido(Processo proc) {
        System.out.println("O processo já está deferido!");
    }

    public void cancelado(Processo proc) {
        proc.setStatus(new Cancelado());
    }

    @Override
    public void protocolado(Processo processo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
