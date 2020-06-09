package questoes;

import java.util.Scanner;

public class Exe05 {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] gabarito = new int[13];
		int[] resposta = new int[13];
		int[] acertos = new int[5];
		int[] cartao = new int[5];
		
		for(int i = 0; i < 13; i++) {
			System.out.print("Gabarito: ");
			gabarito[i] = sc.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			int cont = 0;
			System.out.print("\nNúmero do Cartão: ");
			cartao[i] = sc.nextInt();
			for(int j =0; j < 13; j++) {
				System.out.print("Resposta: ");
				resposta[j] = sc.nextInt();
				if(resposta[j] == gabarito[j]) {
					cont++;
				}
			}
			acertos[i] = cont;
		}
		System.out.println("\n");
		for(int i = 0; i < 5; i++) {
			System.out.print("Cartão "+cartao[i]+": "+acertos[i]);
			if(acertos[i] > 12) {
				System.out.print(" ---- PARABÉNS VOCÊ ACERTOU -----\n");
			}
		}
	}

}
