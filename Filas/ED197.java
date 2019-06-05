public class ED197{
	
	public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
		MyQueue<Integer> merge = new LinkedListQueue<Integer>();
		int size=0;
		int filaA;
		int filaB;
		if(a.size()<b.size()){
			while(!a.isEmpty()){
				aux(a,b,merge);
			}
		}
		else{
			while(!b.isEmpty()){
				aux(a,b,merge);
			}
		}
		
		if(!a.isEmpty()){
				//System.out.println("sizeA= "  + a.size());
			for(int i=0; i<a.size(); i++){
				filaA=a.first();
				merge.enqueue(filaA);
				a.dequeue();
			}
		}
		
		if(!b.isEmpty()){
			//System.out.println("sizeB= " + b.size());
			for(int i=0; i<b.size(); i++){
				filaB=b.first();
				merge.enqueue(filaB);
				b.dequeue();
			}
		}
		
		return merge; 
	}
	
	public static void  aux(MyQueue<Integer> a, MyQueue<Integer> b, MyQueue<Integer> merge){
		int filaA;
		int filaB;
		
	//	MyQueue<Integer> merge = new LinkedListQueue<Integer>();
		
			filaA=a.first();
			filaB=b.first();
			
			if(filaA<filaB){
				merge.enqueue(filaA);
				a.dequeue();
			}
			else if(filaB<filaA){
				merge.enqueue(filaB);
				b.dequeue();
			}
			
			else if(filaA==filaB){
				merge.enqueue(filaA);
				merge.enqueue(filaB);
				a.dequeue();
				b.dequeue();
			}
		//System.out.println(merge);
	}
public static void main(String[] args){
	MyQueue<Integer> a= new LinkedListQueue<Integer>();
	MyQueue<Integer> b= new LinkedListQueue<Integer>();
	
	a.enqueue(2);
	a.enqueue(4);
	a.enqueue(8);
	a.enqueue(10);
	
	b.enqueue(1);
	b.enqueue(4);
	b.enqueue(9);
	
	MyQueue<Integer> merge= new LinkedListQueue<Integer>();
	
	merge=merge(a,b);
	
	System.out.print(merge);
}
}
