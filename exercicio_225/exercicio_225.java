package exercicio_225;
import java.util.Scanner;

public class exercicio_225 {

    
    public static void main(String[] args) {
        int num1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um n�mero: ");
        num1 = scan.nextInt();
        
        if (num1%2==0){
            System.out.println("Esse n�mero � par!");
        }else{
            System.out.println("Esse n�mero � impar!");
        }
      
    }
    
}