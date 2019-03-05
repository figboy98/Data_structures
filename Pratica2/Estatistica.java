import java.util.Scanner;
public class Estatistica{
	
	public static float media(int []array){
		int  cont=0,i;
		
		for(i=0; i<array.length; i++){
			cont+=array[i];
		}
	
		
		float media=((float)cont/i);		
		return media;
	}
	
	public static int amplitude(int []array){
		int max=array[0];
		int min=array[0];
		
		for(int i=0; i<array.length; i++){
			if(array[i] > max){
				max=array[i];
			}
			if(array[i] < min){
				min=array[i];
			}
		}
		
		int amp=max-min;
		return amp;
	}
	
	public static void main(String []args){
		Scanner stdin = new Scanner(System.in);
		
		int size= stdin.nextInt();
		int array[]= new int[size];
		for(int i=0; i<size; i++){
			array[i]= stdin.nextInt();
		}
		
		float media=media(array);
		int amp=amplitude(array);
		System.out.printf("%.2f%n", media);
		System.out.println(amp);
	}
}
			
