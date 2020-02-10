package aula11.as9b.exercicio02;

public class VisualizarTest {

    public static void main(String[] args) {

        FactoryImagem g = new FactoryImagem();

        Visualizador vlz = g.criaimg("JPG");
        vlz = g.criaimg("BPM");
         
        vlz.Visualizar();
        vlz.Visualizar();

        vlz = g.criaimg("BPM");

        vlz.Visualizar();

    }
}
