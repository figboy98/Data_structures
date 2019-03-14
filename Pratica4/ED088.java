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
	System.out.println(aux);
}

    // Deve devolver o numero de celulas vivas que sao vizinhas de (y,x)
    public int countAlive(int y, int x) {
	int count = 0;
	int i,j,limI,limJ;
	
	if(y==0) i=y; limI=1;
	if(y==rows) i=y-1; limI=y;
	if(x==0) j=x; limJ=x+1;
	if(x==cols) j=x-1; limJ=x;
	
	
		for(i; i<=limI ; i++){
			for(j; j<=limJ; j++){
				System.out.print(m[i][j]);
				if(m[i][j] == 'O'){
					count++;
				}
				
			}System.out.println();
		}
	
	
	
	return count-1;
    }

    // Deve fazer uma iteracao: cria nova geracao a partir da actual
    public void iterate() {
	// ... por completar
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
	//g.write();
	int aux= g.countAlive(0,0);
	System.out.println(aux);
	
	
	//... por completar
    }
}
