import java.io.*;
import java.util.*;
public class ED007{

public static boolean isParanthesis(char ch){
	if(ch=='(' || ch==')' || ch=='[' || ch == ']') return true;
	else return false;
}


	public static boolean balanced(MyStack<Character> pilha, char aux){
		
			char temp;
			
			if(aux =='(' || aux=='['){
				pilha.push(aux);
			}
				
			if(aux ==')'){
				
				if(pilha.isEmpty()) return false;
				temp=pilha.top();
				if(temp != '(') return false;
				pilha.pop();
			}
			
			if(aux == ']'){
				if(pilha.isEmpty()) return false;
				temp=pilha.top();
				if(temp != '[') return false;
				pilha.pop();
			}

			
		return true;
	}
		
	public static void main(String []args){
		
	
		Scanner stdin = new Scanner(System.in);
		int size= stdin.nextInt();
		stdin.nextLine();
	
	
		for(int i=0; i<size; i++){
			MyStack<Character> pilha= new LinkedListStack<Character>();
			String temp= stdin.nextLine();
			boolean erros=false;
			for(int j=0; j<temp.length(); j++){
				char aux= temp.charAt(j);
				if(isParanthesis(aux)){
					if(balanced(pilha, aux))
						continue;
					else if(!balanced(pilha,aux)){ 
						System.out.println("Erro na posicao " + j);
						erros=true;
						break;
					}
			}
		}
	
	if(pilha.isEmpty() && erros==false) 
		System.out.println("Expressao bem formada");
	
	else if(!pilha.isEmpty() && erros==false)
		System.out.println("Ficam parenteses por fechar");
	
}
}
}

