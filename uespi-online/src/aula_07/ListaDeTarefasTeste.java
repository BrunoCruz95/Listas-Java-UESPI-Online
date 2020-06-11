package aula_07;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ListaDeTarefasTeste {
	
	/*
	 *  (LER AS TAREFAS)
	 *  - SOMENTE LETRAS.
	 *  - MAIS DE UMA PALAVRA.
	 *  
	 *  (REPOSITÓRIO)
	 *  - 10 TAREFAS NO MÁXIMO.
	 */
	
	@Test
	public void testTarefa() {
		// DADO QUE...
		String descricao = "Lavar os pratos";
		Tarefa t = new Tarefa(descricao);
		// QUANDO EU ...
		String resultado = t.getDescricao();
		// EU ESPERO ...
		assertTrue(resultado.equals(descricao)); // equals ele compara duas strings
	}
	
	// PADRÃO PRA RECONHECER NOME DE PESSOAS
	// \\w -> letra ou numero
	// [0-9] ou \\d   -> 
	// [A-Z]    -> uma letra maiuscula
	// [a-z]    -> uma letra minuscula
	// [a-zA-Z] -> uma letra
	// \\s      -> espaço em branco
	// +        -> ocrre 1 ou mais vezes
	
	// PRAS IGNORAR MAIUSCULOS E MINUSCULOS
	// {?i}
	@Test
	public void testPadraoRegexSomenteLetras() {
		// DADO QUE...
		String descricao = "LaVar As ";
		// QUANDO EU ...
		boolean resultado = descricao.matches("([a-zA-Z]{2,}\\s)+([a-zA-Z]{2,}|[a-zA-Z]{2,}\\s)");
		
		// EU ESPERO ...
		assertTrue(resultado);
	}
	
	@Test
	public void testValidaTarefaAntesDeCriar() {
		// DADO ...
		ListaDeTarefa lista = new ListaDeTarefa();
		String descricao = "uma tarefa teste valida";
		// QUANDO ...
		lista.valida(descricao);
		boolean resultado = lista.valida(descricao);
		// EU ESPERO ...
		assertTrue(resultado);
	}
	
	@Test
	public void testArmazenarTarefaDepoisDeValidar() {
		// DADO ...
		ListaDeTarefa lista = new ListaDeTarefa();
		String descricaoOriginal = "uma tarefa teste valida";
		Tarefa nova = new Tarefa(descricaoOriginal);
		// QUANDO ...
		boolean resultado = lista.adiciona(nova);
		Tarefa tarefaRecuperado = lista.getUltimaTarefa();
		// EU ESPERO ...
		assertTrue(resultado);
		String descricaoTarefaRecuperada = tarefaRecuperado.getDescricao();
		assertTrue(descricaoTarefaRecuperada.equals(descricaoOriginal));
	}
	
	@Test
	public void testArmazenarMaisDeDezTarefa() {
		// DADO ...
		ListaDeTarefa lista = new ListaDeTarefa();
		String descricaoOriginal = "uma tarefa teste valida";
		Tarefa nova = new Tarefa(descricaoOriginal);
		// QUANDO ...
		for(int i = 0; i < 10; i++) {
			lista.adiciona(nova);
		}
		boolean resultadoDaDecimaPrimeiraTentativa = lista.adiciona(nova);
		
		// EU ESPERO ...
		assertFalse(resultadoDaDecimaPrimeiraTentativa);
	}
	
	@Test
	public void testNovasFuncionalidades() {
		// TODO criar funcionalidade de remover tarefas
		// TODO criar funcionalidade de alterar tarefas
		// TODO criar funcionalidade de recupar um tarefa na posição i, onde 0 <= i <= 9
	}
	
}
