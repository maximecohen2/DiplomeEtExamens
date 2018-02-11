
public class Controle extends Examen {
	
	public void setNote(int note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "Controle[Note: " + super.getNote() + "]";
	}
}
