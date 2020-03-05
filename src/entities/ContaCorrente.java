package entities;

public class ContaCorrente extends Conta {
	private double valorTaxa;
	
	public ContaCorrente() {
	}

	public ContaCorrente(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	
}
