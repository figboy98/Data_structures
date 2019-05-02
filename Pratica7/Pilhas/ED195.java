import java.util.Scanner;
public class ED195{
	
	public static boolean balanced(String s){
		MyStack<Character> pilha= new LinkedListStack<Character>();
			char aux;
			
			
		for(int i=0; i<s.length(); i++){

			if(s.charAt(i) =='(' || s.charAt(i)=='['){
				pilha.push(s.charAt(i));
			}
			if(s.charAt(i) ==')'){
				
				if(pilha.isEmpty()) return false;
				aux=pilha.top();
				if(aux != '(') return false;
				pilha.pop();
			}
			
			if(s.charAt(i) == ']'){
				if(pilha.isEmpty()) return false;
				aux=pilha.top();
				if(aux != '[') return false;
				pilha.pop();
			}

		}
		
		if(pilha.isEmpty() == true) return true;
		
		return false;
}


public static void main(String[]args){
	Scanner stdin= new Scanner(System.in);
	int size=stdin.nextInt();
	stdin.nextLine();
	
	for(int i=0; i<size; i++){
		String str=stdin.nextLine();
		if(balanced(str)) 
			System.out.println("true");
		else
			System.out.println("false");
}
}
}

				
