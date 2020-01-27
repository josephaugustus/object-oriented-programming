package aula03.as3b.exercicio04;

public class Principal {

    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        controle.setBuscarCanal(5);
        controle.setAumentarSom();
        controle.setAumentarSom(); 
        controle.setAumentarSom(); 
        controle.setAumentarSom(); 
        controle.setDiminuirSom();

        controle.Consulta();
    }
}
