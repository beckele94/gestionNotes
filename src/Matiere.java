public class Matiere {
	String idMatiere;
	String libelleMatiere;
	float coeffMatiere;
	
	public Matiere(String id, String libelle, String coeff) {
		this.idMatiere = id;
		this.libelleMatiere = libelle;
		this.coeffMatiere = Float.parseFloat(coeff);
	}
	
	@Override
	public String toString() {
		return libelleMatiere + "(" + coeffMatiere + ")";
	}
}
