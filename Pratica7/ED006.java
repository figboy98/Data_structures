import java.util.*;
import java.io.*;
public class ED006{


public  static void main(String[] args){
	
	CircularLinkedList<String> lista= new CircularLinkedList<String>();
	
	Scanner stdin=new Scanner(System.in);
	
	String str;
	int casos=stdin.nextInt();
	
	for(int l=0; l<casos; l++){
	
		str=stdin.nextLine();

		String aux[]=str.split(" ");
	
	
		for(int i=0; i<aux.length; i++){
			lista.addLast(aux[i]);
		}
		
		stdin.nextLine();
	
		int numJogadores=stdin.nextInt();
	
		String in;
	
		CircularLinkedList<String> jogadores= new CircularLinkedList<String>();
	
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
				System.out.println("O Carlos livrou-se "+ "(Coitado do "+ jogadores.getLast() + "!)");
		}	 
}
	
	//System.out.print(jogadores.getLast());
	
	
	
}
		
	
		
		

	
}



