// -----------------------------------------------------------
// Estruturas de Dados 2018/2019 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1819/
// -----------------------------------------------------------
// Arvore binaria "normal"
// Ultima alteracao: 26/04/2018
// -----------------------------------------------------------

public class BTree<T> {   
   private BTNode<T> root; // raiz da arvore

   // Construtor
   BTree() {
      root = null;
   }

   // Getter e Setter para a raiz
   public BTNode<T> getRoot() {return root;}
   public void setRoot(BTNode<T> r) {root = r;}

   // Verificar se arvore esta vazia
   public boolean isEmpty() {
      return root == null;
   }

   // --------------------------------------------------------

   // Numero de nos da arvore   
   public int numberNodes() {
      return numberNodes(root);
   }

   private int numberNodes(BTNode<T> n) {
      if (n == null) return 0;
      return 1 + numberNodes(n.getLeft()) + numberNodes(n.getRight());
   }

   // --------------------------------------------------------

   // Altura da arvore
   public int depth() {
      return depth(root);
   }

   private int depth(BTNode<T> n) {
      if (n == null) return -1;
      return 1 + Math.max(depth(n.getLeft()), depth(n.getRight()));
   }

   // --------------------------------------------------------
   
   // O elemento value esta contido na arvore?
   public boolean contains(T value) {
      return contains(root, value);
   }

   private boolean contains(BTNode<T> n, T value) {
      if (n==null) return false;
      if (n.getValue().equals(value)) return true;
      return contains(n.getLeft(), value) || contains(n.getRight(), value);
   }

   // --------------------------------------------------------

   // Imprimir arvore em PreOrder
   public void printPreOrder() {
      System.out.print("PreOrder:");
      printPreOrder(root);
      System.out.println();
   }

   private void printPreOrder(BTNode<T> n) {
      if (n==null) return;
      System.out.print(" " + n.getValue() );
      printPreOrder(n.getLeft());
      printPreOrder(n.getRight());
   }

   // --------------------------------------------------------
   
   // Imprimir arvore em InOrder
   public void printInOrder() {
      System.out.print("InOrder:");
      printInOrder(root);
      System.out.println();
   }

   private void printInOrder(BTNode<T> n) {
      if (n==null) return;
      printInOrder(n.getLeft());
      System.out.print(" " + n.getValue());
      printInOrder(n.getRight());
   }

   // --------------------------------------------------------

   // Imprimir arvore em PostOrder
   public void printPostOrder() {
      System.out.print("PostOrder:");
      printPostOrder(root);
      System.out.println();
   }

   private void printPostOrder(BTNode<T> n) {
      if (n==null) return;
      printPostOrder(n.getLeft());
      printPostOrder(n.getRight());
      System.out.print(" " + n.getValue());
   }

   // --------------------------------------------------------

   // Imprimir arvore numa visita em largura (usando TAD Fila)
   public void printBFS() {
      System.out.print("BFS:");
      
      MyQueue<BTNode<T>> q = new LinkedListQueue<BTNode<T>>();
      q.enqueue(root);
      while (!q.isEmpty()) {
         BTNode<T> cur = q.dequeue();
         if (cur != null) {
            System.out.print(" " + cur.getValue());
            q.enqueue(cur.getLeft());
            q.enqueue(cur.getRight());
         }
      }
      System.out.println();
   }
   
   //Contar o número de folhas-ED204
   
   public int numberLeafs(){
	   return numberLeafs(root);
   }

	private int numberLeafs(BTNode<T> n){
		
		if(n==null) return 0;
		
		if (n.getLeft()==null && n.getRight()==null){
			return 1 + numberLeafs(n.getLeft()) + numberLeafs(n.getRight());
		}
		else{
			return numberLeafs(n.getLeft()) + numberLeafs(n.getRight());
		}
	}
	//Verificar se a árvore é estritamente binária - ED205
	public boolean strict(){
		return strict(root);
	}
	
	private boolean strict(BTNode<T> n){
		if (n==null) return true;
		
		if(n.getLeft()==null && n.getRight()!=null || n.getLeft()!=null && n.getRight()==null) 
			return false;
		else
			return strict(n.getLeft()) && strict(n.getRight());
		
	}
	//ED-206
	public T path(String S){
		return pathS(S);
	}
		
		
	private T pathS(String s){
		
		BTNode<T> aux=root;
		
		if(s.charAt(0)=='R')
			return aux.getValue();
		
		else{
			
			for(int i=0; i<s.length(); i++){
				if(s.charAt(i)=='E')
					aux=aux.getLeft();
				if (s.charAt(i)=='D')
					aux=aux.getRight();
				}
			}
				return aux.getValue();
			}
			
	//ED207- Contar nós de um nivel
	public int nodesLevel(int k){
		return nodesLevel(BTNode<T> n, k);
	}
	
	private nodesLevel(BTNode<T> n, int k){
		MyQueue<T> fila= new LinkedListQueue<T>();
		int aux=2;
		fila.enqueue(root);
		for(int i=1; i<k; i++){
			aux*=2;
		}
		
		for(int i=0; i<aux; i++){
			BTNode<T> cur=fila.dequeu();
			if(cur.getLeft()==null) aux--;
			else if(cur.getRight()==null)aux--;
			else{
				fila.enqueue(cur.getRight());
				fila.enqueue(cur.getLeft());
			}
		}
		int size=fila.size();
		return size;
			
		}
		
	
   // --------------------------------------------------------
   
   // Imprimir arvore numa visita em profundidade (usando TAD Pilha)
   public void printDFS() {
      System.out.print("DFS:");
      
      MyStack<BTNode<T>> q = new LinkedListStack<BTNode<T>>();
      q.push(root);
      while (!q.isEmpty()) {
         BTNode<T> cur = q.pop();
         if (cur != null) {
            System.out.print(" " + cur.getValue());
            q.push(cur.getLeft());
            q.push(cur.getRight());
         }
      }
      System.out.println();
   }

}
