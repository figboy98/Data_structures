import java.util.Scanner;

public class Unique{
	
	public static void main(String []args){
	
	Scanner in = new Scanner(System.in);
	
	IntSet s = new BooleanArrayIntSet(10000000);
	
	while(in.hasNextInt()){
		
		s.add(in.nextInt());
	}
	
	System.out.println(s.size());
}
}

		 
