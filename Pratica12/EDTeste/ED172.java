import java.util.*;
class ED172{
	
	 
	 public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		 
		BSTMap<String, Integer> t = new BSTMap<>();
		
		while(in.hasNext()){
			String line=in.next();
			 Integer i=t.get(line);
			 if(i==null) t.put(line, 1);
			 else if(i!=null) t.put(line, i+1);
		 }
		 
		 LinkedList<String> aux = t.keys();
		 
		 for(String s : aux){
			 System.out.println(s + ": " + t.get(s));
		 }
	 }
 }

			
