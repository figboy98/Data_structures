import java.util.Scanner;
import java.lang.*;
public  class ED005{
	public static boolean contas(MyStack<Integer> pilha, char a){
		if(pilha.size() <2) return false;
		
		int aux1=pilha.pop();
		int aux2=pilha.pop();
		int aux3=0;
	
		switch(a){
			case '+':
				aux3=aux2+aux1;
				break;
				
			case '-': 
				aux3=aux2-aux1;
				
				break;
				
			case '/' :
				aux3=aux2/aux1;
			
				break;
				
			case '*': 
				aux3=aux2*aux1;
		
				break;
			default:
				break;
			}
			pilha.push(aux3);
			return true;
			
		}
		
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			boolean check=true;
			
			int iteracoes= input.nextInt();
			
			input.nextLine();
			
			for(int i=0; i<iteracoes; i++){
				MyStack<Integer> pilha= new LinkedListStack<Integer>();
				String temp;
				temp=input.nextLine();
				Scanner str= new Scanner(temp);
				String aux;
				while(str.hasNext()){
					aux=str.next();
					
					if(Character.isDigit(aux.charAt(0))){ 
						int num= Integer.parseInt(aux);
						pilha.push(num);
						
					}
					else{ 
						char token= aux.charAt(0);
						//System.out.println(token);
						check=contas(pilha,token);	
					}
					//System.out.println(pilha);
				}
				if(pilha.size() !=1) check=false;
				if(check==true) System.out.println(pilha.top());
				if(check==false) System.out.println("Expressao Incorrecta");
			}
		}
				
	}
	
	
	
	 
	
	
				
		
