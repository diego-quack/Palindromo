package application;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Entre com uma palavra pra saber se � um pal�ndromo ou n�o: ");
		String palavra = input.next();
		System.out.println(palindromo(palavra));
		
		input.close();

	}
	
	public static String palindromo(String palavra) {
		
		String palindromo = "� um pal�dromo";
		String naoPalindromo = "N�o � um pal�ndromo.";
		
		int tamanho = palavra.length();
		
		for(int i = 0; i < tamanho / 2; i++) {
			if(palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
				return naoPalindromo;
			}
		}
		return palindromo;
	}

}
