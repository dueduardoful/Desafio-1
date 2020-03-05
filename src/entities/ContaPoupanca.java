package entities;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numeroConta, double saldo) {
		super(agencia, numeroConta, saldo);
	}
	
	@Override
	public void saque(double total) {
		super.saque(total);
		saldo -= total;
	}

}
