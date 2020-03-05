package application;

import entities.Cliente;
import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.setAgencia(3314);
		conta1.setNumeroConta(010422);
	
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Eduardo Batista");
		cliente1.setCpf("320.201.029-43");
		
		System.out.println("agencia: " + conta1.getAgencia()
		+ "\nConta: "
		+ conta1.getNumeroConta()
		+ "\nNome: " 
		+ cliente1.getNome()
		+ "\nCPF: "
		+ cliente1.getCpf()
		);
		

	}

}
