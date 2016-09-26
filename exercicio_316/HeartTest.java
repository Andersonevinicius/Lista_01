package exercicio_316;
import java.util.Scanner;

public class HeartTest {
	public static void main(String[] args){
		
		String nome, sobrenome;
		int dia, mes, ano;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = scan.next();
		System.out.println("Informe seu sobre-nome: ");
		sobrenome = scan.next();
		System.out.println("Informe o dia em que voc� nasceu: ");
		dia = scan.nextInt();
		System.out.println("Informe o m�s que voc� nasceu: ");
		mes = scan.nextInt();
		System.out.println("Informe o ano que voc� nasceu: ");
		ano = scan.nextInt();		
				
		HeartRates coracao = new HeartRates(nome, sobrenome, dia, mes, ano);
		
		System.out.println("Nome: "+nome);
		System.out.println("Sobre-nome: "+sobrenome);
		System.out.println("Data de nascimento: "+dia+"/"+mes+"/"+ano);		
		System.out.println("Idade = "+ coracao.idade());
		System.out.println("Frequencia card�aca = "+coracao.frequenciaMaxima());
		coracao.frequenciaAlvo();
		
		scan.close();
	}

}
