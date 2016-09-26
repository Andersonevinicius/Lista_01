package exercico_314;

public class EmployeeTest {
	public static void main(String[] args){
		
		double aumento1, aumento2;
		Employee test1, test2;
		
		test1 = new Employee("Vinícius", "Vitor", 800.50);
		test2 = new Employee("José", "João", 1000.62);
		
		
		System.out.println("1º Pessoa: ");
		System.out.println("Nome: "+test1.getNome());
		System.out.println("Sobre-nome: "+test1.getSobrenome());
		System.out.println("Salário anual: "+test1.getSalarioMensal()*12);
		
		
		System.out.println("\n"+"2º Pessoa: ");
		System.out.println("Nome: "+test2.getNome());
		System.out.println("Sobre-nome: "+test2.getSobrenome());
		System.out.println("Salário anual: "+test2.getSalarioMensal()*12);
		
		//calcular o aumento de 10%
		
		aumento1 = (test1.getSalarioMensal()*0.1);
		aumento2 = (test2.getSalarioMensal()*0.1);
		test1.setSalarioMensal(800.50+aumento1);
		test2.setSalarioMensal(1000.62+aumento2);
		
		System.out.println("\n"+"Aumento salarial da 1º Pessoa: ");
		System.out.println("Nome: "+test1.getNome());
		System.out.println("Sobre-nome: "+test1.getSobrenome());
		System.out.println("Salário anual com aumento de 10%: "+test1.getSalarioMensal()*12);
		
		
		System.out.println("\n"+"Aumento salarial da 2º Pessoa: ");
		System.out.println("Nome: "+test2.getNome());
		System.out.println("Sobre-nome: "+test2.getSobrenome());
		System.out.println("Salário anual com aumento de 10%: "+test2.getSalarioMensal()*12);
		

		
		
		
		
	}

}
