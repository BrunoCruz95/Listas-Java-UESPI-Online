package questao_03;

public class Quadrado {
	static double lado;

	// CONSTRUTOR
	Quadrado(double lado) {
		lado = 4;
	}
	// M�TODOS
	static double area(double lado) {
		double area = lado * lado;
		return area;
	}
	// M�TODOS
	static double perimetro(double lado) {
		double perimetro = 4 * lado;
		return perimetro;
	}
}
