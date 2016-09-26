package exercicio_313;

public class Invoice {
	
		private String numero;
		private String descricao;
		private int quantidade;
		private double preco;

		public Invoice(String numero, String descricao, int quantidade, double preco){
			this.numero = numero;
			this.descricao = descricao;
			this.quantidade= quantidade;
			this.preco = preco;			
			
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public int getQuantidade() {
			if (quantidade<0){
				quantidade = 0;
				return quantidade;
			}else{
				return quantidade;
			}
			
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public double getPreco() {
			if (preco<0){
				preco = 0;
				return preco;
				
			}else{
				return preco;
				
			}
			
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public double getInvoiceAmount (){
			double fatura;
			fatura = quantidade*preco;
			return fatura;
		}
}
