// -----------------------------------------------------------
// Estruturas de Dados 2018/2019 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1819/
// -----------------------------------------------------------
// Exemplo de utilizacao da lista ligada simples
// Ultima alteracao: 01/04/2018
// -----------------------------------------------------------

public class TestSinglyLinkedList {
   public static void main(String[] args) {

      // Criacao de lista de inteiros
      SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
      SinglyLinkedList<Integer> newList= new SinglyLinkedList<Integer>();
	list.addLast(2);
	list.addLast(4);
	list.addLast(6);
	list.addLast(8);
	list.addLast(10); 
	list.addLast(11);
	//System.out.println(list.size());
	/*System.out.println(list.get(0));
	System.out.println(list.get(2));
	System.out.println(list.get(3));
	System.out.println(list.get(4));
	System.out.println(list.get(5));
	System.out.println(list.get(-1));
	System.out.println(list.get(6));*/
	list.duplicate();
	//System.out.println(list.count(11));
	list.removeAll(11);

   System.out.println(list);
}
}
