package aula09.as7b.exercicio01.abstratoNovo;

public class Veiculo extends Modelo {

    private int placa;
    Empregado responsavel;

    public Veiculo(String tituloDoProjeto, int placa, Empregado responsavel) {
        super(tituloDoProjeto);
        this.setPlaca(placa);
        this.responsavel = responsavel;
    }

    public Empregado getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Empregado responsavel) {
        this.responsavel = responsavel;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void imprimir() {
        System.out.println("\nPlaca do Veiculo: " + this.placa);
        System.out.println("\nCódigo do Responsável pelo Veiculo: " + responsavel.getCodigo());
        System.out.println("\nNome do Responsável pelo Veiculo: " + responsavel.getNome());
        System.out.println("\nIdade do Responsável pelo Veiculo: " + responsavel.getIdade());
    }

    @Override
    public String toString() {
        return "\nO veículo de placa " + placa + ", tem como responsável " + responsavel;
    }

}
