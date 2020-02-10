package aula12.as10b.exercicio04;

public interface Status {

    public void protocolado(Processo processo);

    public void arquivado(Processo processo);
    
    public void deferido(Processo processo);

    public void indeferido(Processo processo);

    public void cancelado(Processo processo);

}
