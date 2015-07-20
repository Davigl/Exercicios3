package exercicio5;
import java.util.Scanner;
import exercicio3.Habilidades;

public class Luta {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Luta usaLuta = new Luta();
		
        Habilidades bolaDeFogo = new Habilidades("Bola de Fogo",60,5,"Gelo");
        Habilidades raioDeGelo = new Habilidades("Raio de Gelo",50,3,"Fogo");
		
		Lutador jailsa = new Lutador("Jailsa", 90, 10, bolaDeFogo);
		Lutador jose = new Lutador("Jose", 80, 5, raioDeGelo );
	
		jailsa.ataca(jose, bolaDeFogo);
		
	}
}
