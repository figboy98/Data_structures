import java.lang.*;
import java.util.*;
public class ED212{
	public static int[] sumLevels(BTree<Integer> t){
	int  soma[]= new int[t.depth()+1];
	for(int i=0; i<t.depth()+1; i++){
		soma[i]=sumLevelsAux(t, i);
	}
		return soma;
}
	private static int sumLevelsAux(BTree<Integer> t, int k){
		MyQueue<BTNode<Integer>> fila = new LinkedListQueue<BTNode<Integer>>();
		int aux=(int)Math.pow(2,k)-1+k;
		int soma=0;
		fila.enqueue(t.getRoot());
		fila.enqueue(null);
		int nivel=0;
		
		for(int i=0; i<aux; i++){
			
			BTNode<Integer> cur=fila.dequeue();

			if(cur==null){
				nivel++;
				fila.enqueue(null);
			}
			else{
			//	System.out.println("cur "+cur.getValue());
			//	System.out.println("nivel " + nivel);
			if(cur.getLeft()!=null) fila.enqueue(cur.getLeft());
			else if(nivel<=k-2) aux-=((int)Math.pow(2,(k-nivel))-1)/2;
			if(cur.getRight()!=null) fila.enqueue(cur.getRight());
			else if(nivel<=k-2) aux-=((int)Math.pow(2,(k-nivel))-1)/2;
			//System.out.println("aux " + aux);
			
		}
	}
		//System.out.println("-------");
		while(!fila.isEmpty()){
			BTNode<Integer> cur=fila.dequeue();
			if(cur!=null){
				soma+=cur.getValue();
			//	System.out.println(cur.getValue());
			}
		}
		return soma;
	}
			
				
		
		

public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	BTree<Integer> t= LibBTree.readIntTree(in);
	
	int size=t.depth()+1;
	int res[]= new int[size];
	res=sumLevels(t);
	for(int i=0; i<size; i++){
		System.out.println(res[i]);
	}
	
	}
	
}

