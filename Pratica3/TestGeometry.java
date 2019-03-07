// Uma classe simples para representar um ponto 2D
class Point {
   int x, y;

   Point() {
      x = y = 0;
   }
   
   Point(int x0, int y0) {
      x = x0;
      y = y0;
   }

   // Devolve uma representação em texto do conteúdo de um Ponto
   public String toString() {
      return "(" + x + "," + y + ")";
   }
}

class Rectangle{
	
	Point infEsquerdo;
	
	Point supDireito;
	//construtor com coordenadas
	 Rectangle(int x1, int y1, int x2, int y2){

		infEsquerdo =new Point(x1, y1);
		supDireito=  new Point(x2,y2);
	 }
	 
	 //Construtor com points
	 
	 Rectangle(Point p1, Point p2){
		 
		 infEsquerdo= p1;
		 
		 supDireito= p2;
	 }
	 
	 //métodos
	 
	 int area(){
		 int comp= (supDireito.x- infEsquerdo.x);
		 int largura = (supDireito.y - infEsquerdo.y);
		 return comp * largura;
	 }
	 
	 int perimeter(){
		 int comp= 2*(supDireito.x- infEsquerdo.x);
		 int larg= 2*(supDireito.y - infEsquerdo.y);
		 return comp+larg;
	 }
	 
	 boolean pointInside(Point p){
		 if((p.x >= infEsquerdo.x && p.x <= supDireito.x) && (p.y>= infEsquerdo.y && p.y <= supDireito.y)){
			 return true;
		 }
		 
		 return false;
	 }
	 
	 boolean rectangleInside(Rectangle R){
		 if((R.infEsquerdo.x >= infEsquerdo.x && R.infEsquerdo.y >= infEsquerdo.y) && (R.supDireito.x <= supDireito.x && R.supDireito.y <= supDireito.y)){
			return true;
		}
		
		return false;
	}
 }
	 

// Classe principal com a função main
public class TestGeometry {
   public static void main (String[] args){
     Point a = new Point(1,1);
      Point b = new Point(2,2);
      Point c = new Point(3,4);
      Point d = new Point(8,2);
      
      Rectangle amarelo  = new Rectangle(a, c);
      Rectangle laranja  = new Rectangle(2, 3, 9, 6);
      Rectangle verde    = new Rectangle(3, 4, 4, 5);
      Rectangle azul     = new Rectangle(5, 1, 6, 5);
      Rectangle vermelho = new Rectangle(7, 3, 9, 5);
      
      System.out.println("Retangulo verde dentro do laranja? " + laranja.rectangleInside(verde));       // true
      System.out.println("Retangulo azul dentro do laranja? " + laranja.rectangleInside(azul));         // false
      System.out.println("Retangulo vermelho dentro do laranja? " + laranja.rectangleInside(vermelho)); // true
      
  }
}
