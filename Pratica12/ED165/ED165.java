import java.util.*;
class ED165{
public static BSTree<Integer> ArvoreSomas(int[] a){
	
	BSTree<Integer> somas = new BSTree<Integer>();
	 for(int i=0; i<a.length; i++){
		 for(int j=0; j<a.length; j++){
			int aux=somas(a, i, j);
			if(!somas.contains(aux)) somas.insert(aux);
		}
	 }
	 return somas;
 }
 
 public static int somas(int[] a, int i, int j){
	 int aux=a[i]+a[j];
	 return aux;
 }
 
 public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 int size=in.nextInt();
	 int[] numeros= new int [size];
	 
	 for(int i=0; i<size; i++){
		 numeros[i]=in.nextInt();
	 }
	 BSTree<Integer> aux= ArvoreSomas(numeros);
	 int perguntas=in.nextInt();
	 
	 for(int i=0; i<perguntas; i++){
		 int num=in.nextInt();
		 System.out.print(num +": ");
		 if(aux.contains(num)) System.out.println("sim");
		 else System.out.println("nao");
	 }
 }
}
	 
