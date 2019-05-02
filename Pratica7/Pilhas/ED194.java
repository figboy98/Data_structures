public class ED194{
	public static void reverse(MyStack<Integer> s, int n){
		int aux[]=new int[n];
		
		for(int i=0; i<n; i++){
			aux[i]=s.pop();
		}
		
		for(int i=0; i<n; i++){
			s.push(aux[i]);
		}
	}
}
	
/*	public static void main(String []args){
		
		MyStack<Integer> s = new LinkedListStack<Integer>();
		
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		
		System.out.println(s);
		
		reverse(s, 3);
		
		System.out.println(s);

		
	}
}*/
