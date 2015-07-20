package exercicio4;

public class Pessoa {
	private String nome;
	private int mes;
	
	public Pessoa(String nome, int mes) {
		this.nome = nome;
		this.mes = mes;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "" + getNome() + "" + getMes();
	}
}
