package questoes;

import java.util.Scanner;

public class Exe11 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int[] vetor = new int[20];
		int aux;
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("\nLista Normal: [");
		for (int i = 0; i < 20; i++) {
			System.out.print(vetor[i]);
			if (i < 19) {
				System.out.print(", ");
			} else {
				System.out.print("]\n");
			}
		}
		
		for (int i = 0; i < 20; i++) {
			for (int j = i + 1; j < 20; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}

		System.out.print("\nLista Ordenada Crescente: [");
		for (int i = 0; i < 20; i++) {
			System.out.print(vetor[i]);
			if (i < 19) {
				System.out.print(", ");
			} else {
				System.out.print("]\n");
			}
		}
	}

}
