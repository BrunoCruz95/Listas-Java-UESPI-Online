package aula_01;

import java.util.Scanner;

public class Media {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int i;
		double nota, media, soma = 0;
		
		for(i = 1; i <= 3; i++) {
			System.out.print(+i+"ª Nota: ");
			nota = input.nextDouble();
			soma = soma + nota;
		}
		media = soma / 3;
		System.out.printf("\nMédia: %.2f", media);
	}
}
