package exercicio_216;
import java.util.Scanner;


public class exercicio_216 {
 
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        num1 = scan.nextInt();
        System.out.println("Insira outro número: ");
        num2 = scan.nextInt();
        
        if (num1 > num2){
            System.out.println(num1 + " is larger");
        }
        else if (num2 > num1){
            System.out.println(num2 + " is larger");
        }
        else if (num1 == num2){
            System.out.println("These numbers are equal!");
        }
    }
    
}
