import java.util.Scanner;

class Matrix {
   int data[][]; // os elementos da matriz em si
   int rows;     // numero de linhas
   int cols;     // numero de colunas

   // construtor padrao de matriz
   Matrix(int r, int c) {
      data = new int[r][c];
      rows = r;
      cols = c;
   }

   // Ler os rows x cols elementos da matriz
   public void read(Scanner in) {
      for (int i=0; i<rows; i++)
         for (int j=0; j<cols; j++)
            data[i][j] = in.nextInt();
   }

   // Representacao em String da matrix
   public String toString() {
      String ans = "";
      for (int i=0; i<rows; i++) {
         for (int j=0; j<cols; j++)
            ans += data[i][j] + " ";
         ans += "\n";
      }
      return ans;
   }
   
   //métodos
   
   
   //devolve a matriz identidade
   
   public static Matrix identity(int n){
	   
	   Matrix identidade= new Matrix(n,n);
	   
		for(int i=0; i<n; i++){
			identidade.data[i][i]= 1;
		}
		
		return identidade;
	}
	
	public Matrix transpose(){
		
		Matrix transposta = new Matrix(cols, rows);
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; ++){
				transposta.data[j][i]
		
		
		return transposta;
	}
		
		
   
}

public class TestMatrix {
   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
      Matrix m1 = Matrix.identity(5);
      System.out.println(m1);

   }    
}
