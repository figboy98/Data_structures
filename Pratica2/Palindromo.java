import java.util.Scanner;
import java.lang.Object;
import java.lang.String;

public class Palindromo{
	
	public static String Normaliza(String frase){ //32 a 48
		int cont=0;
		frase=frase.toLowerCase();
		frase=frase.replaceAll("[^a-z]", "");
		
		return frase;
	}
	
	public static boolean isPalindrome(String frase){
		int size=frase.length();
		
		for(int i=0; i<frase.length(); i++){
			if(frase.charAt(i) != frase.charAt(size-1)){
				return false;
			}
			size--;
		}
		return true;
	}
	
	public static void main( String [] args){
		
		Scanner stdin = new Scanner(System.in);
		
		int size=stdin.nextInt();
		
		System.out.println(size);
		
		stdin.nextLine();
		
		for(int i=0; i<size; i++){
		
		String frase=stdin.nextLine();
		
		String novaFrase=Normaliza(frase);
		
		if(isPalindrome(novaFrase)){
			System.out.println("sim");
		}
		
		else{
			System.out.println("nao");
			}
		}
		
	}
}
			
