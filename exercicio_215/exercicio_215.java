package exercicio_215;

import java.util.Scanner;

class Matematica {
    int soma(int x, int y){
        return (x+y);
    }
    int subtracao(int x, int y){
        return (x-y);
    }
    int multiplicacao(int x, int y){
        return (x*y);
    }
    float divisao(float x, float y){
        return (x/y);
    }
        
  }

public class exercicio_215 {

   
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        Matematica mat = new Matematica();
        
        System.out.println("Digite um numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite outro numero: ");
        num2 = scan.nextInt();
        
        System.out.println("Resultados: ");
        System.out.println("Soma = " + mat.soma(num1, num2));
        System.out.println("Subtração = " + mat.subtracao(num1, num2));
        System.out.println("Multiplicação = " + mat.multiplicacao(num1, num2));
        System.out.println("Divisão = " + mat.divisao(num1, num2));
    }
}

    