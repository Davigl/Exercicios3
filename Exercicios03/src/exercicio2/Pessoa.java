package exercicio2;

public class Pessoa {
	private String nome;
	private double saldo;
	
	public Pessoa(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "" + getNome() + "" + getSaldo();
	}
}
	
