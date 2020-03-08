package entities;

public class ContaCorrente extends Conta {

	protected double saldo = 200;
	private double taxaConta = 0.3;
	private double taxaLimite = 2;
	private double limite = 300;
	private double taxaTransf = 4;
	
	public ContaCorrente() {
		super();
	}
	public ContaCorrente(int agencia, int numeroConta, double saldo, double limite) {
		super(agencia, numeroConta, saldo, limite);
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

	@Override
	public void saque(double valor) {
		if (valor < saldo) {
			saldo += - valor - taxaConta;
		}
		else if(valor > saldo) {
			saldo = saldo -valor - taxaLimite;
			limite = limite + saldo;
		}
		else if(valor == saldo) {
			saldo = saldo - valor;
			limite = limite -taxaLimite;
		}
		else if(valor >= limite + saldo) {
			System.out.println("Saldo Insuficiente");
		}
		else {
			
		}
	}
	
	@Override
	// depositar
	public void deposito(double total) {
		saldo += total;
	}
	@Override
	// transfere
	public void transfere(double valor, ContaCorrente conta) {
		saldo -= valor + taxaTransf;
		conta.deposito(100);
	}
	@Override
	// limite
	public void limite(double valor) {

	}
	
	
}
