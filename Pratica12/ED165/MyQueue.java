// -----------------------------------------------------------
// Estruturas de Dados 2017/2018 (CC1007) - DCC/FCUP
// http://www.dcc.fc.up.pt/~pribeiro/aulas/edados1718/
// -----------------------------------------------------------
// Interface para o TAD Fila
// Última alteração: 06/04/2018
// -----------------------------------------------------------

public interface MyQueue<T> {

   // Métodos que modificam a fila
   public void enqueue(T v); // Coloca um valor no final da fila
   public T dequeue();       // Retira e retorna o valor no inicio da fila

   // Métodos que acedem a informação (sem modificar)
   public T first();         // Retorna valor no inicio da fila
   public int size();        // Retorna quantidade de elementos na fila
   public boolean isEmpty(); // Indica se a fila está vazia
}
