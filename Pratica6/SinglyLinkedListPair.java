public class SinglyLinkedListPair<T>{
	
	private pair<T> first;
	private int size;
	
	//construtor
	SinglyLinkedListPair(){
		first=null;
		size=0;
	}
	
	//retorna o tamanho da lista de pares
	
	public int size(){
		return size;
	}
	
	//adiciona um par de números ao inicio da lista
	
	public void addFirst(T a, T b){
		pair<T> newPair = new pair<T>(a, b, first);
		
		first=newPair;
		size++;
	}
	
	public void addLast(T a, T b){
		pair<T> newPair= new pair<T>( a,  b, null);
		
		if(first==null){
			first=newPair;
		}
		else{
			pair<T> cur=first;
			while(cur.getNext() !=null){
				cur=cur.getNext();
			}
			cur.setNext(newPair);
		}
		size++;
	}
	
  public String toString() {
      String str = "{";      
      pair<T> cur = first;
      while (cur != null) {
		 str+="(";
         str += cur.getFirst();
         str+=",";
         str+=cur.getSecond();
         str+=")";
         cur = cur.getNext();
         if (cur != null) str += ",";                     
      }      
      str += "}";
      return str;
   }
		
}
	

		
