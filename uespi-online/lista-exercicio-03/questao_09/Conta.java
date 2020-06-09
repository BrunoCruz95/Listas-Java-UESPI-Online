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
		if (valor > 0)
			this.saldo = this.saldo + valor;
	}

	double calcularRendimento() {
		this.saldo = this.saldo + (this.saldo * 0.1);
		return this.saldo;
	}

	void recuperarDadosParaImpressao() {
		System.out.println("Titular: " + titular +
				"\nNúmero: " + numero +
				"\nAgencia: " + agencia +
				"\nSaldo: " + saldo+
				"\nData: " + data +
				"\nRendimento: "+ calcularRendimento()+"\n");
	}
}
