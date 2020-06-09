package questao_04;

public class Quadrado {
	static double lado;

	// CONSTRUTOR
	Quadrado(double lado) {
		
	}
	// MÉTODOS
	double area(double lado) {
		double area = lado * lado;
		return area;
	}
	// MÉTODOS
	double perimetro(double lado) {
		double perimetro = 4 * lado;
		return perimetro;
	}
}
