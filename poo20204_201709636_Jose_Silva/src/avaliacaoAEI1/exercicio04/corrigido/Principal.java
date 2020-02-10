package br.com.gilmario.poo20204gilmar.avaliacaoAEI1.exercicio04.corrigido;

public class Principal {
    public static void main(String[] args) {

        Apartamento[] apartamentos = new Apartamento[4];
        apartamentos[0] = new Apartamento(3,2,"Norte");
        apartamentos[1] = new Apartamento(3,3,"Sul");
        apartamentos[2] = new ApartHotel(1,1,"Leste",15000.00);
        apartamentos[3] = new ApartHotel(1,1,"Oeste", 12000.00);

        for(int i = 0; i < 4; i++){
            System.out.println(apartamentos[i].mostraApartamento());
            System.out.println("Quantidade de Apartamentos: " + apartamentos[1].quantidadeApartamentos);
        }
    }
}
