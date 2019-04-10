public class TestSinglyLinkedListPair{
	public static void main(String[] args){
		
		SinglyLinkedListPair<Integer> lista = new SinglyLinkedListPair<Integer>();
		
		for(int i=1; i<4;i++){
			for(int j=1; j<4; j++){
				lista.addLast(i,j);
			}
		}
	
	
	System.out.println(lista);
}
}
