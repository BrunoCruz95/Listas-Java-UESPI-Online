package lista_exercicio_02;

import java.util.Scanner;

public class Exe10 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int[][] matriz = new int[5][5];
		int somaLinha = 0;
		int somaColuna = 0;
		int somaPri = 0;
		int somaSec = 0;
		int somaTod = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("[" + (i + 1) + "," + (j + 1) + "]: ");
				matriz[i][j] = sc.nextInt();
				if (i == 3) {
					somaLinha = somaLinha + matriz[i][j];
				}
				if (j == 1) {
					somaColuna = somaColuna + matriz[i][j];
				}
				if (j == i) {
					somaPri = somaPri + matriz[i][j];
				}
				somaTod = somaTod + matriz[i][j];
			}
			somaSec = somaSec + matriz[i][4-i];
		}
		System.out.print("\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("[" + matriz[i][j] + "]");
				if (j == 4) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("\nSoma Linha 4: " + somaLinha);
		System.out.println("\nSoma Coluna 2: " + somaColuna);
		System.out.println("\nSoma Diagonal Principal: " + somaPri);
		System.out.println("\nSoma Diagonal Secundaria: " + somaSec);
		System.out.println("\nSoma Todos Elementos: " + somaTod);
	}
}
