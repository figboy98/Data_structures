// -----------------------------------------------------------
// Estruturas de Dados 2018/2019 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1819/
// -----------------------------------------------------------
// Exemplo de utilizacao da uma arvore binaria de pesquisa
// Ultima alteracao: 02/05/2018
// -----------------------------------------------------------
import java.util.*;
class TestBSTree {
   public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
      // Criacao da Arvore
      BSTree<Integer> t = LibBTree.readIntTree(in);

      // Inserindo 11 elementos na arvore binaria de pesquisa
    //  int[] data = {1 ,2 };
     // for (int i=0; i<data.length; i++) t.insert(data[i]);

      // Escrever resultado de chamada a alguns metodos
     // System.out.println("numberNodes = " + t.numberNodes());
     // System.out.println("depth = " + t.depth());
      //System.out.println("contains(2) = " + t.contains(2));
      //System.out.println("contains(3) = " + t.contains(3));

      // Escrever nos da arvore seguindo varias ordens possiveis
     t.printPreOrder();
      //t.printInOrder();
      //t.printPostOrder();

      // Experimentando remocao
      //t.remove(14);
      //t.printPreOrder();
      //t.printInOrder();
      //t.printPostOrder(); */
    System.out.println(t.valid());
   }
}
