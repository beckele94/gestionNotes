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
		
		//Affiche la moyenne du premier devoir
		System.out.println(OutilsCalculs.moyenneDevoir(ns, ds.get(0)));
		
		//Affiche la moyenne de la premiere matiere
		System.out.println(OutilsCalculs.moyenneMatiere(ns, ms.get(0)));
		
		//Affiche la moyenne du premier etudiant dans la premiere matiere 
		System.out.println(OutilsCalculs.moyenneEtudiantMatiere(ns, ms.get(0), es.get(0)));
		
		//Affiche la moyenne generale du premier etudiant
		System.out.println(OutilsCalculs.moyenneEtudiant(ns, ms, es.get(0)));
		
		//Affiche la moyenne de la classe 
		System.out.println(OutilsCalculs.moyenne(ns, ms, es));
		
		//Affiche le prenom de l'étudiant qui a la plus faible moyenne générale puis la valeur
		System.out.println(OutilsCalculs.etudiantMoyenneMini(ns, es, ms).prenomEtudiant);
		System.out.println(OutilsCalculs.moyenneEtudiant(ns, ms, OutilsCalculs.etudiantMoyenneMini(ns, es, ms)));
		
		//Affiche le prenom de l'étudiant qui a la moyenne générale la plus élevée puis la valeur
		System.out.println(OutilsCalculs.etudiantMoyenneMaxi(ns, es, ms).prenomEtudiant);
		System.out.println(OutilsCalculs.moyenneEtudiant(ns, ms, OutilsCalculs.etudiantMoyenneMaxi(ns, es, ms)));
		
		//Affiche le prenom de l'étudiant qui a la moyenne la plus faible dans la premiere matière puis la valeur
		System.out.println(OutilsCalculs.etudiantMoyenneMatiereMini(ns, es, ms.get(0)).prenomEtudiant);
		System.out.println(OutilsCalculs.moyenneEtudiantMatiere(ns, ms.get(0), OutilsCalculs.etudiantMoyenneMatiereMini(ns, es, ms.get(0))));
		
		//Affiche le prenom de l'étudiant qui a la note la plus faible au premier devoir puis la valeur
		System.out.println(OutilsCalculs.etudiantNoteDevoirMini(ns, ds.get(0)));
		System.out.println(OutilsCalculs.rechercherNoteDevoirEtudiant(ns, ds.get(0), OutilsCalculs.etudiantNoteDevoirMini(ns, ds.get(0))));
		
		//Affiche le prenom de l'étudiant qui a la note la plus élevée au premier devoir puis la valeur
		System.out.println(OutilsCalculs.etudiantNoteDevoirMaxi(ns, ds.get(0)));
		System.out.println(OutilsCalculs.rechercherNoteDevoirEtudiant(ns, ds.get(0), OutilsCalculs.etudiantNoteDevoirMaxi(ns, ds.get(0))));
		
		//Affiche la note du premier devoir du premier etudiant
		System.out.println(OutilsCalculs.rechercherNoteDevoirEtudiant(ns, ds.get(0), es.get(0)));
	}
}

