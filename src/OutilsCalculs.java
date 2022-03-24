import java.util.*;

public class OutilsCalculs {
	
	//Retourne la moyenne des notes obtenues au devoir passé en parametre
	public static float moyenneDevoir(ArrayList<Note> lesNotes, Devoir leDevoir) {
		float moyenne = 0;
		int cpt = 0;
		
		for(int i = 0; i < lesNotes.size(); i++) {
			if(lesNotes.get(i).devoir == leDevoir) {
				moyenne += lesNotes.get(i).note;
				cpt++;
			}
		}
		return moyenne / cpt;
	}
	
	//Retourne la moyenne des notes de la matiere passee en parametre
	public static float moyenneMatiere(ArrayList<Note> lesNotes, Matiere laMatiere) {
		float moyenne = 0;
		float coef = 0;
		float sommeCoef = 0;
		
		for(int i = 0; i < lesNotes.size(); i++) {
			if(lesNotes.get(i).devoir.matiere == laMatiere) {
				coef = lesNotes.get(i).devoir.coefDevoir;
				sommeCoef += coef;
				moyenne += lesNotes.get(i).note * coef;
			}
		}
		return moyenne / sommeCoef;
	}
	
	//Retourne la moyenne des notes obtenues par l'etudiant "e" dans la matiere "m"
	public static float moyenneEtudiantMatiere(ArrayList<Note> lesNotes, Matiere laMatiere, Etudiant lEtudiant) {
		float moyenne = 0;
		float coef = 0;
		float sommeCoef = 0;
		
		for(int i = 0; i < lesNotes.size(); i++) {
			if(lesNotes.get(i).devoir.matiere == laMatiere && lesNotes.get(i).etudiant == lEtudiant) {
				coef = lesNotes.get(i).devoir.coefDevoir;
				sommeCoef += coef;
				moyenne += lesNotes.get(i).note * coef;
			}
		}
		return moyenne / sommeCoef;
	}
	
	//Retourne la moyenne generale de l'etudiant passé en parametre
	public static float moyenneEtudiant(ArrayList<Note> lesNotes, ArrayList<Matiere> lesMatieres, Etudiant lEtudiant) {
		float moyenne = 0;
		float coef = 0;
		float sommeCoef = 0;
		
		for(int i = 0; i < lesMatieres.size(); i++) {
			coef = lesMatieres.get(i).coeffMatiere;
			sommeCoef += coef;
			moyenne += moyenneEtudiantMatiere(lesNotes, lesMatieres.get(i), lEtudiant) * coef;
		}
		return moyenne / sommeCoef;
	}
	
	//Retourne la moyenne generale de la classe
	public static float moyenne(ArrayList<Note> lesNotes, ArrayList<Matiere> lesMatieres, ArrayList<Etudiant> lesEtudiants) {
		float moyenne = 0;
		int cpt = 0;
		
		for(int i = 0; i < lesEtudiants.size(); i++) {
			cpt++;
			moyenne += moyenneEtudiant(lesNotes, lesMatieres, lesEtudiants.get(i));
		}
		return moyenne / cpt;
	}
	
	//Retourne l'etudiant qui a obtenu la moyenne générale la plus faible
	public static Etudiant etudiantMoyenneMini(ArrayList<Note> lesNotes, ArrayList<Etudiant> lesEtudiants, ArrayList<Matiere> lesMatieres) {
		Etudiant etudiantMini = lesEtudiants.get(0);
		
		for(int i = 0; i < lesEtudiants.size(); i++) {
			if(moyenneEtudiant(lesNotes, lesMatieres, etudiantMini) > moyenneEtudiant(lesNotes, lesMatieres, lesEtudiants.get(i))) {
				etudiantMini = lesEtudiants.get(i);
//			} else if(moyenneEtudiant(lesNotes, lesMatieres, etudiantMini) == moyenneEtudiant(lesNotes, lesMatieres, lesEtudiants.get(i))) {
//				System.out.println("Erreur : la moyenne minimum désigne au moins deux étudiants !");
			}
		}
		return etudiantMini;
	}
	
	//Retourne l'etudiant qui a obtenu la moyenne générale la plus élevée
	public static Etudiant etudiantMoyenneMaxi(ArrayList<Note> lesNotes, ArrayList<Etudiant> lesEtudiants, ArrayList<Matiere> lesMatieres) {
		Etudiant etudiantMaxi = lesEtudiants.get(0);
			
		for(int i = 0; i < lesEtudiants.size(); i++) {
			if(moyenneEtudiant(lesNotes, lesMatieres, etudiantMaxi) < moyenneEtudiant(lesNotes, lesMatieres, lesEtudiants.get(i))) {
				etudiantMaxi = lesEtudiants.get(i);
//			} else if(moyenneEtudiant(lesNotes, lesMatieres, etudiantMini) == moyenneEtudiant(lesNotes, lesMatieres, lesEtudiants.get(i))) {
//				System.out.println("Erreur : la moyenne minimum désigne au moins deux étudiants !");
			}
		}
		return etudiantMaxi;
	}
	
	//Retourne l'etudiant qui a obtenu la moyenne la plus faible dans la matiere passée en parametre
	public static Etudiant etudiantMoyenneMatiereMini(ArrayList<Note> lesNotes, ArrayList<Etudiant> lesEtudiants, Matiere laMatiere) {
		Etudiant etudiantMini = lesEtudiants.get(0);
		
		for(int i = 0; i < lesEtudiants.size(); i++) {
			if(moyenneEtudiantMatiere(lesNotes, laMatiere, etudiantMini) > moyenneEtudiantMatiere(lesNotes, laMatiere, lesEtudiants.get(i))) {
				etudiantMini = lesEtudiants.get(i);
			}
		}
		return etudiantMini;
	}
	
	//Retourne l'etudiant qui a obtenu la moyenne la plus élevée dans la matiere passée en parametre
	public static Etudiant etudiantMoyenneMatiereMaxi(ArrayList<Note> lesNotes, ArrayList<Etudiant> lesEtudiants, Matiere laMatiere) {
		Etudiant etudiantMaxi = lesEtudiants.get(0);
			
		for(int i = 0; i < lesEtudiants.size(); i++) {
			if(moyenneEtudiantMatiere(lesNotes, laMatiere, etudiantMaxi) > moyenneEtudiantMatiere(lesNotes, laMatiere, lesEtudiants.get(i))) {
				etudiantMaxi = lesEtudiants.get(i);
			}
		}
		return etudiantMaxi;
	}

	//Retourne l'étudiant qui a obtenu la note la plus faible dans le devoir passé en paramètre
	public static Etudiant etudiantNoteDevoirMini(ArrayList<Note> lesNotes, Devoir leDevoir) {
		Etudiant etudiantMini = null;
		float noteMiniFloat = 20;
		
		for(int i = 0; i < lesNotes.size(); i++) {
			if(lesNotes.get(i).devoir == leDevoir) {
				if(noteMiniFloat >= lesNotes.get(i).note) {
					noteMiniFloat = lesNotes.get(i).note;
					etudiantMini = lesNotes.get(i).etudiant;
				}
			}
		}
		return etudiantMini;
	}
	
	//Retourne l'étudiant qui a obtenu la note la plus élevée dans le devoir passé en paramètre
	public static Etudiant etudiantNoteDevoirMaxi(ArrayList<Note> lesNotes, Devoir leDevoir) {
		Etudiant etudiantMaxi = null;
		float noteMiniFloat = 0;
		
		for(int i = 0; i < lesNotes.size(); i++) {
			if(lesNotes.get(i).devoir == leDevoir) {
				if(noteMiniFloat <= lesNotes.get(i).note) {
					noteMiniFloat = lesNotes.get(i).note;
					etudiantMaxi = lesNotes.get(i).etudiant;
				}
			}
		}
		return etudiantMaxi;
	}

	//Retourne la note de l'étudiant passé en parametre dans le devoir passé lui aussi en parametre
	public static float rechercherNoteDevoirEtudiant(ArrayList<Note> lesNotes, Devoir leDevoir, Etudiant lEtudiant) {
		for(int i = 0; i < lesNotes.size(); i++) {
			if(lesNotes.get(i).devoir == leDevoir && lesNotes.get(i).etudiant == lEtudiant) {
				return lesNotes.get(i).note;
			}
		}
		return -1;
	}
}
