package aula13.salaAula.excecao;

public class Calculadora {

    public int dividir(int a, int b) throws ArithmeticException{
        return a / b;
           }
    
    public int somar (int[] numeros){
        int tamanho =  numeros.length;
        int soma = 0;
        for(int i = 0; i <= tamanho; i++){
            soma += numeros[i];
        }
        return soma;
    }

    
//        int result = 0;
//
//        try {
//            result = a / b;
//        } catch (ArithmeticException e) {
//            System.out.println("O segundo número dever " + "diferente de zero");
//        }
//        return result;
//    }
//    //        if (b != 0){
//    //            result = a / b;
//    //        } else {
//    //            System.out.println("O segundo número dever " + "diferente de zero");
//    //        }
//
//    public static void main(String[] args) {
//        Calculadora app = new Calculadora();
//        int a = 10;
//        int b = 0;
//        System.out.println("Resultado da divisão de " + a + " por " + b
//                + " = " + app.dividir(a, b));
//    }
}
