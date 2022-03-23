import java.io.*;
import java.util.Scanner;

public class OutilsCSVToString {
	String lesDonnees;
	
	public OutilsCSVToString(String nomFichier) {
		this.lesDonnees = "";
		
		try {
			//FileInputStream file = new FileInputStream(nomFichier);
			Scanner scanner = new Scanner(new File(nomFichier));
			
			while(scanner.hasNextLine()) {
				this.lesDonnees += scanner.nextLine() + "\n";
			}
			scanner.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String extraireValeur(int numLigne, int numColonne) {
		String[] lignes = lesDonnees.split("\n");
		String[] cellules = lignes[numLigne].split("\t");
		return cellules[numColonne];
	}
	
	public int nbLignes() {
		String[] lignes = lesDonnees.split("\n");
		return lignes.length;
	}
}

