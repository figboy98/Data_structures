import java.util.Scanner;

public class Losango{
	public static void line(char b, int n, int blankSpace){ //char= fonte do losango, n=nº de simbolos na linha, blankSpace= espaços em branco em cad linha
		for(int i=0; i<(blankSpace/2); i++){
			System.out.print(' ');
		}
		for(int i=0; i<n; i++){
			System.out.print(b);
		}
	}

	public static void desenhaLosango(int n){// n= tamanho do losango
		int blankSpaces=0;
		for(int i=1; i<=n; i+=2){
			blankSpaces=n-i;
			line('#',i, blankSpaces);
			System.out.println();
		}
		
		for(int i=(n-2); i>=0; i-=2){
			blankSpaces=n-i;
			line('#',i, blankSpaces);
			System.out.println();
		}
	} 
		
		
		
		
		
		
		
		
		
	public static void main(String[] args){
		System.out.print("Escreva o tamanho do losango: ");
		Scanner input= new Scanner(System.in);
		int size= input.nextInt();
		desenhaLosango(size);
		
		
	}
}
		
		
