package aula12.as10b.exercicio04;

public class Indeferido implements Status {

    public void arquivado(Processo proc) {
        proc.setStatus(new Arquivado());
    }

    public void deferido(Processo proc) {
        System.out.println("O processo já está indeferido!)");
    }

    public void indeferido(Processo proc) {
        System.out.println("O processo já foi indeferido!");
    }

    public void cancelado(Processo proc) {
        proc.setStatus(new Cancelado());
    }

    @Override
    public void protocolado(Processo processo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
