import java.io.*;
import java.util.Scanner;

public class OutilsCSVToString {
	String nomFichier;
	String lesDonnees;
	
	public OutilsCSVToString(String nomFichier) {
		this.nomFichier = nomFichier;
		this.lesDonnees = "";
	}

	public String chargerDepuisFichier() {
		try {
			//FileInputStream file = new FileInputStream(nomFichier);
			Scanner scanner = new Scanner(new File(nomFichier));
			
			while(scanner.hasNextLine()) {
				lesDonnees += scanner.nextLine() + "\n";
			}
			scanner.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return lesDonnees;
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

