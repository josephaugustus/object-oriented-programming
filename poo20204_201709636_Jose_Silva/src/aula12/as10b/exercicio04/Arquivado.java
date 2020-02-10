package aula12.as10b.exercicio04;

public class Arquivado implements Status {

    public void arquivado(Processo proc) {
        System.out.println("O processo já foi arquivado!");
    }

    public void deferido(Processo proc) {
        System.out.println("O processo já está arquivado!");
    }

    public void indeferido(Processo proc) {
        System.out.println("O processo já está arquivado!");
    }

    public void cancelado(Processo proc) {
        System.out.println("O processo já foi arquivado!");
    }

    @Override
    public void protocolado(Processo processo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
