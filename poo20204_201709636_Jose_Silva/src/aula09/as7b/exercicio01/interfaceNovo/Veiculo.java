package aula09.as7b.exercicio01.interfaceNovo;

public class Veiculo implements Modelo {

    private int placa;
    Empregado responsavel;

    public Veiculo(int placa, Empregado responsavel) {
        this.placa = placa;
        this.responsavel = responsavel;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public Empregado getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Empregado responsavel) {
        this.responsavel = responsavel;
    }
    
    public void imprimir() {

    }

    public String toString() {
        return toString();
    }

}
