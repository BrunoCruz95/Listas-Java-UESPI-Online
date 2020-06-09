package aula_01;

import java.util.Scanner;

public class Velocidade {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		double tempo, distancia, velocidade;
		
		System.out.print("Tempo (h): ");
		tempo = input.nextDouble();
		System.out.print("Distância (km) : ");
		distancia = input.nextDouble();
		
		velocidade =  tempo / distancia;
		
		System.out.printf("\nVelocidade Média: %.1f Km/h",velocidade);
	}
}
