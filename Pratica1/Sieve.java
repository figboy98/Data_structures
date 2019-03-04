public class Sieve {

    // Procedimento para usar o algoritmo do Crivo de Eratóstenes
    // [procedimento ainda por completar]
    public static void sieve(int n, boolean prime[]) {
		int k=2;
		//Marcar todos os números como true
		for(int i=2; i<=n; i++){
			prime[i]=true;
		}
		
		for(int i=2; i<=n;i++){
			
			if(prime[i]==true){
				k=2;
				for(int j=i; j*k<=n; k++){
					
					prime[(j*k)]=false;
					}
				}
			}				
    }

    
    public static void main(String[] args) {
	
	int n=1000; // Limite dos números

	// Cria um array de inteiros com tamanho n+1
	// (arrays começam na posição 0)
	boolean[] prime = new boolean[n+1];

	// Chama o procedimento sieve para números até 'n' no array 'prime'
	sieve(n, prime);

	// Escreve todos os números marcados a 'true' no array 'prime'
	for (int i=2; i<=n; i++)
	    if (prime[i])
		System.out.println(i);
    }
}
