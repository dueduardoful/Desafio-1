package entities;

public abstract class Conta {

	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	private double taxaConta = 0.3;
	private double taxaLimite = 2;
	protected double limite = 300;
	private double taxaTransf = 4;
	
	Cliente cliente;
	
	public Conta() {
	}
	
	public Conta(int agencia, int numeroConta, double saldo, double limite) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
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
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//sacar
	public void saque(double valor) {
		if (valor < saldo) {
			saldo += - valor + limite - taxaConta;
		}
		else if(valor > saldo) {
			limite = limite-(valor-saldo + taxaLimite);
			saldo = 0;
		}
		else if(valor == saldo) {
			saldo = saldo - valor;
			limite = limite -taxaLimite;
		}
		else if(valor + taxaLimite > limite + saldo) {
			System.out.println("Saldo Insuficiente" + saldo);
		}
	}
	// depositar
	public void deposito(double total) {
		saldo += total;
	}
	// transfere
	public void transfere(double valor, ContaCorrente conta) {
		saldo -= valor - taxaTransf;
		conta.deposito(valor);
	}
	// limite
	public void limite(double valor) {

	}
}
