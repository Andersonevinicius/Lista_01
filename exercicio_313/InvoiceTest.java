package exercicio_313;

public class InvoiceTest {
	public static void main(String[] args){
		Invoice teste = new Invoice("20", "Tesoura", 2, 2.5);
		
		System.out.println("Número do pedido: "+teste.getNumero());
		System.out.println("Nome do pedido: "+teste.getDescricao());
		System.out.println("Quantidade: "+teste.getQuantidade());
		System.out.println("Preço por unidade: "+teste.getPreco());
		System.out.println("Fatura: "+teste.getInvoiceAmount());
		
		
		//mudando os valores
		System.out.println("\n"+"Mudando valores*"+"\n");
		teste.setNumero("3");
		teste.setDescricao("Lapis");
		teste.setQuantidade(0);
		teste.setPreco(1.75);
		
		System.out.println("Número do pedido: "+teste.getNumero());
		System.out.println("Nome do pedido: "+teste.getDescricao());
		System.out.println("Quantidade: "+teste.getQuantidade());
		System.out.println("Preço por unidade: "+teste.getPreco());
		System.out.println("Fatura: "+teste.getInvoiceAmount());
		

	}

}
