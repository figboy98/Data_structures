import java.util.Scanner;
import java.io.*;

public class ReadNumbers {

   // Escrever os numeros guardados num array no stdout
   static void writeArray(int v[]) {
      for (int i=0; i<v.length; i++)          
         System.out.println("v[" + i + "] = " + v[i]);      
   }
   
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      int v[] = new int[10];     // Cria um novo array com espaço para 10 inteiros           
      int n = stdin.nextInt();   // Ler a quantidade de numeros que se seguem
      
      for (int i=0; i<n; i++)    // Ler os numeros a partir do stdin
         v[i] = stdin.nextInt();
      
      writeArray(v);             // Chamar procedimento que escreve
      
      System.out.println(ampl(v));
      
   }
   
   public static int ampl(int v[]){
	   
	   int max=max(v);
	   
	   int min=min(v);
	   
	   return max-min;
   }
	   
	public static int max(int v[]){
		
	   
	   int max=v[0];
	  
	   
	   for(int i=0; i<v.length; i++){
		   if(v[i] > max){
			   max=v[i];
		   }
	   }
	   return max;
   }
   
   public static int min(int v[]){
	   int min=v[0];
	   
	   for(int i=0; i<v.length; i++){
		   if(v[i] < min){
			   min=v[i];
		   }
	   }
	   return min;		  
}
}
