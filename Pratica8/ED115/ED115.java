import java.util.*;
class Cliente{
	String nome;
	int tempChegada;
	int produtos;
	int tempSaida;
	//Construtor
	Cliente(String a, int prod, int cheg){
		nome=a;
		produtos=prod;
		tempChegada=cheg;
		tempSaida=0;
	}
		
		
}

class Caixas{
	SinglyLinkedList<Cliente> fila = new SinglyLinkedList<Cliente>();
	int atendimento;
	int totalClientes;
	int totalProdutos;
	int tempoSaida;
	
	//Construtor
	Caixas(int a){
		//fila=null;
		atendimento=a;
		totalClientes=0;
		totalProdutos=0;
	}
	
	void novoCliente(Cliente a){
		fila.addLast(a);
		totalClientes++;
		totalProdutos+=a.produtos;
		tempoSaida= a.tempSaida;	
}
}
public class ED115{
	private static Caixas listaCaixas[];//array com as Caixas existentes
	private static MyQueue<Cliente> filaClientes= new LinkedListQueue<Cliente>(); //Queue com os clientes que ainda não estão alocados a nenhuma caixa
	private static int numCaixas;
	private static int numClientes;
	private static int clock=0;
	
	
	private static void lerClientes(Scanner in){	
		
		for(int i=0; i<numClientes; i++){
			String nome=in.next();
			
			int chegada=in.nextInt();
			int prods= in.nextInt();
			Cliente aux= new Cliente(nome,prods,chegada);
			filaClientes.enqueue(aux);
			in.nextLine();
		}
	}
		
	private static void lerCaixas(Scanner in){
			listaCaixas= new Caixas[numCaixas];
			for(int i=0; i<numCaixas; i++){
				int atendimento= in.nextInt();
				Caixas aux= new Caixas(atendimento);
				
				listaCaixas[i]=aux;
			}
			in.nextLine();
		}
	
private static void mostraClientes(){
	
	for(int i=0; i<numClientes; i++){
		Cliente aux=listaCaixas[0].fila.getFirst();
		listaCaixas[0].fila.removeFirst();
		System.out.println(aux.nome +" "+ aux.tempChegada +" " + aux.tempSaida);
	}
}

private static int tempEspera(int index, Cliente aux){
	int espera=0;
	try{
	int tempo= listaCaixas[index].fila.getLast().tempSaida;
	
	int chegada= aux.tempChegada;
	
	if(chegada < tempo){
		espera=tempo-chegada;
	}
}
	catch(Exception e){
		return 0;
	}
	return espera;
}

private static void processarClientes(){
}
		


private static int escolheCaixa(\){
	return 0;
}

		
	
	
private static void lerInput(Scanner in){
	numCaixas=in.nextInt();
	in.nextLine();

	lerCaixas(in);
	numClientes=in.nextInt();

	lerClientes(in);
}

private static void estatisticasCaixas(){
	
	for(int i=0; i<numCaixas; i++){
		System.out.println("Caixa #" +(i+1) +": " + listaCaixas[i].totalClientes + " " + listaCaixas[i].totalProdutos);
	}
}
				
				
				
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int flag = in.nextInt();
	lerInput(in);
	
	processarClientes();
	if(flag==1) mostraClientes();
	if(flag==2) estatisticasCaixas();
}
	
	
}
	
