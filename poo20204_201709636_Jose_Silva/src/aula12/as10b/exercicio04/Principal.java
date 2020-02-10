package aula12.as10b.exercicio04;

public class Principal {

    public static void main(String[] args) {

        Processo proc = new Processo();
        
        System.out.println("Status do processo: "
                + proc.getStatus().getClass().getSimpleName());

        proc.deferido();
        System.out.println("Status do processo: "
                + proc.getStatus().getClass().getSimpleName());
        
        proc.indeferido();
        System.out.println("Status do processo: "
                + proc.getStatus().getClass().getSimpleName());

        proc.cancelado();
        System.out.println("Status do processo: "
                + proc.getStatus().getClass().getSimpleName());

        proc.arquivado();
        System.out.println("Status do processo: "
                + proc.getStatus().getClass().getSimpleName());
    }

}
