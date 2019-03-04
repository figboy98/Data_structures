import java.util.Scanner;

public class Palindromo{
	
	public static void Normaliza(char v[]){ //32 a 48
		v=toLowerCase(v);
		
		
		for(int i=0; i<v.length; i++){
			System.out.print(v[i]);
		}
	}
	
	
	public static void main( String [] args){
		
		Scanner stdin = new Scanner(System.in);
		
		int v= stdin.hasNextLine();
		
		Normaliza(v);
	}
}
			
