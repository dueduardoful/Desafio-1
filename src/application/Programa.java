package application;
import entities.Cliente;
import entities.ContaCorrente;

public class Programa {

	public static void main(String[] args) {
		// ======================== DADOS CLIENTE EDUARDO ==========================
		ContaCorrente conta1 = new ContaCorrente();
		conta1.setAgencia(3314);
		conta1.setNumeroConta(010422);
		conta1.setSaldo(200);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Eduardo Batista");
		cliente1.setCpf("320.201.029-43");
		
		// ======================== DADOS CLIENTE JOAO ==========================
		ContaCorrente conta2 = new ContaCorrente();
		conta2.setAgencia(2215);
		conta2.setNumeroConta(121039);
		conta2.setSaldo(200);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Joao");
		cliente2.setCpf("416.129.245-65");
		
		conta1.transfere(400, conta2);
		
		System.out.println("agencia: " + conta1.getAgencia()
		+ "\nConta 1: "
		+ conta1.getNumeroConta()
		+ "\nNome: " 
		+ cliente1.getNome()
		+ "\nCPF: "
		+ cliente1.getCpf()
		+ "\nLimite: "
		+ conta1.getLimite()
		+ "\nSaldo: "
		+ conta1.getSaldo()
		+ "\n============================"
		+ "\nConta 2: "
		+ conta2.getNumeroConta()
		+ "\nNome: "
		+ cliente2.getNome()
		+ "\nCPF: "
		+ cliente2.getCpf()
		+ "\nLimite: "
		+ conta2.getLimite()
		+ "\nSaldo: "
		+ conta2.getSaldo()
		);


	}

}
