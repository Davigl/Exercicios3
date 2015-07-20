package exercicios;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		//Carros no Estoque
		
		Carros carro1 = new Carros("Ferrari ",90.00);
		Carros carro2 = new Carros("Gol ",120.00);
		Carros carro3 = new Carros("Fusca ",1.00);
		
		//Menu do Cliente
		
		System.out.println("1 =" + " " + carro1 + " " + "R$");
		System.out.println("2 =" + " " + carro2 + " " + "R$");
		System.out.println("3 =" + " " + carro3 + " " + "R$");
		System.out.println(" ");
		System.out.print("Digite o numero correspondente ao carro: ");
		
		// Escolhe Opcao
		
		int opcaoCarro = 0;
		opcaoCarro = ler.nextInt();

		
		if (opcaoCarro == 1) {
				System.out.print("Digite a quantidade de dias: ");
				int dias = ler.nextInt(); 
				System.out.print("O preço do aluguel é " + carro1.getPreco() * dias + " " + "R$") ;
		}
		
		else {
			if (opcaoCarro == 2) {
				System.out.print("Digite a quantidade de dias: ");
				int dias = ler.nextInt(); 
				System.out.print("O preço do aluguel é " + carro2.getPreco() * dias + " " + "R$") ;
			}
		
		
		else {
			if (opcaoCarro == 3) {
				System.out.print("Digite a quantidade de dias: ");
				int dias = ler.nextInt(); 
				System.out.print("O preço do aluguel é " + carro3.getPreco() * dias +  " " + "R$") ;
			}
	}
			
			ler.close();
			
}
	}
	
}
