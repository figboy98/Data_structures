import java.util.*;
import java.text.*;

class Bombeiro{
	public String Nome; //Nome
	public int Eventos; //Número de eventos em que participou
	public int minutosTrabalho; //Tempo que trabalhou
	
	//Construtor
	Bombeiro(String n){
		Nome=n;
		Eventos=0;
		minutosTrabalho=0;
	}
}

class Evento{
	//public int id; //identificador do Envento
	public ArrayList<Bombeiro> listaBombeiros= new ArrayList<Bombeiro>();
	public int inicio; //hora de inicio do evento
	public int fim; //hora de fim do evento
	public int numEventos=0;
	
	//construtor
	Evento(int a, ArrayList<Bombeiro> lista){
		inicio=a;
		listaBombeiros=lista;
		numEventos++;
	}
	Evento(){
		listaBombeiros=null;
		
	}
	
}

class ED095{
	private static MyQueue<Bombeiro> Quartel=new LinkedListQueue<Bombeiro>();
	private static Evento listaEvento[]= new Evento[501];
	

	//Método para ler os Bombeiros
	private static void lerBombeiros(Scanner in){
		int size= in.nextInt();
		in.nextLine();
		
		for(int i=0; i<size; i++){
			String nome=in.nextLine();
			Bombeiro aux= new Bombeiro(nome);
			Quartel.enqueue(aux);
		}
	}
	
	//Método para processar Partidas
	private static void Partidas(Scanner in){
		//System.out.println("Entrou em partidas");
		
		int id=in.nextInt();
		
		int numBombeiros= in.nextInt();
		int partida=in.nextInt();
		ArrayList<Bombeiro> aux= new ArrayList<Bombeiro>();
		
		for(int i=0; i<numBombeiros; i++){
			if(Quartel.isEmpty()){
				//System.out.println("erro");
				break;
			}
			Bombeiro temp= Quartel.dequeue();
			aux.add(temp);
			
		}
		
		Evento novo= new Evento(partida, aux);
		listaEvento[id]= new Evento();
		
		listaEvento[id]=novo;		
	}
	
	//Método para processar Chegadas
	private static void Chegadas(Scanner in){
		int id= in.nextInt();
		int tempo= in.nextInt();
		
		int size=listaEvento[id].listaBombeiros.size();
		//System.out.println(size);
		
		for(int i=0; i<size; i++){
			Bombeiro aux= listaEvento[id].listaBombeiros.get(i);
			
			aux.Eventos++;
			aux.minutosTrabalho+=(tempo- listaEvento[id].inicio);
			Quartel.enqueue(aux);
		}
	}
	
	private static int NumEventos(){
		int aux;
		if(listaEvento[0]==null){
			aux=1;
		}
		else aux=0;
		
		Evento temp=listaEvento[aux];
		
		while(temp!=null){
			aux++;
			temp=listaEvento[aux];
		}
		
		if(listaEvento[0]==null){
			aux--;
		}
		
		
		return aux;
	}
	
	//Método para processar os Eventos
	
	private static int ProcessarEventos(Scanner in){
		
		String tipoEvento=in.next();
		
		if(tipoEvento.equals("PARTIDA")){
			Partidas(in);	
		}
		
		else if(tipoEvento.equals("CHEGADA")){
		Chegadas(in);
		}
		
		else if(tipoEvento.equals("FIM")){
			return -1;
		}
		return 0;
	}
		
	private static void mostrarBombeiros(){
		System.out.println("Bombeiros Destacados");
		int size=NumEventos();
		int i;
		if(listaEvento[0]==null){
			i=1;
			
		}
		else{ 
			i=0;
			size--;
		}
		
		for( ; i<=size; i++){
			System.out.println("EVENTO " + i);
			if((listaEvento[i].listaBombeiros.size())==0){
					System.out.println("Nenhum");
				}
			for(int j=0; j<listaEvento[i].listaBombeiros.size(); j++){
				String aux= listaEvento[i].listaBombeiros.get(j).Nome;
				
				System.out.println(aux);
			}
		}
	}
	
	private static void inicializar(){
		listaEvento = new Evento[501];
		for(int i=0; i<=500; i++){
			listaEvento[i]= new Evento();
		}
	}
	
	private static void mostrarEstatisticas(){
		int size=Quartel.size();
		System.out.println("Listagem de Bombeiros");
		for(int i=0; i<size; i++){
			Bombeiro temp=Quartel.dequeue();
			System.out.println(temp.Nome+ " " + temp.Eventos + " " + temp.minutosTrabalho);
		}
	}
		
		
	
	public static void main(String[] args){
		
	Scanner in= new Scanner(System.in);
	int flag= in.nextInt();
	//inicializar();
	lerBombeiros(in);
	while(ProcessarEventos(in) !=-1){
		in.nextLine();
	}
	
	if(flag==1){
		int aux=NumEventos();
		System.out.println("Ocorreram " + aux + " eventos");
		
	}
	else if(flag==2){
		mostrarBombeiros();
	}
	else if(flag==3){
		mostrarEstatisticas();
	}
	

}
}

		
	
