package questao_08;

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
		return saldo = saldo * 0.1;
	}
}
