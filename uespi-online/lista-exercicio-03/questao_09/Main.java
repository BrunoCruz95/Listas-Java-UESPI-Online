package questao_09;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.titular = "CAIXA";
		conta.data = "10/01/2020";
		conta.agencia = "0600";
		conta.saldo = 1000;
		conta.numero = 234132;
		
		conta.recuperarDadosParaImpressao();
		
		conta.depositar(100);
		conta.sacar(50);
		conta.calcularRendimento();
		conta.recuperarDadosParaImpressao();
	}
}
