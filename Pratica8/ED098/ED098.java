/* -----------------------------------
  Estruturas de Dados 2018/2019
  Triagem de Manchester [ED098]  
----------------------------------- */

import java.util.Scanner;
import java.util.LinkedList;
import java.text.*;

// Classe para representar um Doente
class Doente {
    public String nome;     // Nome
    public int chegada;     // Tempo de chegada
    public int atendimento; // Tempo que demora a ser atendido
    public int entrada;     // Tempo em que comecou a ser atendido

    // Construtor: inicializa os atributos
    Doente(String n, int c, int a) {
	nome        = n;
	chegada     = c;
	atendimento = a;
	entrada     = -1;
    }
}

// Classe para representar uma fila de atendimento de uma cor (necessaria criar array)
// (nota: Java nao permite criacao direta de array de genericos)
class FilaAtendimento {
    public MyQueue<Doente> fila;

    FilaAtendimento() {
	fila = new LinkedListQueue<Doente>();
    }
}

// Classe para representar uma equipa da urgencia
class Equipa {
    int numDoentes;       // Numero de doentes que atenderam
    int totalAtendimento; // Total de tempo passado a atender
    int livre;            // Tempo em que ficam livres para poder atender novo doente

    Equipa() {
	numDoentes       = 0;
	totalAtendimento = 0;
	livre            = 0;
    }

    // Novo doente d comecou a ser atendido num dado tempo t nesta equipa
    void novoDoente(Doente d, int t) {
		numDoentes++;
		totalAtendimento+=d.atendimento;
		livre=t+d.atendimento;;
    }
}

// Classe principal que contem o metodo main
class ED098 {
    // Constantes que nao mudam durante o programa: numero de cores e seus nomes
    private static final int NUM_CORES = 5;
    private static final String[] CORES = {"Vermelho","Laranja","Amarelo","Verde","Azul"};

    private static int numEquipas;               // Numero de equipas
    private static int numDoentes;               // Numero total de doentes
    private static FilaAtendimento emEspera[];   // Array com uma fila para cada cor
    private static LinkedList<Doente> atendidos; // Lista de doentes ja atendidos
    private static Equipa equipas[];             // Equipas da urgencia

    // Metodo para devolver indice de uma cor representada pela string s
    private static int indiceCor(String s) {
		
		for(int i=0; i<5; i++){
			if(s.equals(CORES[i])) return i;
		}
	
	return -1;
    }
 

    // Ler os doentes a partir do input e coloca-los nas respetivas filas
    private static void lerDoentes(Scanner in) {	
	while (in.hasNext()) {
	    String nome     = in.next();
	    String cor      = in.next();
	    int chegada     = in.nextInt();
	    int atendimento = in.nextInt();
	   // System.out.printf("Li [%s,%s,%d,%d]%n", nome, cor, chegada, atendimento);
	 
	   int auxCor=indiceCor(cor);
	   Doente novo= new Doente(nome,chegada,atendimento);
	   
	   emEspera[auxCor].fila.enqueue(novo);
	   numDoentes++;
	  
	}
    }

    // Mostrar numero de doentes em cada cor (necessario para flag==0)
    private static void mostrarCores() {
	System.out.println("------------");
	System.out.println("Cores     ND");
	System.out.println("------------");
	int d=emEspera[0].fila.size();
	
	System.out.printf("%8s %3d\n","Vermelho",d);
	d=emEspera[1].fila.size();

	System.out.printf("%8s %3d\n","Laranja",d);
	d=emEspera[2].fila.size();

	System.out.printf("%8s %3d\n","Amarelo",d);
	d=emEspera[3].fila.size();

	System.out.printf("%8s %3d\n","Verde",d);
	d=emEspera[4].fila.size();

	System.out.printf("%8s %3d\n","Azul",d);
	System.out.println("------------");

	 
	System.out.println("Numero doentes atendidos: "+numDoentes);

    }
    

    // Mostrar estatisticas dos doentes atendidos (necessario para flag==1 e flag==2)
    private static void mostrarAtendidos() {
	System.out.println("---------------------------");
	System.out.println("Lista dos doentes atendidos");
	System.out.println("---------------------------");
	// itera sobre todos os doentes já atendidos (instrução for-each)
	float media=0;
	for (Doente d : atendidos) {
		media+=(d.entrada-d.chegada); 
	    System.out.println(d.nome +" "+ d.chegada+ " " + (d.entrada-d.chegada)+" "+ (d.entrada+d.atendimento));
	    // a completar ...
	}
	System.out.println("---------------------------");
	
	media=media/atendidos.size();
	
	
	System.out.printf("Tempo medio de espera: %.1f\n",media);
    }

    // Mostrar estatisticos das equipas (necessario para flag==2)
    private static void mostrarEquipas() {
	System.out.println("-----------------------");
	System.out.println("Equipa NDoentes MediaTA");
	System.out.println("-----------------------");
	
	for(int i=0; i<numEquipas; i++){
		double size=(double)equipas[i].numDoentes;
		double media=0;
		media=(equipas[i].totalAtendimento/size);
		//System.out.println(equipas[i].totalAtendimento);
		System.out.printf("%6d%9d%8.1f%n",i, equipas[i].numDoentes, media); 
	}

    }

    // Qual a cor da proxima equipa a ficar livre?
    private static int proximaEquipaLivre(){
		int min=equipas[0].livre;
		int indice=0;
		
		for(int i=0; i<numEquipas; i++){
			int aux=equipas[i].livre;
			
			if(aux<min){
				min=aux;
				indice=i;
			} 
		}
		return indice;
	}	
    

    // Qual a cor mais prioritaria com doente ainda por ser atendido no tempo atual?
    private static int proximoDoente(int tempo) {
		
		for(int i=0; i<5; i++){
			Doente aux=emEspera[i].fila.first();
			if(aux !=null){
				int time= aux.chegada;
				if(time <= tempo) return i;
			}
		}
	return -1;
    }

    // Simular processo de atendimento pelas varias equipas medicas
    private static void simular() {
		int tempo=0;
		
		while(atendidos.size()<numDoentes){
				
				int indiceEquipa=proximaEquipaLivre();
			
				tempo=equipas[indiceEquipa].livre;
				
					
				int indiceDoente=proximoDoente(tempo);
					
				if(indiceDoente==-1){
					while(indiceDoente==-1){
						tempo++;
						indiceDoente=proximoDoente(tempo);
					}
				}
				
				Doente D=emEspera[indiceDoente].fila.dequeue();
				equipas[indiceEquipa].novoDoente(D, tempo); 
				D.entrada=tempo;
				atendidos.addLast(D);
			}
	
}
    // Inicializar variaveis
    private static void inicializar() {
	numDoentes = 0;

	emEspera = new FilaAtendimento[NUM_CORES];	
	
	for (int i=0; i<NUM_CORES;i++)
	    emEspera[i] = new FilaAtendimento();

	atendidos = new LinkedList<Doente>();

	equipas = new Equipa[numEquipas];
	for (int i=0; i<numEquipas; i++)
	    equipas[i] = new Equipa();
    }

    // ----------------------------------------------------------------

    // Funcao principal chamada no inicio do codigo
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int flag   = in.nextInt();
	numEquipas = in.nextInt();
	
	inicializar();
	lerDoentes(in);
	

	if (flag==0) {
	    mostrarCores();
	} else {
	    simular();
	    if (flag==2) mostrarEquipas(); 
	   mostrarAtendidos();
	}
    }
}
