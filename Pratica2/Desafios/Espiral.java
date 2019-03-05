import java.util.Scanner;

class  Point{
		int x;
		int y;
		
		//construtor
		Point (int xvalue, int yvalue){
			x=xvalue;
			y=yvalue;
		}
		
		//Imprime os valores de Point
		void show(){
			System.out.println("(" + x + ","+ y +")");
		}
	}

public class Espiral{
	
	
	
	public static Point Coordenadas (int x){
		Point Inferior = new Point(0,0);
		
		Point Superior= new Point(0, -1);
		
		Point PointAux= new Point(0,0);	
		
		
		int limInferior=1;
		int limSuperior=4;
		int quadrado=1;
		int j=1;
		int i;
		//Descobrir em que quadrado é que o número dado está
		//O primeiro quadrado é 2x2, o segundo 4x4, etc...
		
		while(j>0){
		
			
			if(x>=limInferior && x<=limSuperior){
				break;
			}
			
			int temp=limInferior;
			
			limInferior=limSuperior+1;
		
		
			int aux=limInferior-temp;
		
			limSuperior+=(aux+8);
			
			quadrado++; //passa para o quadrado seguinte
			
			Inferior.x--;  //atualiza as coordenadas do numero mais baixo do quadrado
			Inferior.y--;
			
		
			Superior.x--; //atualiza as coordenadas do numero mais alto do quadrado
			Superior.y--;	
			
			
		}
		
		PointAux=Inferior;
		
		
		int k=limInferior;
		int tempX;
		int tempY;
		
		while(k<limSuperior){
			
			//ciclo que  percorre o lado esquerdo do quadrado
			
			for(tempY=PointAux.y; tempY<=(quadrado-1); tempY++){
			
			PointAux.y=tempY;
			//System.out.println("tempY= " + tempY);
				
				if(k==x){
					//PointAux.y=tempY;
					//PointAux.show();
					return PointAux;
				}
				k++;
			}
				
			//ciclo que percorre a horizontal superior do quadrado
			
			for(tempX=(PointAux.x+1); tempX<=quadrado; tempX++){
				PointAux.x=tempX;
				
				if(k==x){
					//PointAux.show();
					return PointAux;
				}
				k++;
			}
			
			
			//ciclo que percorre a vertical direita do quadrado
			
			for(tempY=(PointAux.y-1); tempY>=-(quadrado); tempY--){
				PointAux.y=tempY;
				
				if(k==x){
					//PointAux.show();
					return PointAux;


				}
				k++;
			}
			
			//ciclo que percorre a horizontal inferior do quadrado
			
			for(tempX=(PointAux.x-1); tempX>(-quadrado-1); tempX--){
				PointAux.x=tempX;
				
				if(k==x){
					//PointAux.show();
					return PointAux;
				}
				k++;
			}
				
	}
	return null;
}

	
	public static void main(String []args){
		
		Scanner stdin= new Scanner(System.in);
		
		int numero=stdin.nextInt();
		
		Point Coords= new Point(0,0);
		Coords= Coordenadas(numero);
		Coords.show();
		
	}
		
}
			
			
			
