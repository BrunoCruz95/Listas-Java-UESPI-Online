package questao_07;

public class UsaEstoque {
	public static void main(String[] args) {
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
		Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);
	
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(6);

		System.out.println(estoque1.mostrar(estoque1.nome, estoque1.qtdAtual, estoque1.qtdMinima));
		estoque1.precisaRepor(true);
		System.out.println(estoque2.mostrar(estoque2.nome, estoque2.qtdAtual, estoque2.qtdMinima));
		estoque2.precisaRepor(true);
		System.out.println(estoque3.mostrar(estoque3.nome, estoque3.qtdAtual, estoque3.qtdMinima));
		estoque3.precisaRepor(true);
		
		estoque1.mudarNome();
		System.out.println(estoque1.mostrar(estoque1.nome, estoque1.qtdAtual, estoque1.qtdMinima));
		estoque3.mudarQtdMinima();
		System.out.println(estoque3.mostrar(estoque3.nome, estoque3.qtdAtual, estoque3.qtdMinima));
		
	}
}
