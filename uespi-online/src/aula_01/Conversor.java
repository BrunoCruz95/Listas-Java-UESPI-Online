package aula_01;

import java.util.Scanner;

public class Conversor {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int fah, cel;
		
		System.out.print("Temperatura em Fahrenheit: ");
		fah = sc.nextInt();
		
		cel = (fah - 32) * 5/9;
		
		System.out.println("\n"+fah+" em Celsius é: °"+cel);
	}
}
