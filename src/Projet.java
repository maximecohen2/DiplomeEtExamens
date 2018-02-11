
public class Projet extends Examen {

	private String appreciationOral;

	public void setNote(int noteEcrite, int noteOrale) {
		this.note = noteEcrite + noteOrale;
	}
	
	public void setAppreciation(String appreciationEcrit, String appreciationOral) {
		super.setAppreciation(appreciationEcrit);
		this.appreciationOral = appreciationOral;
	}
	
	@Override
	public String toString() {
		return "Projet[Note: " + super.getNote() + ", Appréciation Ecrite: " + super.getAppreciation() +
				", Appréciation Oral: " + this.appreciationOral + "]";
	}
}
