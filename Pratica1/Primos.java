import  java.util.Scanner;


public class Primos {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num= input.nextInt();
		decomporPrimos(num);
	}
		
	
		
	public static void decomporPrimos(int n){
		int i=2;
		while(i<=n){
			
			if( n%i ==0){
				n=(n/i);
				
				if(n ==1){
				System.out.print(i);
				}
				
				else{
				System.out.print(i + "x");
				}
			}
			
			else{
				i++;
			}
		}
		System.out.println();
	}
}


