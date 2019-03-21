public class  MyIntSet implements IntSet{
	
	private int size;
	
	private boolean isElem[];
	
	
	//construtor
	MyIntSet(){
		isElem = new boolean[100];
		size=0;
	}
	MyIntSet(int maxSize){
		isElem = new boolean[maxSize];
		for(int i=0; i<maxSize; i++){
			isElem[i]=false;
		}
		size=0;
	}
	
	//Métodos
	
	//Colocar True no Array para "adicionar" o número
	
	public boolean add(int x){
		
		if(!contains(x)){
			if(size==isElem.length){
				throw new RuntimeException("Maximum size of set reached");
			}
			isElem[x]=true;
			size++;
			return true;
		}
		return false;
	}
	
	public boolean contains(int x){
		
		if(isElem[x]== false){
			return false;
		}
		return true;
	}
	
	public int size(){
		return size;
	}
	
	public boolean remove(int x){
		if(contains(x)){
			isElem[x]=false;
			size--;
			return true;
		}
		return false;
	}
	
	public void clear(){
		size=0;
	}
	public String toString(){
		String res = "{";
		for(int i=0; i<size; i++){
			if(i>0) res+=",";
			if(contains(i)){
				res+=i;
			}
		}
		return res;
	}
}
	
