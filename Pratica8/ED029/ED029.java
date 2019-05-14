import java.util.*;
class aviao{
	String nome;
	int tempo;
	int atraso;
	boolean levantar;
	boolean aterrar;
	
	
	//construtor
	aviao(String c, String a, int b){
		levantar=false;
		aterrar=false;
		
		if(c.equals("aterrar")) aterrar=true;
		if(c.equals("levantar")) levantar=true;
		nome=a;
		tempo=b;
		atraso=0;
	}
}

public class ED029{
	private static aviao filaAterrar[];
	private static aviao filaLevantar[];
	private static SinglyLinkedList<aviao> lista = new SinglyLinkedList<aviao>();
	
	private static void imprimerAvioes(){
		int size=filaLevantar.length;
		
		System.out.println(filaLevantar.length + " " + filaAterrar.length);
		
		for(int i=0; i<size; i++){
			aviao aux= filaLevantar[i];
			System.out.println(aux.nome + " " + aux.atraso);
			//System.out.println("Nome: " + aux.nome + "  atraso " + aux.atraso);
			//
		}
		
		size=filaAterrar.length;
		for(int i=0; i<size; i++){
			aviao aux= filaAterrar[i];
			System.out.println(aux.nome + " " + aux.atraso);
			//System.out.println("Nome: " + aux.nome + "  atraso " + aux.atraso);
		}
			
	}
	
	
	private static void lerInput(Scanner in){
		
		int levantar=in.nextInt();
		int aterrar=in.nextInt();
		in.nextLine();
		
		filaLevantar=new aviao[levantar];
		filaAterrar=new aviao[aterrar];

		String aux="levantar";
		
		for(int i=0; i<levantar; i++){
			String nome=in.next();
			int tempo=in.nextInt();
			aviao novo= new aviao(aux, nome, tempo);
			filaLevantar[i]=novo;
		}
		aux="aterrar";
		
		for(int i=0; i<aterrar; i++){
			String nome=in.next();
			int tempo=in.nextInt();
			aviao novo= new aviao(aux,nome,tempo);
			filaAterrar[i]=novo;
		}
		
		
	}
	
	private static void simular(){
		int aux1=filaAterrar.length;
		int aux2=filaLevantar.length;
		int clock=0;
		int min;
	
		
		int i=0;
		int j=0;
			
		while(true){
			if(i==aux1) break;
			if(j==aux2) break;
			
			aviao auxAterra=filaAterrar[i];
			aviao auxLevanta=filaLevantar[j];
			
			if(auxAterra.tempo < auxLevanta.tempo){
				if(clock< auxAterra.tempo) clock=auxAterra.tempo;
		
				int aux=clock-auxAterra.tempo;
				
				auxAterra.atraso=aux;
				clock++;
				
				i++;
			}
			
			else if(auxLevanta.tempo < auxAterra.tempo){
				if(clock<auxLevanta.tempo) clock=auxLevanta.tempo;
				int aux=clock-auxLevanta.tempo;
				auxLevanta.atraso=aux;
				clock++;
				
				j++;
			}
			
			else if(auxLevanta.tempo == auxAterra.tempo){
				if(clock <auxAterra.tempo) clock=auxAterra.tempo;
				int aux=clock-auxAterra.tempo;
				auxAterra.atraso=aux;
				
				clock++;
				i++;
			}
		}
		
		
		if(j<aux2){
			
			for(; j<aux2; j++){
				aviao auxLevanta=filaLevantar[j];
				if(clock <auxLevanta.tempo) clock=auxLevanta.tempo;
				int aux=clock-auxLevanta.tempo;
				auxLevanta.atraso=aux;
				clock++;
			}
		}
		
		if(i<aux1){
			for(; i<aux1; i++){
				aviao auxAterra= filaAterrar[i];
				if(clock < auxAterra.tempo) clock=auxAterra.tempo;
				int aux=clock-auxAterra.tempo;
				auxAterra.atraso=aux;
				clock++;
			}
		}
		
	}
	
	public static void main(String []args){
		Scanner in =  new Scanner(System.in);
		
		int casos=in.nextInt();
		
		for(int i=0; i<casos; i++){
			lerInput(in);
			simular();
			imprimerAvioes();
		}
		
	}
}
		
