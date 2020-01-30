package aula04.as4b.exercicio01.alunos;

public class TesteAluno {

    public static void main(String[] args) {
        Departamento departamento = new Departamento("Faculdade de Enfermagem", "FANUT");
        Curso curso = new Curso("Enfermagem", "ENF", departamento);
        Aluno aluno = new Aluno("Maria da Silva", 201798543, 2017, curso);

        System.out.println(aluno);
    }
}
