
package Aula01;
import javax.swing.JOptionPane;

public class CalcularSub {
     public static void main (String[]args){
        
        // Atributos
        String nome, n1, n2, nsubstutiva;
        double nota1, nota2, substutiva, media;
        
        nome = JOptionPane.showInputDialog("Digite o nome do aluno(a): ");

        n1 = JOptionPane.showInputDialog("Digite a n1: ");
        n2 = JOptionPane.showInputDialog("Digite a n2: ");
        
        //converte a String em double
        nota1 = Double.parseDouble(n1);
        nota2 = Double.parseDouble(n2);

        //Calcula a media 
        media = (nota1+nota2)/2;
        
        //Verifica se a média é superior ou igual a 6
        if (media>=6){
            JOptionPane.showMessageDialog(null,"Aluno " +nome+"\n"+"A média do aluno(a) é "+media+"\n"+"Aluno(a) Aprovado.","Situação do Aluno(a)",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Aluno " +nome+"\n"+"A media do aluno(a) é "+media+"\n"+"Deverá fazer Prova Substituta."+"\n"+"Pressione ok para digitar a nota da sub.","Situação do Aluno(a)", JOptionPane.WARNING_MESSAGE);
            
            //Recebendo e convertendo valor
            nsubstutiva = JOptionPane.showInputDialog("Digite a nota da Sub");
            substutiva = Double.parseDouble(nsubstutiva);

            //Calculando a nota da sub
            media = (substutiva + nota2)/2;

            if (media >=6 ){
                JOptionPane.showMessageDialog(null,"Aluno(a) " +nome+"\n"+"A média do aluno(a) é"+media+"\n"+"Aluno Aprovado","Situação do Aluno(a)",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Aluno(a)" +nome+"\n"+"A media do aluno é"+media+"+\n"+"Reprovado","Situação do Aluno(a)", JOptionPane.WARNING_MESSAGE);
            }
        }
       System.exit(0);
    }
}
