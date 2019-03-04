import java.util.Scanner;

public class Losango{
	
	public static void linha(int ponto, int cardinal){
		
		for(int i=0; i<(ponto/2); i++){
			System.out.print(".");
		}
		
		for(int i=0; i<cardinal; i++){
			System.out.print("#");
		}
		
		for(int i=0; i<(ponto/2); i++){
			System.out.print(".");
		}
		
		System.out.println();
	}
	
	
	public static void desenhaLosango (int n) { //n=tamanho do losango
		
		for(int i=1; i<n; i+=2){
			linha(n-i, i);
		}
		
		for(int i=n; i>0; i-=2){
			linha(n-i, i);
		}
	}
	
	public static void main(String [] args){
		
		Scanner stdin= new Scanner(System.in);
		
		int size= stdin.nextInt();
		
		desenhaLosango(size);
		}
	}
	
	
