package entities;

public class Conta {
	
	private int agencia;
	private int numeroConta;
	protected double saldo;

	public Conta() {
	}
	public Conta(int agencia, int numeroConta, double saldo) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroconta) {
		this.numeroConta = numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//sacar
	public void saque(double total) {
		saldo -= total;
	}
	// depositar
	public void deposito(double total) {
		saldo += total;
	}
}
