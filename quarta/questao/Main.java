package quarta.questao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String palavra;
		palavra = in.next();
		palavra.toLowerCase();
		boolean todasAsLetras = true;
		
		 for (char letra = 'a'; letra <= 'z'; letra++) {
			  if (!palavra.contains(String.valueOf(letra))) {
	                todasAsLetras = false;
	                break;
	            }
	        }
		 }
}
