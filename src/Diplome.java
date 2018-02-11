import java.util.ArrayList;
import java.util.List;

public class Diplome {
	
	private List<Examen> 	examens = new ArrayList<Examen>();
	private float			avg = 0;
	
	private int getAverage() {
		int notes = 0;
		for (Examen examen : this.examens) {
			notes += examen.getNote();
		}
		return (notes / this.examens.size());
	}
	
	public boolean isValide() {
		return (this.avg > 10);
	}
	
	public void addExamen(Examen... examens) {
		for (Examen examen : examens) {
			this.examens.add(examen);
		}
		this.avg = this.getAverage();
	}
	
	public Mention getMention() {
		if (this.avg >= 10 && this.avg < 12) {
			return Mention.PASSABLE;
		} else if (this.avg >= 12 && this.avg < 14) {
			return Mention.BIEN;
		} else if (this.avg >= 14 && this.avg < 16) {
			return Mention.TRES_BIEN;
		} else if (this.avg >= 16) {
			return Mention.EXCELLENT;
		}
		return null;
	}
	
	private void afficherDetailDesNotes() {
		String str = "Diplome(\n";
		for (Examen examen : this.examens) {
			str += "\t" + examen + ",\n";
		}
		str += ")";
		System.out.println(str);
	}
	
	@Override
	public String toString() {
		return "Diplome[Moyenne: " + this.avg + ", Valide: " + this.isValide() +
				", Mention; " + this.getMention() + "]";
	}
	
	public static void main(String[] args) {
		Diplome diplome = new Diplome();
		Controle controle = new Controle();
		Projet projet = new Projet();
		Qcm qcm = new Qcm(10);
		
		controle.setNote(10);
		projet.setNote(6, 10);
		qcm.setReponsesCorrectes(5);
		diplome.addExamen(controle, projet, qcm);
		System.out.println(diplome);
		diplome.afficherDetailDesNotes();
	}

}
