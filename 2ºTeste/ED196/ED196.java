import java.util.*;
class ED196{
	public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
		
		String nome;
		String fila;
		
		while(q.size() >0){
			nome=q.dequeue();
			fila=q.dequeue();
			//System.out.println(q.size());
			//System.out.println("Nome " + nome +" "+ fila);
			if(fila.equals("A")){
				a.enqueue(nome);
			}
			else if(fila.equals("B")){
				b.enqueue(nome);
			}
			
			else if(fila.equals("X")){
				if(a.size()< b.size()){
					a.enqueue(nome);
				}
				else if( b.size()<a.size()){
					b.enqueue(nome);
				}
				else if(b.size()==a.size()){
					continue;
				}
			}
		}
	}
	
	public static void main(String[] args){
		MyQueue<String> q = new LinkedListQueue<String>();
		Scanner in= new Scanner(System.in);
		int size=in.nextInt();
		in.nextLine();
		for(int i=0; i<size; i++){
			String nome= in.next();
			String fila=in.next();
			in.nextLine();
			q.enqueue(nome);
			q.enqueue(fila);
		}
		
	
		MyQueue<String> a = new LinkedListQueue<String>();
		MyQueue<String> b= new LinkedListQueue<String>();
		
		process(q, a, b);
		
		//System.out.println(q);
		System.out.println(a);
		System.out.println(b);
}
}
				
	
