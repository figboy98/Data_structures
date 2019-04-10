public class pair<T>{
	 private T first;
	 private T second;
	 private pair<T> next;
	 
	 //Construtor
	 
	 pair(T a, T b, pair<T> n){
		 first=a;
		 second=b;
		 next=n;
	 }
	 
	 //getters e setters
	 
	 public T getFirst(){
		 return first;
	 }
	 public T getSecond(){
		 return second;
	 }
	 
	 public pair<T>  getNext(){
		 return next;
	 }
	 
	public void setPair(T a, T b){
		 first=a;
		 second=b;
	 }
	 public void setNext(pair <T> n){
		 next=n;
	 }
	 public String toString(){
		 String aux="("; 
		 aux+=getFirst();
		 aux += ",";
		 aux+= getSecond();
		 aux+= ")";
		 return aux;
	 }
		 
 }
	
	
