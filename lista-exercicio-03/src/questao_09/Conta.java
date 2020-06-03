package questao_09;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	String data;
	
	void sacar(double valor) {
		saldo = saldo - valor;
	}
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	double calcularRendimento() {
		saldo = saldo * 0.1;
		return saldo;
	}
	void recuperarDadosParaImpressao() {
		System.out.println("Titular: "+titular+
				"\nNúmero: "+numero+
				"\nAgencia: "+agencia+
				"\nSaldo: "+saldo+
				"\nData: "+data+"\n");
	}
}
