package exercicio_001;

public class Exercicio_001 {
    public static void main(String[] args){
	int [][] matriz1 = new int [3][2];
		
	matriz1 [0][0] = 4;
	matriz1 [0][1] = 9;
		
	matriz1 [1][0] = 8;
	matriz1 [1][1] = 7;
		
	matriz1 [2][0] = 6;
	matriz1 [2][1] = 5;
		
	for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[i].length; j++){
		System.out.print(matriz1[i][j]+" ");
            }
            System.out.println();
	}
		
	System.out.println("Segunda matriz");
	int [][] nomes = new int [2][2];
		
	nomes [0][0]= 2;
	nomes [0][1]= 3;
		
	nomes [1][0]= 4;
	nomes [1][1]= 5;
		
	for(int i=0; i<nomes.length; i++){
            for(int j=0; j<nomes[i].length; j++){
		System.out.print(nomes[i][j]+" ");
            }
            System.out.println();
	}
	System.out.println("Multiplicação das duas primeiras matrizez");
		
	int [][] resultado = new int[3][2];
		
	resultado [0][0] = matriz1[0][0]*nomes[0][0] + matriz1[0][1]*nomes[1][0]; 
	resultado [0][1] = matriz1[0][0]*nomes[0][1] + matriz1[0][1]*nomes[1][1];
                
        resultado [1][0] = matriz1[1][0]*nomes[0][0] + matriz1[1][1]*nomes[1][0]; 
	resultado [1][1] = matriz1[1][0]*nomes[0][1] + matriz1[1][1]*nomes[1][1];
                
        resultado [2][0] = matriz1[2][0]*nomes[0][0] + matriz1[2][1]*nomes[1][0]; 
	resultado [2][1] = matriz1[2][0]*nomes[0][1] + matriz1[2][1]*nomes[1][1];           
                
          
                
		
	for(int i=0; i<resultado.length; i++){
            for(int j=0; j<resultado[i].length; j++){
		System.out.print(resultado[i][j]+" ");
            }
            System.out.println();
        }
	
    }

}
