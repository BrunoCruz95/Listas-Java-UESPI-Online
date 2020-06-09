package casos_de_testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import questao.Fibonacci;

public class TestFibonacci {
	@Test
	public void testeMultiplica() {
		Fibonacci f = new Fibonacci();
		assertEquals("Caso 1", 1, f.fibonacci(1));
		assertEquals("Caso 2", 1, f.fibonacci(2));
		assertEquals("Caso 3", 2, f.fibonacci(3));
		assertEquals("Caso 4", 3, f.fibonacci(4));
		assertEquals("Caso 5", 5, f.fibonacci(5));
		assertEquals("Caso 6", 8, f.fibonacci(6));
		assertEquals("Caso 7", -1, f.fibonacci(-1));
	}
}
