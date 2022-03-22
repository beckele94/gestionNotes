public class Matiere {
	String idMatiere;
	String libelleMatiere;
	float coeffMatiere;
	
	@Override
	public String toString() {
		return libelleMatiere + "(" + coeffMatiere + ")";
	}
}
