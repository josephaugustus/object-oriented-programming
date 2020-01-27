package aula03.as3b.exercicio03;

public class Elevador {

    private int andarAtual;
    private int capacidade;
    private int quantidadePessoas;
    private int totalAndar;

    public Elevador(int totalAndar, int capacidade) {
        setTotalAndares(totalAndar);
        setCapacidade(capacidade);
        setAndarAtual(0);
        setQuantidade(0);
    }

    public void setAndarAtual(int andar) {
        this.andarAtual = andar;
    }

    public int getAndarAtual() {
        return this.andarAtual;
    }

    public void setTotalAndares(int andar) {
        this.totalAndar = andar;
    }

    public int getTotalAndares() {
        return this.totalAndar;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadePessoas = quantidade;
    }

    public int getQuantidade() {
        return this.quantidadePessoas;
    }

    public void entra() {
        if (this.quantidadePessoas < this.capacidade) {
            this.quantidadePessoas++;
        } else {
            System.out.println("Capacidade maxima antigida!");
        }
    }

    public void sai() {
        if (this.quantidadePessoas > 0) {
            this.quantidadePessoas--;
        } else {
            System.out.println("Não tem ninguem!");
        }
    }

    public void sobe() {
        if (this.andarAtual < this.totalAndar) {
            this.andarAtual++;
        } else {
            System.out.println("Voce está no último andar!");
        }
    }

    public void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
        } else {
            System.out.println("Já está no terreo!");
        }
    }
}
