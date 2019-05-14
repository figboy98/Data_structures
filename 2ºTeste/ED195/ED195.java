import java.util.*;
public class ED195{

public static boolean balanced(String s){
	MyStack<Character> pilha = new LinkedListStack<Character>();
	//System.out.println(s.length());
	if((s.length()%2) !=0) return false;
	
	for(int i=0; i< s.length(); i++){
		char aux=s.charAt(i);
		if(aux =='(' || aux=='['){
			pilha.push(aux);
		}
		
		else if(aux==')'){
			if(pilha.top() == '(') pilha.pop();
			else return false;
		}
		
		else if(aux==']'){
			if(pilha.top() == '[') pilha.pop();
			else return false;
		}
	}
	
	if(pilha.isEmpty()) return true;
	return false;
}
	
public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	//int size=in.nextInt();
	//for(int i=0; i<size; i++){
		String s= in.nextLine();
		if(balanced(s)) System.out.println("true");
		else System.out.println("false");
	//}
}
}
