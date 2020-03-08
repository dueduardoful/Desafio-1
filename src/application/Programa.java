package application;
import entities.Cliente;
import entities.ContaCorrente;

public class Programa {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		conta1.setAgencia(3314);
		conta1.setNumeroConta(010422);
	
		
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Eduardo Batista");
		cliente1.setCpf("320.201.029-43");
		conta1.saque(300);
		
		System.out.println("agencia: " + conta1.getAgencia()
		+ "\nConta: "
		+ conta1.getNumeroConta()
		+ "\nNome: " 
		+ cliente1.getNome()
		+ "\nCPF: "
		+ cliente1.getCpf()
		+ "\nLimite: "
		+ conta1.getLimite()
		+ "\nSaldo: "
		+ conta1.getSaldo()
		+ "\n=============================="
		+ "\nLimite atualizado: "
		+ conta1.getLimite()
		+ "\n=============================="
		+ "\nSaldo Atualizado: "
		+ conta1.getSaldo()
		);


	}

}
