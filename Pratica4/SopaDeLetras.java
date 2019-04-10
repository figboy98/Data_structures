import java.util.Scanner;
class matriz{
	int lins, cols;
	char data[][];
	
	
	//metodo para criar a matriz
	
	matriz(int l, int c){
		lins=l;
		cols=c;
		
		data = new char[lins][cols];
	}
	
	//método para escrever na matriz
	
	public void read(Scanner in){
		for (int i=0; i<lins; i++){
			data[i] = in.next().toCharArray();
    }
	}
	
	
	//método para imprimir
	
	public void write(){
		
		String aux="";
		
		for(int i=0; i<lins;i++){
			for(int j=0; j<cols;j++){
				aux+=data[i][j];
			}
			aux+="\n";
		}
		
		System.out.print(aux);
	}
	
	//método para procurar a palavra
	
	/*public void search(String aux){
		
		matriz nova= new matriz(lins,cols);
		
		for(int i=0; i<lins;i++){
			for(int j=0; j<cols; j++){
				for(int k=0; k<aux.length(); k++){
					if((data[i][j].equals(aux.charAt(j)))){
						nova.data[i][j]=aux.charAt(j);
					}
				}
			}
		} 
	} */
	//método para converter string to array
	
	public void StringToArray(String aux){
		
		for(int i=0; i<aux.length(); i++){
			data[1][i]= aux.charAt(i);
		}
		
	
	} 
}




public class SopaDeLetras{
	
	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int c= in.nextInt();
		in.nextLine();
		
		matriz sLetras= new matriz(l,c);
		
		sLetras.read(in);
		
		//sLetras.write();

		//int palavras=in.nextInt();
		
		
		
		//String aux= new String();
		
		//aux= in.nextLine();
		
		//System.out.println(aux);
		
		matriz palavra= new matriz(1, 5);
		
		palavra.read(in);
		for(int i=0; i< palavra.lenghth; i++){
			System.out.prin(palavra.data[1][i]);
		}
		
		
		
		
		
		
			
		
		
	}
}
	
