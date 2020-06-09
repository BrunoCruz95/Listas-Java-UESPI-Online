package questoes;

import java.util.Scanner;

public class Exe09 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int[][] matriz = new int[4][4];
		int soma1 = 0;
		int soma2 = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + (i + 1) + "," + (j + 1) + "]: ");
				matriz[i][j] = sc.nextInt();
				if (i != j && j < i) {
					soma1 = soma1 + matriz[i][j];
				}
				if (i != j && j > i) {
					soma2 = soma2 + matriz[i][j];
				}
			}
		}
		System.out.print("\n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + matriz[i][j] + "]");
				if (j == 3) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("\nA soma dos elementos abaixo da diagonal principal é: " + soma1);
		System.out.println("\nA soma dos elementos acima da diagonal principal é: " + soma2);

	}

}
