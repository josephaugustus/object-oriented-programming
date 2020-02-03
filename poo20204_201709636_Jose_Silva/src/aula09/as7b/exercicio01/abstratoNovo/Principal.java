package aula09.as7b.exercicio01.abstratoNovo;

public class Principal {

    public static void main(String[] args) {

    Empregado empregado = new Empregado("tituloDoProjeto", "2230", "Diego", 34);
    Veiculo veiculo = new Veiculo("tituloDoProjeto", 35668, empregado);
	
        veiculo.imprimir();
        empregado.imprimir();
//        empregado.getTituloProjeto();
        System.out.println(empregado);
        System.out.println(veiculo);
    }
}
