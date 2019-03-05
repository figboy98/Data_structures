import java.util.Scanner;
public class Cardinais{
	
	public static char[][] lerMatriz(){
		
		
		Scanner stdin= new Scanner(System.in);
		
		int L= stdin.nextInt();
		int C= stdin.nextInt();
		
		stdin.nextLine();
		
		char[][] matriz = new char[L][C];

	for(int i = 0; i < L; i++){
		String line = stdin.nextLine();
			for(int j = 0; i < C; j++){
				matriz[i][j] = line.charAt(j);
			}
		}	
		
	for(int i=0; i<L; i++){
		for(int j=0; j<C; j++){
			System.out.println(matriz[i][j]);
		}
	}
		
	
	return matriz;
	
}
	
		
	
	
	public static void main(String []args){
		
		char aux[][]= new char[2][2];
		
		lerMatriz();
		
		
	}
}
