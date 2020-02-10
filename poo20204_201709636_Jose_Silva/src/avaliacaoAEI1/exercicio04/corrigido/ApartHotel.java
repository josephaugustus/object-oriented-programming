package br.com.gilmario.poo20204gilmar.avaliacaoAEI1.exercicio04.corrigido;

public class ApartHotel extends Apartamento {
    private double rentabilidadeMensal;

    public ApartHotel(int quartos, int banheiros, String setor, double rentabilidade){
        super(quartos, banheiros, setor);
        this.rentabilidadeMensal = rentabilidade;
    }

    @Override
    public String mostraApartamento() {
        return super.mostraApartamento() + ", Apart Hotel / Flat";
    }
}
