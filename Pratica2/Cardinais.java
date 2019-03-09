import java.util.Scanner;


class MatrixChar {
   char data[][]; // os elementos da matriz em si
   int linhas;     // numero de linhas
   int colunas;     // numero de colunas

   // construtor padrao de matriz
   MatrixChar(int r, int c) {
      data = new char[r][c];
      linhas = r;
      colunas = c;
   }

   // Ler os rows x cols elementos da matriz
 /*  public void read(Scanner in) {
	   String aux= new String();
      for (int i=0; i<rows; i++){
		aux = in.nextLine();
         for (int j=0; j<cols; j++){
			data[i][j] = aux.charAt(j);
   }
}
} */

	//Ler matrizChar
	
	public void read (Scanner in){
		
		String aux= new String();
		
		for(int i=0; i<linhas; i++){
			aux=in.nextLine();
			
			for(int j=0; j<colunas;j++){
				data[i][j]= aux.charAt(j);
			}
		}
	}
			

   // Representacao em String da matrix
  public String toString() {
      String ans = "";
      for (int i=0; i<linhas; i++) {
         for (int j=0; j<colunas; j++)
            ans += data[i][j];
         ans += "\n";
      }
      return ans;
   }
}

public class Cardinais{

	
	public static void main(String []args){
		Scanner stdin= new Scanner(System.in);
		int linhas= stdin.nextInt();
		int colunas= stdin.nextInt();
		
		MatrixChar cardinais= new MatrixChar(linhas,colunas);
		stdin.nextLine();
		
		cardinais.read(stdin);
		
		//procurar maior sequencia de # na horizontal
		int i;
		int j;
		int cont=0;
		int maior=0;
		int aparece=0;
		
		for(i=0; i<linhas;i++){
			for(j=0; j<colunas; j++){
				if(cardinais.data[i][j] == '#'){
					cont++;
				}
				
				else{
					if(cont >maior){
						maior=cont;
						aparece=0;
					}
					
					if(cont==maior){
						aparece++;
					}
					cont=0;

				}
			}
			
			if(cont >maior){
						maior=cont;
						aparece=0;
					}
					
			if(cont == maior){
				aparece++;
				}
					cont=0;
			}
		
		cont=0;
		//procurar maior sequencia na vertical
		
		for(i=0; i<colunas;i++){
			for(j=0; j<linhas; j++){
				if(cardinais.data[j][i] == '#'){
					cont++;
				}
				
				else{
					if(cont >maior){
						maior=cont;
						aparece=0;
					}
					
					if(cont==maior){
						aparece++;
					}
					cont=0;

				}
			}
			
			if(cont >maior){
						maior=cont;
						aparece=0;
					}
					
			if(cont == maior){
				aparece++;
				}
					cont=0;
			}
			
		
		System.out.println(maior+" "+ aparece); 
	}
}
	
