package casos_de_testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import questao.Fatorial;

public class TestFatorial {
	@Test
	public void testeFatorial() {
		Fatorial f = new Fatorial();
		assertEquals("Caso 1",1,f.fatorial(1));
		assertEquals("Caso 2",2,f.fatorial(2));
		assertEquals("Caso 3",6,f.fatorial(3));
		assertEquals("Caso 4",24,f.fatorial(4));
		assertEquals("Caso 5",-1,f.fatorial(-1));
	}
}
