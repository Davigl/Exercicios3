package exercicio5;
import java.util.Scanner;

import exercicio3.Batalha;
import exercicio3.Habilidades;

public class Lutador implements Luta2 {
	
	private String nome;
	private int hp;
	private int sp;
	private Habilidades habilidade;
	
	public Habilidades getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(Habilidades habilidade) {
		this.habilidade = habilidade;
	}

	public Lutador(String nome, int hp, int sp , Habilidades habilidade) {
		this.nome = nome;
		this.hp = hp;
		this.sp = sp;
		this.habilidade = habilidade;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", hp=" + hp + ", sp=" + sp
				+ ", habilidade=" + habilidade + "]";
	}
	
	
	public void recebeDano(int quantidadeDano, Scanner ler) {
		
		System.out.print("Digite a quantidade de Dano: ");
		quantidadeDano = ler.nextInt();
		ler.nextLine();
		
		setHp(getHp() - quantidadeDano);
		
	}
	
	public void ataca(Lutador jose, Habilidades magia) {
		
		double moeda = Math.random();
		double media = 0.5;
		
		if (moeda > media) {
			
			System.out.println("It's Super effective");
			getHabilidade().setDanoMagia(getHabilidade().getDanoMagia() * 2);
			
		}
		
		if (getSp() < getHabilidade().getCustoMana()) {
			
			System.out.println("nao foi possivel usar " + getHabilidade().getNomeMagia());
			
		} else {
			
			System.out.println(getNome() + " atacou " + jose.getNome());
			System.out.println(getNome() + " atacou com a magia " + getHabilidade().getNomeMagia());
			
			jose.setHp(jose.getHp() - getHabilidade().getDanoMagia());
			setSp(getSp() - getHabilidade().getCustoMana());
			
		}
		
		if (jose.getHp() > 0) {
			
			System.out.println(jose.getNome() + " tem " + jose.getHp() + " de vida.");
			
		} else {
			
			System.out.println(jose.getNome() + " esta desmaiado(a).");
		}
	}
	
	public void cura() {
		
		if (getSp() > 3) {
			
			setHp(getHp() + 10); 
			setSp(getSp() - 3);
			
		}
	}
}
