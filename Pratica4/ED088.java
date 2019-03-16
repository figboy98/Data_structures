/* -----------------------------------
  Estruturas de Dados 2018/2019
  Jogo da Vida [ED088]  
----------------------------------- */

import java.util.Scanner;

// Classe para representar um jogo
class Game {
    final char DEAD  = '.';  // Constante que indica uma celula morta
    final char ALIVE = 'O';  // Constante que indica uma celula viva
    private int rows, cols;  // Numero de linhas e colunas
    private char m[][];      // Matriz para representar o estado do jogo

    // Construtor: inicializa as variaveis tendo em conta a dimensao dada
    Game(int r, int c) {
	rows = r;
	cols = c;
	m = new char[r][c];
    }

    // Metodo para ler o estado inicial para a matriz m[][]
    public void read(Scanner in) {
	for (int i=0; i<rows; i++)
	    m[i] = in.next().toCharArray();
    }
    
    // Metodo para escrever a matriz m[][]
    public void write() {
	String aux= new String();
	aux="";
	for(int i=0; i<rows; i++){
		for(int j=0; j<cols;j++){
			aux+= m[i][j];
		}
		aux+="\n";
	}
	System.out.print(aux);
}
	public int countAux(int y,int x,int aux){
		if(m[y][x] =='O'){
			return aux -1;
		}
		return aux;
	}

    // Deve devolver o numero de celulas vivas que sao vizinhas de (y,x)
    public int countAlive(int y, int x) {
	int count=0, aux=0;
	int i,j,limI,limJ;
	
	//if(rows==1 && cols==1){
		//count= countAliveAux(y, x, y+1, x+1);
			//if(m[y][x] =='O'){
				//return aux -1;
			//}
			//return aux;
	//}
		
	
	if(y==0 && x==0) count= countAliveAux(y, x, y+1, x+1);  //canto superior esquerdo 
	if(y==(rows-1) && x==(cols-1)) count= countAliveAux(y-1, x-1, y, x);//canto inferior direito 
	if(x==0 && y==rows-1) count=countAliveAux(y-1, x, y, x+1); // canto inferior esquerdo
	if(y==0 && x==cols-1) count=countAliveAux(y, x-1, y+1, x); //canto superior direito
	
	if(x==0 && y!=0 && y!=rows-1) count=countAliveAux(y-1, x, y+1, x+1); // vertical esquerda
	if(x==cols-1 && y!=0 && y!=rows-1) count=countAliveAux(y-1, x-1, y+1, x); //vertical direita
	if(y==0 && x!=0 && x !=cols-1) count=countAliveAux(y, x-1, y+1, x+1); //horizontal superior
	if(y==rows-1 && x!=0 && x!=cols-1) count=countAliveAux(y-1, x-1, y, x+1);//horizontal inferior
	if(y!=0 && y!=rows-1 && x!=0 && x!=cols-1) count=countAliveAux(y-1, x-1, y+1, x+1);//interior do quadrado
	
	if(m[y][x] =='O'){
			return aux -1;
		}
		return aux;
	
	
}
	
	
	public int countAliveAux(int y, int x, int limI, int limJ){
		int aux=0;
		if(rows==1) limI=0;
		if(cols==1) limJ=0;
		
		for(int i=y; i<=limI ; i++){
			for(int j=x; j<=limJ; j++){
				if(m[i][j] == 'O'){
					aux++;
				}
				
			}
		}
		return aux;
	}
	
	
	
	

    // Deve fazer uma iteracao: cria nova geracao a partir da actual
    public void iterate() {
	
	int aux;
	char m2[][]= new char[rows][cols];
	
	for(int i=0; i<rows;i++){
		for(int j=0; j<cols; j++){
			if(m[i][j] == 'O'){
				aux=countAlive(i,j);
				if(aux <=1 || aux >=4)  m2[i][j] = '.';
				if(aux==2 || aux ==3) m2[i][j]='O';
				aux=0;
				
			}
			else{
				aux=countAlive(i,j);
				if(aux==3) m2[i][j]='O';
				if(aux!=3) m2[i][j]='.';
				
			}		
    }
   
}
		for(int i=0; i<rows;i++){
			for(int j=0; j<rows; j++){
				m[i][j]= m2[i][j];
			}
		}

}
}

// Classe principal com o main()
public class ED088 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	// Ler linhas, colunas e numero de iteracoes
	int rows = in.nextInt();
	int cols = in.nextInt();
	int n    = in.nextInt();
	
	// Criar objecto para conter o jogo e ler estado inicial
	Game g = new Game(rows, cols);
	
	g.read(in);
	
	
	for(int i=0; i<n;i++){
		g.iterate();
	}
	
	g.write();
    }
}
