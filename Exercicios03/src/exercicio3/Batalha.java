package exercicio3;


public class Batalha {
	
	public void usaHabilidade(Habilidades habilidade) {
		
		System.out.println("Gastou " + habilidade.getCustoMana() + " de energia. " + habilidade.getNomeMagia() +  " causa " + habilidade.getDanoMagia() + " de dano e de tipo " + habilidade.getTipoMagia() + "." );
		
	}
	
	public static void main(String[] args) {
		
        Habilidades bolaDeFogo = new Habilidades("Bola de Fogo",60,5,"Gelo");
        Habilidades raioDeGelo = new Habilidades("Raio de Gelo",50,3,"Fogo");
        Habilidades chuteAtomico= new Habilidades("Chute Atomico",35,4, "Físico");
        
        Batalha m = new Batalha();
		
        m.usaHabilidade(bolaDeFogo);
        m.usaHabilidade(raioDeGelo);
        m.usaHabilidade(chuteAtomico);
        
	}
}
