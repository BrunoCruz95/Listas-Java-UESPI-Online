package questao_04;

public class UsaQuadrado {
	public static void main(String[] args) {
		int lado1 = 2, lado2 = 3, lado3 = 5;
		Quadrado q1 = new Quadrado(lado1);
		Quadrado q2 = new Quadrado(lado2);
		Quadrado q3 = new Quadrado(lado3);
		
		System.out.println("Área Quadrado 1: "+q1.area(lado1)+"\nPerímetro Quadrado 1: "+q1.perimetro(lado1)+"\n");
		System.out.println("Área Quadrado 2: "+q2.area(lado2)+"\nPerímetro Quadrado 2: "+q2.perimetro(lado2)+"\n");
		System.out.println("Área Quadrado 3: "+q3.area(lado3)+"\nPerímetro Quadrado 3: "+q3.perimetro(lado3)+"\n");
	}
}