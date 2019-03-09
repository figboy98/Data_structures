import java.util.Scanner;
		
public class Teste{

public  static void main(String []args){
	
	Scanner stdin= new Scanner(System.in);
	
	int linhas=stdin.nextInt();
	
	int colunas=stdin.nextInt();
	
	stdin.nextLine();
	
	String aux= new String();
		
		char matriz[][]= new char[linhas][colunas];
	
			for(int i=0;i<linhas;i++){
				aux= stdin.nextLine();
				
				for(int j=0; j<colunas; j++){
					matriz[i][j]=aux.charAt(j);
					}
				}
				
				System.out.println();
			
		for(int i=0; i<linhas;i++){
				for(int j=0; j<colunas; j++){
					
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}
			
			
		/*	int cont=0;
			int maior;
			int auxMaior;
			char aux;
			int i;
			int j;
			for(i=0; i<linhas; i++){
				for(j=0; j<colunas; j++){
					aux=matriz[i][j];
					if(aux== "#"){
						cont++;
						for(j; j<linhas; j++){
							aux= matriz[i][j];
							if(aux =="#"){
								cont++;
							}
							else{
								auxMaior=cont;
								cont=0;
							}
						}
						if(auxMaior > maior){
							maior=auxMaior;
						}
					}
				}
			}
			
			System.out.println(
								*/
						
}

	
}

		
	
