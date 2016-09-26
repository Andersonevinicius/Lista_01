package exercicio_002;

import java.util.Scanner;
public class exercicio_002{
	public static void main(String[] argss){
		Scanner scan = new Scanner(System.in);
		
		int numero, mult, var;
		System.out.println("Digite um numero: ");
		numero = scan.nextInt();
		
		mult = 1;
		var = 0;
		while(var < numero){
			mult = mult*numero;
			numero = numero-1;
			
		}
		System.out.println("Fatorial = "+mult);	
			
	}
	
}