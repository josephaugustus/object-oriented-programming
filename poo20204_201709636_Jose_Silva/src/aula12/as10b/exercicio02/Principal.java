package aula12.as10b.exercicio02;

public class Principal {

    public static void main(String[] args) {
        
        Folder pasta1 = new Folder("Aula12");
        Folder pasta2 = new Folder("as10b");
        
        Archive exercicio02 = new Archive("AS10", 415.23);

        pasta1.addPastas(pasta2);
        pasta2.addArquivos(exercicio02);

        pasta1.exibirPastas();
        pasta1.exibirArquivos();
        pasta2.exibirPastas();
        pasta2.exibirArquivos();

    }
}
