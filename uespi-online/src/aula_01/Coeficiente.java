package aula_01;

import java.util.Scanner;

public class Coeficiente {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		double a, b, c, res;
		
		System.out.print("a: ");
		a = input.nextDouble();
		System.out.print("b: ");
		b = input.nextDouble();
		System.out.print("c: ");
		c = input.nextDouble();
		
		res = (b * b) - 4 * a * c;
		
		System.out.printf("\nDelta: %.2f",res);
	}
}
