

public class Strings {

    public static void main(String[] args) {

	//String a = 1007;     // A tentar atribuir um número inteiro a uma String
	String b = "1007";   // Colocar "1007" na variável b
	String c = "CC";     // Colocar "CC" na variável c
	String d = c + b;    // Concatenar "CC" com "1007" e colocar resultado na variável d
	String e = c + 1007; // Concatenar "CC" com número 1007 e colocar resultado na variável e

	// Escrever conteúdo das duas strings criadas
	System.out.println("d = " + d);
	System.out.println("e = " + e);

	// Como comparar duas strings
	System.out.println("d==e? " + (d==e));             // Não está correcto (compara referências)
	System.out.println("d.equals(e)? " + d.equals(e)); // Maneira correcta de comparar o conteúdo de duas strings

	// Como calcular o tamanho de uma string
	int size = d.length();
	System.out.println("tamanho = " + size);

	// Como ir buscar o caracter numa dada posição da string
	System.out.println("charAt(0) = " + d.charAt(0));
	System.out.println("charAt(2) = " + d.charAt(2));
	//System.out.println("charAt(10) = " + d.charAt(10));

	// Como ir buscar parte de uma string entre duas dadas posições
	String sub = d.substring(1,4);
	System.out.println("substring(1,4) = " + sub);

	// Procurando a primeira ocorrência de um dado caracter
	char ch  = '7';
	int pos = d.indexOf(ch);
	System.out.println("indexOf(" + ch +") = " + pos);
	
	//c.toLowerCase();
	System.out.println(c.toLowerCase());	
    
    
    if(isPalindrome("ama")){
		System.out.println("É Palíndromo");
	}
	
	else{
		System.out.println("Não é Palíndromo");
	}
	
	
}
    public static boolean isPalindrome(String str){
		str = str.toLowerCase();
		int size=str.length();
		
		for(int i=1; i<(size-1); i++){
			if((str.charAt(i-1)) != (str.charAt(size-i))){
				return false;
			}
		}
			
			return true;
		} 
		
}
