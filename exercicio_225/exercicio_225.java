package exercicio_225;
import java.util.Scanner;

public class exercicio_225 {

    
    public static void main(String[] args) {
        int num1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número: ");
        num1 = scan.nextInt();
        
        if (num1%2==0){
            System.out.println("Esse número é par!");
        }else{
            System.out.println("Esse número é impar!");
        }
      
    }
    
}