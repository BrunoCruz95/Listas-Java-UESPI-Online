package questao_07;

import java.util.Scanner;

public class Estoque {
	Scanner sc = new Scanner(System.in);
	String nome;
	int qtdAtual;
	int qtdMinima;
	
	Estoque(){
		
	}
	Estoque(String nomeEstoque, int qtdAtualEstoque, int qtdMininaEstoque){
		nome = nomeEstoque;
		qtdAtual = qtdAtualEstoque;
		qtdMinima = qtdMininaEstoque;
	}
	void mudarNome() {
		System.out.print("\nNovo nome: ");
		nome = sc.nextLine();
	}
	void mudarQtdMinima() {
		System.out.print("Nova quantidade mínima: ");
		qtdMinima = sc.nextInt();
	}
	void repor(int qtd) {
		qtdAtual = qtdAtual + qtd;
	}
	void darBaixa(int qtd) {
		qtdAtual = qtdAtual - qtd;
	}
	String mostrar(String nome, int qtdAtual, int qtdMinina) {
		return "\nNome: "+nome+
				"\nQuantidade atual: "+qtdAtual+
				"\nQuantidade mínima: "+qtdMinima;
	}
	boolean precisaRepor(boolean var) {
		if(qtdAtual  < qtdMinima) {
			var = true;
			System.out.println("\nPrecisa repor");
		}else {
			var = false;
			System.out.println("\nNão precisa repor");
		}
		return var;
	}
}
