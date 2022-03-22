/* 
 * Supprimer les nfr, nfm, nfd ? charger le fichier dans le constructeur 
 * Acun interet de creer des methodes getEtudiantById, etc.. car deja possible de faire recuperLesEtudiants().get(id) ????
 * 
 * */

import java.util.*;

public class OutilsStringToObject {
	
	//Construit et retourne une liste d'étudiant à partir du fichier dont le nom est passé en paramètre :
	public static ArrayList<Etudiant> recupererLesEtudiants(String nfr){
		ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>();
		OutilsCSVToString fichierEtudiant = new OutilsCSVToString(nfr);
		
		for(int i = 0; i < fichierEtudiant.nbLignes(); i++) {
			Etudiant etudiant = new Etudiant(fichierEtudiant.extraireValeur(i, 0), fichierEtudiant.extraireValeur(i, 1), fichierEtudiant.extraireValeur(i, 2));
			listeEtudiants.add(etudiant);
		}
		return listeEtudiants;
	}
	
	//Construit et retourne une liste de matière à partir du fichier dont le nom est passé en paramètre :
	public static ArrayList<Matiere> recupererLesMatieres(String nfm){
		ArrayList<Matiere> listeMatieres = new ArrayList<Matiere>();
		OutilsCSVToString fichierMatiere = new OutilsCSVToString(nfm);
		
		for(int i = 0; i < fichierMatiere.nbLignes(); i++) {
			Matiere matiere = new Matiere(fichierMatiere.extraireValeur(i, 0), fichierMatiere.extraireValeur(i, 1), fichierMatiere.extraireValeur(i, 2));
			listeMatieres.add(matiere);
		}
		return listeMatieres;
	}
	
	//Construit et retourne une liste de devoir à partir du fichier dont le nom est passé en paramètre :
	public static ArrayList<Devoir> recupererLesDevoirs(String nfd, ArrayList<Matiere> lesMatieres){
		ArrayList<Devoir> listeDevoirs = new ArrayList<Devoir>();
		OutilsCSVToString fichierDevoir = new OutilsCSVToString(nfd);
		
		for(int i = 0; i < fichierDevoir.nbLignes(); i++) {
			Devoir devoir = new Devoir(fichierDevoir.extraireValeur(i, 0), fichierDevoir.extraireValeur(i, 1), fichierDevoir.extraireValeur(i, 2), lesMatieres.get(Integer.parseInt(fichierDevoir.extraireValeur(i, 3))));
			listeDevoirs.add(devoir);
		}
		return listeDevoirs;
	}
	
	//Construit et retourne une liste de note à partir du fichier dont le nom est passé en paramètre :
	public static ArrayList<Note> recupererLesNotes(String nfn, ArrayList<Devoir> lesDevoirs, ArrayList<Etudiant> lesEtudiants){
		ArrayList<Note> listeNotes = new ArrayList<Note>();
		OutilsCSVToString fichierNote = new OutilsCSVToString(nfn);
		
		for(int i = 0; i < fichierNote.nbLignes(); i++) {
			Note note = new Note(fichierNote.extraireValeur(i, 0), fichierNote.extraireValeur(i, 1), lesDevoirs.get(Integer.parseInt(fichierNote.extraireValeur(i, 2))), lesEtudiants.get(Integer.parseInt(fichierNote.extraireValeur(i, 3))));
			listeNotes.add(note);
		}
		return listeNotes;
	}
}
