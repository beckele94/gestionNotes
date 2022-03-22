public class Note {
	String idNote;
	float note;
	Devoir devoir;
	Etudiant etudiant;
	
	public Note(String id, String note, Devoir devoir, Etudiant etudiant) {
		this.idNote = id;
		this.note = Float.parseFloat(note);
		this.devoir = devoir;
		this.etudiant = etudiant;	
	}
}
