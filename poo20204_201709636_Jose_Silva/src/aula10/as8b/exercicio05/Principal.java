package aula10.as8b.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Funcionario> f = new ArrayList<Funcionario>();

        double custoTotal = 0;
        double custoGraduado = 0;
        double custoEnsinoMedio = 0;
        double custoEnsinoBasico = 0;

        Graduacao gdo1 = new Graduacao("Antonio", 1490, "Colégio Planeta", "Colégio Atheneu", "UFG", "Gerente");
        Graduacao gdo2 = new Graduacao("Carlos", 1389, "Colégio Planeta", "Colégio Atheneu", "UFG", "Supervisor");
        Graduacao gdo3 = new Graduacao("Maria", 1328, "Colégio Planeta", "Colégio Planeta", "IFG", "Supervisora");
        EnsinoMed em1 = new EnsinoMed("Pedro", 1948, "Colégio IEG", "CEPAE UFG", "Supervisor");
        EnsinoMed em2 = new EnsinoMed("Elson", 1639, "Colégio IEG", "CEPAE UFG", "Vendedor");
        EnsinoMed em3 = new EnsinoMed("Marcos", 1930, "Colégio IEG", "CEPAE UFG", "Vendedor");
        EnsinoMed em4 = new EnsinoMed("Lauro", 1039, "Colégio IEG", "CEPAE UFG", "Vendedor");
        EnsinoBasic ebc1 = new EnsinoBasic("Iara", 1938, "Colégio IEG", "Vendedora");
        EnsinoBasic ebc2 = new EnsinoBasic("Eduarda", 1039, "Colégio IEG", "Vendedora");
        EnsinoBasic ebc3 = new EnsinoBasic("Leandro", 1039, "Colégio WR", "Vendedor");

        f.add(gdo1);
        f.add(gdo2);
        f.add(gdo3);
        f.add(em1);
        f.add(em2);
        f.add(em3);
        f.add(em4);
        f.add(ebc1);
        f.add(ebc2);
        f.add(ebc3);

        for (int i = 0; i < 10; i++) {
            custoTotal += f.get(i).getSalario() + f.get(i).getAdicional();

            if (f.get(i) instanceof Graduacao) {
                custoGraduado += f.get(i).getSalario() + f.get(i).getAdicional();
            } else if (f.get(i) instanceof EnsinoMed) {
                custoEnsinoMedio += f.get(i).getSalario() + f.get(i).getAdicional();
            } else if (f.get(i) instanceof EnsinoBasic) {
                custoEnsinoBasico += f.get(i).getSalario() + f.get(i).getAdicional();
            }
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("----------- RELATÓRIO DE CUSTEIO --------------");
        System.out.println("-----------------------------------------------\n");
        System.out.println("Gastos totais R$ " + custoTotal);
        System.out.println("\n----- Gastos por funcionários ------");
        System.out.println("Funcionário ensino básico: " + custoEnsinoBasico);
        System.out.println("Funcionário ensino médio: " + custoEnsinoMedio);
        System.out.println("Funcionário ensino superior: " + custoGraduado);

        for (int i = 0; i < 10; i++) {
            System.out.println("-----------------------------------------------");
            System.out.println(f.get(i));
        }
    }
}
