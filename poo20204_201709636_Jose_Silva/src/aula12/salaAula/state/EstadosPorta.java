package aula12.salaAula.state;

public interface EstadosPorta {

    void abrir(Porta p);

    void fechar(Porta p);
    
    void trancar(Porta p);
    
    void destrancar(Porta p);
}
