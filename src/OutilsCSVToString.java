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
			Scanner scanner = new Scanner(new File(this.nomFichier));
			
			while(scanner.hasNextLine()) {
				this.lesDonnees += scanner.nextLine() + "\n";
			}
			scanner.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return this.lesDonnees;
	}

	
	public String extraireValeur(int numLigne, int numColonne) {
		String[] lignes = this.lesDonnees.split("\n");
		String[] cellules = lignes[numLigne].split("\t");
		return cellules[numColonne];
	}
	
	public int nbLignes() {
		String[] lignes = this.lesDonnees.split("\n");
		return lignes.length;
	}
}

