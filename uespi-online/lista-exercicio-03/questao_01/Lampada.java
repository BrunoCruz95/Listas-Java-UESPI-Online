package questao_01;

public class Lampada {
	static boolean ligada;

	public static void main(String[] agrs) {
		liga();
		observa();
	}

	static void liga() {
		ligada = true;
	}

	static void desliga() {
		ligada = false;
	}

	static void observa() {
		if (ligada == true)
			System.out.println("\nLigada");
		else
			System.out.println("\nDesligada");
	}
}
