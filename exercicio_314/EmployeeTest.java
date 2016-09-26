package exercico_314;

public class EmployeeTest {
	public static void main(String[] args){
		
		double aumento1, aumento2;
		Employee test1, test2;
		
		test1 = new Employee("Vin�cius", "Vitor", 800.50);
		test2 = new Employee("Jos�", "Jo�o", 1000.62);
		
		
		System.out.println("1� Pessoa: ");
		System.out.println("Nome: "+test1.getNome());
		System.out.println("Sobre-nome: "+test1.getSobrenome());
		System.out.println("Sal�rio anual: "+test1.getSalarioMensal()*12);
		
		
		System.out.println("\n"+"2� Pessoa: ");
		System.out.println("Nome: "+test2.getNome());
		System.out.println("Sobre-nome: "+test2.getSobrenome());
		System.out.println("Sal�rio anual: "+test2.getSalarioMensal()*12);
		
		//calcular o aumento de 10%
		
		aumento1 = (test1.getSalarioMensal()*0.1);
		aumento2 = (test2.getSalarioMensal()*0.1);
		test1.setSalarioMensal(800.50+aumento1);
		test2.setSalarioMensal(1000.62+aumento2);
		
		System.out.println("\n"+"Aumento salarial da 1� Pessoa: ");
		System.out.println("Nome: "+test1.getNome());
		System.out.println("Sobre-nome: "+test1.getSobrenome());
		System.out.println("Sal�rio anual com aumento de 10%: "+test1.getSalarioMensal()*12);
		
		
		System.out.println("\n"+"Aumento salarial da 2� Pessoa: ");
		System.out.println("Nome: "+test2.getNome());
		System.out.println("Sobre-nome: "+test2.getSobrenome());
		System.out.println("Sal�rio anual com aumento de 10%: "+test2.getSalarioMensal()*12);
		

		
		
		
		
	}

}
