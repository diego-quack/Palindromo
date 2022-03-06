package application;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Entre com uma palavra pra saber se é um palíndromo ou não: ");
		String palavra = input.next();
		System.out.println(palindromo(palavra));
		
		input.close();

	}
	
	public static boolean palindromo(String palavra) {
		
		int tamanho = palavra.length();
		
		for(int i = 0; i < tamanho / 2; i++) {
			if(palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
