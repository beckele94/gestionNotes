public class Etudiant {
	String idEtudiant;
	String nomEtudiant;
	String prenomEtudiant;
	
	public Etudiant(String id, String nom, String prenom) {
		this.idEtudiant = id;
		this.nomEtudiant = nom;
		this.prenomEtudiant = prenom;
	}
	
	@Override
	public String toString() {
		return nomEtudiant+" "+prenomEtudiant;
	}
}