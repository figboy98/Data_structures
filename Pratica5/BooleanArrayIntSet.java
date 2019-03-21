public class  BooleanArrayIntSet implements IntSet{
	
	private int size;
	
	private boolean isElem[];
	
	
	//construtor
	
	BooleanArrayIntSet(int maxSize){
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
		}
		return false;
	}
	
	public void clear(){
		size=0;
	}
}
	
