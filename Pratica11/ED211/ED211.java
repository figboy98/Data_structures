import java.util.*;
public class ED211{
	
	public static int countEven(BTree<Integer> t){
		BTNode<Integer> aux=t.getRoot();
		return countEven(aux);
	}
	
	private static int countEven(BTNode<Integer> t){
		MyQueue<BTNode<Integer>> fila= new LinkedListQueue<BTNode<Integer>>();
		fila.enqueue(t);
		int count=0;
		while(!fila.isEmpty()){
			BTNode<Integer> cur= fila.dequeue();
			if(cur!=null){
				if((cur.getValue())%2==0) count++;
				if(cur!=null){
					fila.enqueue(cur.getLeft());
					fila.enqueue(cur.getRight());
				}
			}
			}
		return count;
	}
	
	
	public static void  main(String[] args){
		
	  // Ler arvore de inteiros em preorder
      Scanner in = new Scanner(System.in);
      BTree<Integer> t = LibBTree.readIntTree(in);

    
		System.out.println(countEven(t));
	
}
}
