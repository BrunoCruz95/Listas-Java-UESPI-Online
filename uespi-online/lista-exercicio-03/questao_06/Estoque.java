package questao_06;

public class Estoque {
	String nome;
	int qtdAtual, qtdMinima;
	
	Estoque(){
		
	}
	Estoque(String nome, int qtdAtual, int qtdMinina){
		
	}
	void mudarNome(String nome) {
		
	}
	void mudarQtdMinima(int qtdMinina) {
		
	}
	void repor(int qtd) {
		qtdAtual = qtdAtual + qtd;
	}
	void darBaixa(int qtd) {
		qtdAtual = qtdAtual - qtd;
	}
	String mostrar(String nome) {
		return "\nNome: "+nome+
				"\nQuantidade mínima: "+qtdMinima+
				"\nQuantidade atual: "+qtdAtual;
	}
	boolean precisaRepor(boolean var) {
		if(qtdAtual  < qtdMinima)
			var = true;
		else
			var = false;
		return var;
	}
}
