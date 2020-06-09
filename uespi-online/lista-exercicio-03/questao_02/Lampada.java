package questao_02;

public class Lampada {
	static boolean ligada;
	static Lampada lampada1;
	static Lampada lampada2;
	public static void main(String[] agrs) {
		
		liga(lampada1);
		observa();
		desliga(lampada2);
		observa();
	}

	static void liga(Lampada lampada1) {
		ligada = true;
	}

	static void desliga(Lampada lampada2) {
		ligada = false;
	}

	static void observa() {
		if (ligada == true)
			System.out.println("\nLigada");
		else
			System.out.println("\nDesligada");
	}
}
