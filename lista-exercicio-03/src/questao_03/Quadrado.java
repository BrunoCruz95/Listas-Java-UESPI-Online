package questao_03;

public class Quadrado {
	static double lado;

	// CONSTRUTOR
	Quadrado(double lado) {
		lado = 4;
	}
	// MÉTODOS
	static double area(double lado) {
		double area = lado * lado;
		return area;
	}
	// MÉTODOS
	static double perimetro(double lado) {
		double perimetro = 4 * lado;
		return perimetro;
	}
}
