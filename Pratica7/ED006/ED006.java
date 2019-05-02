import java.util.*;
import java.io.*;
public class ED006{


public  static void main(String[] args){
	
	
	
	Scanner stdin=new Scanner(System.in);
	
		
	int casos=stdin.nextInt();
	
	for(int l=0; l<casos; l++){
		stdin.nextLine();
		CircularLinkedList<String> lista= new CircularLinkedList<String>();
		
		String str=stdin.nextLine();

		String aux[]=str.split(" ");
	
	
		for(int i=0; i<aux.length; i++){
			lista.addLast(aux[i]);
		}
		
		//System.out.print(lista);
	
		int numJogadores=stdin.nextInt();
	
		CircularLinkedList<String> jogadores= new CircularLinkedList<String>();
		
		String in;
	
		for(int i=0; i<numJogadores; i++){
			in=stdin.next();
			jogadores.addLast(in);
		}
		
		for(int i=0; i<numJogadores-1; i++){
			for(int k=0; k<lista.size(); k++){
				jogadores.rotate();
				
			}
			jogadores.removeLast();
		}	
	
			if(jogadores.getLast().equals("Carlos")) System.out.println("O Carlos nao se livrou");
	
			else{
				System.out.println("O Carlos livrou-se "+ "(coitado do "+ jogadores.getLast() + "!)"); 
		}	 

	
	
} 
	
	
}
		
}



