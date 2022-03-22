
public class gestionNotes {

	public static void main(String[] args) {
		
		//Affiche la liste des etudiants puis le prenom du premier
		System.out.println(OutilsStringToObject.recupererLesEtudiants("files/etudiants.tsv"));
		System.out.println(OutilsStringToObject.recupererLesEtudiants("files/etudiants.tsv").get(0).prenomEtudiant);
		
		//Affiche la liste des matieres puis le libelle de la premiere
		System.out.println(OutilsStringToObject.recupererLesMatieres("files/matieres.tsv"));
		System.out.println(OutilsStringToObject.recupererLesMatieres("files/matieres.tsv").get(0).libelleMatiere);
		
		//Affiche la liste des devoirs puis le libelle de la matiere du premier devoir
		System.out.println(OutilsStringToObject.recupererLesDevoirs("files/devoirs.tsv", OutilsStringToObject.recupererLesMatieres("files/matieres.tsv")));
		System.out.println(OutilsStringToObject.recupererLesDevoirs("files/devoirs.tsv", OutilsStringToObject.recupererLesMatieres("files/matieres.tsv")).get(0).matiere.libelleMatiere);
		
		//Affiche la liste des notes puis le libelle de la matiere et le prenom de l'étudiant de la premiere note
		System.out.println(OutilsStringToObject.recupererLesNotes("files/notes.tsv", OutilsStringToObject.recupererLesDevoirs("files/devoirs.tsv", OutilsStringToObject.recupererLesMatieres("files/matieres.tsv")), OutilsStringToObject.recupererLesEtudiants("files/etudiants.tsv")));
		System.out.println(OutilsStringToObject.recupererLesNotes("files/notes.tsv", OutilsStringToObject.recupererLesDevoirs("files/devoirs.tsv", OutilsStringToObject.recupererLesMatieres("files/matieres.tsv")), OutilsStringToObject.recupererLesEtudiants("files/etudiants.tsv")).get(0).devoir.libelleDevoir);
		System.out.println(OutilsStringToObject.recupererLesNotes("files/notes.tsv", OutilsStringToObject.recupererLesDevoirs("files/devoirs.tsv", OutilsStringToObject.recupererLesMatieres("files/matieres.tsv")), OutilsStringToObject.recupererLesEtudiants("files/etudiants.tsv")).get(0).etudiant.prenomEtudiant);

	}
}

