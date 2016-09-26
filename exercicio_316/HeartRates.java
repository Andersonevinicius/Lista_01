package exercicio_316;

public class HeartRates {

	private String nome, sobrenome;
	private int dia, mes, ano;
	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public int idade(){
		return (2016 - ano); 
		
	}
	public int frequenciaMaxima(){
		return 220 - (2016-ano);
	}
	public void frequenciaAlvo(){
		int calculo1, calculo2;
		calculo1 = (frequenciaMaxima()*50)/100;
		calculo2 = (frequenciaMaxima()*85)/100;
		System.out.println("Frequencia cardíaca alvo entre "+calculo1+" e "+calculo2);
		
	}



}
