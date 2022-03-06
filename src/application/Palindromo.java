package application;

public class Palindromo {

	public static void main(String[] args) {

	}
	
	public static boolean palindrome(String palavra) {
		
		int tamanho = palavra.length();
		
		for(int i = 0; i < tamanho / 2; i++) {
			if(palavra.charAt(i) != palavra.charAt(tamanho - i - 1))) {
				return false;
			}
		}
		return true;
	}

}
