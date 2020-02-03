package aula09.as7b.exercicio01.interfaceNovo;

public class Principal {

    public static void main(String[] args) {

        Empregado empregado = new Empregado("tituloDoProjeto", "2230", 34);
        Veiculo veiculo = new Veiculo(35668, empregado);

        empregado.imprimir();
        veiculo.imprimir();
        System.out.println(veiculo);
    }
}
