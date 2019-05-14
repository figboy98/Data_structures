public class ED194{
	public static void reverse(MyStack<Integer> s, int n){
		int temp[]= new int[n];
		for(int i=0; i<n; i++){
			temp[i]=s.pop();
		}
		
		for(int i=0; i<n; i++){
			s.push(temp[i]);
		}
	}
public static void main(String[] args){	
	      MyStack<Integer> s = new LinkedListStack<Integer>();
      //MyStack<Integer> s = new ArrayStack<Integer>();

      // Exemplo de insercao de elementos na pilha
      for (int i=1; i<=8; i++)
         s.push(i); // insere i no topo da pilha
      System.out.println(s);
	
	reverse(s, 3);
	System.out.println(s);

}

}
