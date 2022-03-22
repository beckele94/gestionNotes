
public class gestionNotes {

	public static void main(String[] args) {
		OutilsCSVToString FichierEtudiant = new OutilsCSVToString("files/matieres.tsv");
		
		System.out.println(FichierEtudiant.chargerDepuisFichier());
		System.out.println(FichierEtudiant.extraireValeur(2, 1));
		System.out.println(FichierEtudiant.nbLignes());

	}
}

