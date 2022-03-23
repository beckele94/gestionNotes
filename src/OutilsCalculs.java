import java.util.*;

//prendre en compte les coef !!!

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
}
