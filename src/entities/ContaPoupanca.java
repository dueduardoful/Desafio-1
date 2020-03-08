package entities;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(int agencia, int numeroConta, double saldo, double limite) {
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


}
