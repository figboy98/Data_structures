public class ED196{
	public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
		
		String nome;
		String fila;
		int oldsize= q.size();
		
		for(int i=0; i<oldsize/2; i++){
			
			nome=q.dequeue();
			fila=q.dequeue();
			//System.out.println(nome+ " " + fila);
			if(fila.equals("A")) a.enqueue(nome);
			if(fila.equals("B")) b.enqueue(nome);
			if(fila.equals("X")){
				
				if(a.size() > b.size()) b.enqueue(nome);
				if(a.size() < b.size()) a.enqueue(nome);
			}
		}
	}
	
	
	public static void main(String [] args){
		MyQueue<String> q  = new LinkedListQueue<String>();
		MyQueue<String> a  = new LinkedListQueue<String>();
		MyQueue<String> b  = new LinkedListQueue<String>();
		
		
		q.enqueue("luis");
		q.enqueue("B");
		q.enqueue("Pedro");
		q.enqueue("A");
		q.enqueue("Luisa");
		q.enqueue("A");
		q.enqueue("Joao");
		q.enqueue("X");
		q.enqueue("Jose");
		q.enqueue("X");
		q.enqueue("Miguel");
		q.enqueue("B");
		

		process(q,a,b);
		
		System.out.println(a);
		System.out.println(b);
	}	
}
