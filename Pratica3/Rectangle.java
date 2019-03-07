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
