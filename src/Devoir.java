public class Devoir {
	String idDevoir;
	String libelleDevoir;
	float coefDevoir;
	Matiere matiere;
	
	public Devoir(String id, String libelle, String coef, Matiere mat) {
		this.idDevoir = id;
		this.libelleDevoir = libelle;
		this.coefDevoir = Float.parseFloat(coef);
		this.matiere = mat;
	}
	
	@Override
	public String toString() {
		return libelleDevoir + "(" + coefDevoir + ")";
	}
}
