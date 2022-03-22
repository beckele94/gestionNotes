public class Devoir {
	String idDevoir;
	String libelleDevoir;
	float coefDevoir;
	Matiere matiere;
	
	@Override
	public String toString() {
		return libelleDevoir + "(" + coefDevoir + ")";
	}
}
