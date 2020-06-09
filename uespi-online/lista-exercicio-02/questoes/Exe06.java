package questoes;

import java.util.Scanner;

public class Exe06 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int[][] matriz3 = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("\nMATRIZ 1");
				System.out.print("Coordenadas ["+(i+1)+","+(j+1)+"]: ");
				matriz1[i][j] = sc.nextInt();
				System.out.println("\nMATRIZ 2");
				System.out.print("Coordenadas ["+(i+1)+","+(j+1)+"]: ");
				matriz2[i][j] = sc.nextInt();
				
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		System.out.println("\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("["+matriz1[i][j]+"]");
				if( j == 2) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("\n    +\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("["+matriz2[i][j]+"]");
				if( j == 2) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("\n    =\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("["+matriz3[i][j]+"]");
				if( j == 2) {
					System.out.print("\n");
				}
			}
		}
		
	}

}
