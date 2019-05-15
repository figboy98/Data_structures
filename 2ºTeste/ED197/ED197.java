import java.util.*;
class ED197{
	public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
		
		MyQueue<Integer> nova = new LinkedListQueue<Integer>();		
		int array[]= new int[a.size() + b.size()];
		int i=0;
		while(a.size() >0){
			array[i]=a.dequeue();
			i++;
		}
		
		while(b.size() >0){
			array[i]=b.dequeue();
			i++;
		}
		
		Arrays.sort(array);
		for(int j=0; j<array.length; j++){
			nova.enqueue(array[j]);
		}
		
		
		return nova;
	}
	
	
	public static void main(String [] args){
		
		MyQueue<Integer> a = new LinkedListQueue<Integer>();
		MyQueue<Integer> b= new LinkedListQueue<Integer>();
		MyQueue<Integer> nova = new LinkedListQueue<Integer>();
		a.enqueue(2);
		a.enqueue(4);
		a.enqueue(8);
		a.enqueue(10);
		
		b.enqueue(1);
		b.enqueue(4);
		b.enqueue(9);
	nova=merge(a,b);
	
	System.out.println(nova);
}
}
