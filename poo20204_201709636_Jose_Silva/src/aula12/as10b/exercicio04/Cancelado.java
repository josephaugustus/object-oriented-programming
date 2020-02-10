package aula12.as10b.exercicio04;

public class Cancelado implements Status {

    public void arquivado(Processo proc) {
        proc.setStatus(new Arquivado());
    }

    public void deferido(Processo proc) {
        System.out.println("O processo já está cancelado!");
    }
    
    public void indeferido(Processo proc) {
        System.out.println("O processo já está cancelado!");
    }

    public void cancelado(Processo proc) {
        System.out.println("O processo já foi cancelado!");
    }

    @Override
    public void protocolado(Processo processo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
