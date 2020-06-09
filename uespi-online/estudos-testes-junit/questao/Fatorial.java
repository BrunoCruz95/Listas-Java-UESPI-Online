package questao;

public class Fatorial {
	public int fatorial(int n) {
		if(n <= 0)
			return -1;
		int r = 1;
		for(int t = n; t >= 1; t--) {
			r = r * t;
		}
		return r;
	}
}
