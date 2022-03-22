public class Etudiant {
	String idEtudiant;
	String nomEtudiant;
	String prenomEtudiant;
	
	@Override
	public String toString() {
		return nomEtudiant+" "+prenomEtudiant;
	}
}
