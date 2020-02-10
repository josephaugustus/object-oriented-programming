package aula11.as9b.exercicio02;

public class FactoryImagem extends GeraImagem {

    @Override
    public Visualizador criaimg(String tipo) {

        Visualizador vzl = null;

        if (tipo.equalsIgnoreCase("BPM")) {
            vzl = new VisualizadorBMP();

        } else if (tipo.equalsIgnoreCase("JPG")) {
            vzl = new VisualizadorJPG();

        } else {
            throw new IllegalArgumentException("Tipo de Pessoa inválido");
        }

        return vzl;
    }
}
