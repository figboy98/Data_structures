import java.util.*;
class Team implements Comparable<Team>{
   String name;
   int vitorias;
   int derrotas;
   int empates;
   int averageGoal;
   int pontos;

   // Construtor
   Team(String n, int v, int e, int d, int gM, int gS ) {
      name = n;
      vitorias=v;
      empates=e;
      derrotas=d;
      averageGoal=gM-gS;
      pontos=(v*3)+e;
   }

   // Método para dar representação em String de um objecto da classe
   public String toString() {
      return name + " " + pontos +" " + averageGoal;
   }
   
   public int compareTo(Team t){
	   if(t.pontos>pontos) return 1;
	   else if(t.pontos<pontos)return -1;
	   else if(t.pontos==pontos){
		   if(t.averageGoal > averageGoal)return 1;
		   else if(t.averageGoal< averageGoal)return -1;
		}	 
		return name.compareTo(t.name);
	}
}

class ED163{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);	
		int size=in.nextInt();
		Team[] t = new Team[size];
		
		for(int i=0; i<size; i++){
			String name=in.next();
			int vitorias=in.nextInt();
			int empates=in.nextInt();
			int derrotas=in.nextInt();
			int golosMarcados=in.nextInt();
			int golosSofridos=in.nextInt();
			Team aux= new Team(name, vitorias, empates, derrotas, golosMarcados, golosSofridos);
			t[i]=aux;
		}
		
		Arrays.sort(t);
		
		for(int i=0; i<size;i++){
			System.out.println(t[i]);
		}
	}
}
		
