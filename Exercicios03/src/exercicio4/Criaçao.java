package exercicio4;
import java.util.Scanner;

public class Criaçao {
	
	static final int TERRA = 1;
	static final int AR = 2;
	static final int AGUA = 3;
	static final int FOGO = 4;
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Pessoa pessoaEsoterica = new Pessoa("",0); 
		
		System.out.print("Digite o seu nome: ");
		pessoaEsoterica.setNome(ler.nextLine());
		
		System.out.print("Digite o mes do seu nascimento em nÃºmero: ");
		pessoaEsoterica.setMes(ler.nextInt());
		ler.nextLine();
		
		
		
		if (pessoaEsoterica.getMes() % 4 == TERRA) {
			System.out.println("VocÃª Ã© do elemento Terra");
			}
		
		else {
			if (pessoaEsoterica.getMes() % 3 == AR) {
				System.out.println("VocÃª Ã© do elemento Ar");
			}
		
		else {
			if (pessoaEsoterica.getMes() % 3 == AGUA) {
				System.out.println("VocÃª Ã© do elemento Ã�gua");
			 }
			
		else {
				System.out.println("VocÃª Ã© do elemento Fogo");
			 }
}
}
}
}
