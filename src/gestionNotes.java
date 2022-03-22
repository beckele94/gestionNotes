import java.util.*;

public class gestionNotes {

	public static void main(String[] args) {
		
		//Affiche la liste des etudiants puis le prenom du premier
		ArrayList<Etudiant> es = OutilsStringToObject.recupererLesEtudiants("files/etudiants.tsv");
		System.out.println(es);
		System.out.println(es.get(0).prenomEtudiant);
		
		//Affiche la liste des matieres puis le libelle de la premiere
		ArrayList<Matiere> ms = OutilsStringToObject.recupererLesMatieres("files/matieres.tsv");
		System.out.println(ms);
		System.out.println(ms.get(0).libelleMatiere);
		
		//Affiche la liste des devoirs puis le libelle de la matiere du premier devoir
		ArrayList<Devoir> ds = OutilsStringToObject.recupererLesDevoirs("files/devoirs.tsv", ms);
		System.out.println(ds);
		System.out.println(ds.get(0).matiere.libelleMatiere);
		
		//Affiche la liste des notes puis le libelle de la matiere et le prenom de l'étudiant de la premiere note
		ArrayList<Note> ns = OutilsStringToObject.recupererLesNotes("files/notes.tsv", ds, es);
		System.out.println(ns);
		System.out.println(ns.get(0).devoir.libelleDevoir);
		System.out.println(ns.get(0).etudiant.prenomEtudiant);
	}
}

