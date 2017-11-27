import java.util.ArrayList;
import java.util.List;

public class Diplome {

	private List<Examen> 	examens = new ArrayList<Examen>();
	
	public boolean	isValide() {
		int notes = 0;
		for (Examen examen : this.examens) {
			notes += examen.getNote();
		}
		return ((notes / this.examens.size() > 10) ? true : false);
	}
	
	public void addExamen(Examen... examens) {
		for (Examen examen : examens) {
			this.examens.add(examen);
		}
	}
	
	private void afficherDetailDesNotes() {
		for (Examen examen : this.examens) {
			System.out.println(examen);
		}
	}
	
	public static void main(String[] args) {
		Diplome diplome = new Diplome();
		Examen examen = new Examen();
		Projet projet = new Projet();
		Qcm qcm = new Qcm(10);
		
		examen.setNote(19);
		projet.setNote(6, 10);
		qcm.setNote(9);
		diplome.addExamen(examen, projet, qcm);
		System.out.println(diplome.isValide());
		diplome.afficherDetailDesNotes();
	}

}
