package exercicio3;

public class Habilidades {
	private String nomeMagia;
	private String tipoMagia;
	private int danoMagia;
	private int custoMana;
	
	public Habilidades(String nomeMagia, int danoMagia, int custoMana, String tipoMagia) {
		this.nomeMagia = nomeMagia;
		this.danoMagia = danoMagia;
		this.custoMana = custoMana;
		this.tipoMagia = tipoMagia;
	}
	
	public int getCustoMana() {
		return custoMana;
	}
	
	public void setCustoMana(int custoMana) {
		this.custoMana = custoMana;
	}
	
	public int getDanoMagia() {
		return danoMagia;
	}
	
	public void setDanoMagia(int danoMagia) {
		this.danoMagia = danoMagia;
	}
	
	public String getNomeMagia() {
		return nomeMagia;
	}
	
	public void setNomeMagia(String nomeMagia) {
		this.nomeMagia = nomeMagia;
	}
	
	public String getTipoMagia() {
		return tipoMagia;
	}

	public void setTipoMagia(String tipoMagia) {
		this.tipoMagia = tipoMagia;
	}

	public String toString() {
		return "Habilidades [nomeMagia=" + nomeMagia + ", tipoMagia="
				+ tipoMagia + ", danoMagia=" + danoMagia + ", custoMana="
				+ custoMana + "]";
	}
}
