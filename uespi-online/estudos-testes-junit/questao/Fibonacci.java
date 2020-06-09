package questao;

public class Fibonacci {
	public int fibonacci(int n) {
		if(n <= 0) {
			return -1;
		}
		int atual = 0;
		int anterior = 1;
		int anteterior = 0;
		for (int i = 1; i <= n; i++) {
			anteterior = anterior;
			anterior = atual;
			atual = anterior + anteterior;
		}
		return atual;
	}
}
