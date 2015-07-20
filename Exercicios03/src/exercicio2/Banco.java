package exercicio2;

import java.util.Scanner;

public class Banco {

	// Saca dinheiro.

	public void sacarDinheiro(Pessoa user1, double saca, Scanner ler,
			double emprestimo) {

		System.out.print("Digite a Quantia a ser retirada: ");

		saca = ler.nextDouble();
		ler.nextLine();

		if (saca <= user1.getSaldo()) {
			user1.setSaldo(user1.getSaldo() - saca);
		} else {
			user1.setSaldo(user1.getSaldo() - saca);

			user1.setSaldo(user1.getSaldo() + ((user1.getSaldo() * 10) / 100));
		}
	}

	// Deposita dinheiro.

	public void depositarDinheiro(Pessoa user1, double deposita, Scanner ler) {

		System.out.print("Digite a Quantia a ser depositada: ");

		deposita = ler.nextDouble();
		ler.nextLine();

		user1.setSaldo(user1.getSaldo() + deposita);

	}

	// Menu.

	public void imprimeMenu() {

		System.out.println("Depositar Dinheiro - 1");
		System.out.println("Sacar Dinheiro - 2");
		System.out.println("Sair - 3");
	}

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Pessoa user1 = new Pessoa("Jailsa",0.0);
		
		
		// Variaveis do Banco.
		
		double deposita = 0;
		double saca = 0;
		double emprestimo = 0;
		int escolheOpcao = 0;
		
		
		Banco n = new Banco();
	
		// Imprime Menu
		
		n.imprimeMenu();
		
		// Escolhe Opçao no Menu.
		
		System.out.print("Digite a Opcao: ");
		escolheOpcao = ler.nextInt();
		ler.nextLine();
			
		// Se Escolhe Depositar.
		
		if (escolheOpcao == 1) {
			n.depositarDinheiro(user1, deposita, ler);
			System.out.println(user1.getNome() + " tem " + user1.getSaldo() + " R$");
		}
		
		// Se escolhe Sacar.
		
		else {
			if (escolheOpcao == 2) {
			n.sacarDinheiro(user1, saca , ler, emprestimo);
			System.out.println(user1.getNome() + " tem " + user1.getSaldo() + "R$");
			}
		
		else {
			System.out.println("Tchau! ");
		}
		}
	}
}
