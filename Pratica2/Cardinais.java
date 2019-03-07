import java.util.Scanner;


class Matrix {
   char data[][]; // os elementos da matriz em si
   int rows;     // numero de linhas
   int cols;     // numero de colunas

   // construtor padrao de matriz
   Matrix(int r, int c) {
      data = new char[r][c];
      rows = r;
      cols = c;
   }

   // Ler os rows x cols elementos da matriz
   public void read(Scanner in) {
      for (int i=0; i<rows; i++)
         for (int j=0; j<cols; j++){
			 char c = in.next().charAt(j);
			data[i][j] = c;
   }
}

   // Representacao em String da matrix
   public String toString() {
      String ans = "";
      for (int i=0; i<rows; i++) {
         for (int j=0; j<cols; j++)
            ans += data[i][j];
         ans += "\n";
      }
      return ans;
   }
}

public class Cardinais{

	
	public static void main(String []args){
		Scanner stdin= new Scanner(System.in);
		int linhas= stdin.nextInt();
		int colunas= stdin.nextInt();
		Matrix cardinais= new Matrix(linhas,colunas);
		//char[][] = new char[rlinhas[colunas];
		
		
		cardinais.read(stdin);
		System.out.println();
		System.out.println(cardinais);
		
		
		
	}
}
