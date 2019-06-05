import java.util.*;
public class ED164{
	public static void add(BSTree<String> t ,String s){
		if(!t.contains(s)){ 
			t.insert(s);
			//System.out.println(s);
		}
	}

public static void main(String[] args){
	BSTree<String> t= new BSTree<String>();

	Scanner in = new Scanner(System.in);
	int size= in.nextInt();
	in.nextLine();
	
	
	for(int i=0; i<size; i++){
		String aux= in.nextLine();
		add(t, aux);
		}
		
		int unicos=t.numberNodes();
		System.out.println(unicos);
	}
	
}
