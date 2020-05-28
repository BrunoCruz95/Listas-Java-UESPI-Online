package lista_exercicio_02;

import java.util.Scanner;

public class Exe07 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Número de Linhas: ");
		int linha = sc.nextInt();
		System.out.print("Número de Colunas: ");
		int coluna = sc.nextInt();
		
		int[][] matriz1 = new int[linha][coluna];
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				System.out.print("["+(i+1)+","+(j+1)+"]: ");
				matriz1[i][j] = sc.nextInt();
			}
		}
		System.out.print("\n");
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				System.out.print("["+matriz1[i][j]+"]");
				if(j == (coluna - 1)) {
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n = \n");
		for(int i = 0; i < coluna; i++) {
			for(int j = 0; j < linha; j++) {
				System.out.print("["+matriz1[j][i]+"]");
				if(j == (linha - 1)) {
					System.out.print("\n");
				}
			}
		}
		
		
	}

}
