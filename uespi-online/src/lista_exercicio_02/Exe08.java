package lista_exercicio_02;

import java.util.Scanner;

public class Exe08 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[][] matriz = new int[2][3];
		int soma = 0;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + (i + 1) + "," + (j + 1) + "]: ");
				matriz[i][j] = sc.nextInt();
				soma = soma + matriz[i][j];
			}
		}
		System.out.print("\n");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" +matriz[i][j]+ "]");
				if(j == 2) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("\nA soma de todos os elementos é: "+soma);
	}
}
