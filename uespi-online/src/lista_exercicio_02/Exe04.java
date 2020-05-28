package lista_exercicio_02;

import java.util.Scanner;

public class Exe04 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int[] vetor1 = new int[20];
		int[] vetor2 = new int[20];

		for (int i = 0; i < 20; i++) {
			System.out.print("Digite: ");
			vetor1[i] = sc.nextInt();
		}
		System.out.print("\nVetor 1: [");

		for (int i = 0; i < 20; i++) {
			System.out.print(vetor1[i]);
			if (i < 19) {
				System.out.print(", ");
			}
			if (i == 19) {
				System.out.print("]\n");
			}
		}
		System.out.print("Vetor 2: [");

		for (int i = 0; i < 20; i++) {
			vetor2[i] = vetor1[19-i];

			System.out.print(vetor2[i]);
			if (i < 19) {
				System.out.print(", ");
			}
			if (i == 19) {
				System.out.print("]\n");
			}
		}
	}
}
