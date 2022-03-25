import java.awt.EventQueue;
import java.awt.Frame;
import java.util.*;

public class gestionNotes {

	public static void main(String[] args) {
		
		ArrayList<Etudiant> es = OutilsStringToObject.recupererLesEtudiants("files/etudiants.tsv");
		ArrayList<Matiere> ms = OutilsStringToObject.recupererLesMatieres("files/matieres.tsv");
		ArrayList<Devoir> ds = OutilsStringToObject.recupererLesDevoirs("files/devoirs.tsv", ms);
		ArrayList<Note> ns = OutilsStringToObject.recupererLesNotes("files/notes.tsv", ds, es);
		
		//Lance la fenetre
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre(es, ms, ds, ns);
					frame.setVisible(true);
					
					//Rafraichit les JCombos
					frame.rafraichirJCombos(ms, ds, es);
					
					//Rafraichit le panel général
					frame.rafraichirPanelGeneral(ns, ms, es);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

